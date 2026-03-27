package main;

import Entity.Character;
import Entity.Enemy;

import java.util.*;

public class AdventureBattleSystem {
    private static final Scanner scan = new Scanner(System.in);
    private static final Random rand = new Random();

    public boolean startBattle(Character hero, Enemy[] enemies) {

        displayStartBattle();
        int currentEnemyIndex = 0;

        while(currentEnemyIndex < enemies.length) {
            Enemy enemy = enemies[currentEnemyIndex];
            resetHealth(hero, enemy);

            displayCharacters(enemy);
            //Battle
            boolean heroDied = alive(hero, enemy);

            if(heroDied) {
                return false;
            }
            currentEnemyIndex++;

            if (currentEnemyIndex < enemies.length) {
                System.out.println("\n                                                                                ➡️ Moving to the next enemy...\n");
            }
        }
        System.out.println("                                                                                🏆 You cleared all enemies!");
        return  true;
    }








    // ==================================== Player turns ======================================

    public static boolean playerTurn(Character hero, Enemy enemy) {
        int action = getValidSkillChoice(hero);
        int damage = hero.useSkill(action);

        if (damage > 0) {
            System.out.println("\n                                                                                ⚔️ " + hero.getName() + " used skill " + action + "! Deals " + damage + " damage!");
        }
        enemy.takeDamage(damage);

        // dead: enemy
        if(enemy.getHp() <= 0) {
            System.out.println("                                                                                ☠️ " + enemy.getClass().getSimpleName() + " has been defeated!");
            return true;
        }
        return false;
    }
    // ==================================== Enemy turns =======================================
    public static boolean enemyTurn(Character hero, Enemy enemy) {
        enemyAttack(hero, enemy);

        // dead: hero
        if (!hero.isAlive()) {
            System.out.println("\n                                                                                💀 You were defeated... Please try again...");
            return true;
        }
        return false;
    }

    //================================== METHODS =========================================

    public static boolean alive(Character hero, Enemy enemy) {
        while(hero.isAlive() && enemy.getHp() > 0) {
            displayBattleStatus(hero, enemy);

            if(playerTurn(hero, enemy)) return false;
            if(enemyTurn(hero, enemy)) return true;

            reduceCooldowns(hero);
        }
        return false;
    }
    private static void resetHealth(Character hero, Enemy enemy) {
        hero.resetHp();
        enemy.resetHp();
    }

    private static int getValidSkillInput() {
        while (true) {
            try {
                int input = Integer.parseInt(scan.nextLine().trim());
                if (input >= 1 && input <= 3) return input;
                System.out.print("                                                                                ❌ Invalid choice. Enter (1–3): ");
            } catch (Exception e) {
                System.out.print("                                                                               ❌ Please enter a number (1–3): ");
            }
        }
    }

    private static int getValidSkillChoice(Character hero) {
        while (true) {
            hero.displaySkills();
            System.out.print("                                                                                Enter choice (1–3): ");

            int choice = getValidSkillInput();

            if (isSkillReady(hero, choice)) {
                return choice;
            } else {
                System.out.println("                                                                                ❌ That skill is still on cooldown! Please choose another skill.\n");
            }
        }
    }

    private static boolean isSkillReady(Character c, int skill) {
        return switch (skill) {
            case 1 -> c.cd1 == 0;
            case 2 -> c.cd2 == 0;
            case 3 -> c.cd3 == 0;
            default -> false;
        };
    }

    private static void enemyAttack(Character hero, Enemy enemy) {
        System.out.println("                                                                                ⚠️ The enemy prepares to strike back!");

        int maxSkill = enemy.getSkillCount();
        int enemyAction = rand.nextInt(maxSkill) + 1;

        int enemyDamage = switch (enemyAction) {
            case 1 -> enemy.skill1();
            case 2 -> enemy.skill2();
            case 3 -> enemy.skill3();
            default -> 0;
        };

        if (enemyDamage > 0) {
            hero.takeDamage(enemyDamage);
        }
    }

    private static void reduceCooldowns(Character c) {
        if (c.cd1 > 0) c.cd1--;
        if (c.cd2 > 0) c.cd2--;
        if (c.cd3 > 0) c.cd3--;
    }

    //================================ DISPLAY METHODS ===================================

    public static void displayStartBattle() {
        System.out.println("\n");
        System.out.println("                                                                             ╔══════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                                                                                  ⚔️  B A T T L E   S T A R T !  ⚔️                 ");
        System.out.println("                                                                             ╚══════════════════════════════════════════════════════════════════════╝");
        System.out.println("                                                                        ----------------------------------------------------------------------------------");
    }
    public static void displayBattleStatus(Character hero, Enemy enemy) {
        System.out.println("                                                                        ┌────────────────────────────────────────────────────────────────────────────────┐");
        System.out.println("                                                                                                💚 Your HP: " + hero.getHp() + " | 💢 Enemy HP: " + enemy.getHp());
        System.out.println("                                                                        └────────────────────────────────────────────────────────────────────────────────┘");
    }
    public static void displayCharacters(Enemy enemy) {
        System.out.println("                                                                                You encountered:");
        enemy.displayEnemy();
        System.out.println();
        enemy.displaySkills();
    }
}

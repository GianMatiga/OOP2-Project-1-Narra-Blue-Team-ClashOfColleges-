package main;
import Entity.*;
import Entity.Character;

import java.util.*;

public class BattleSystem {

    private static final Scanner scan = new Scanner(System.in);
    private static final Random rand = new Random();

    public static void startShowdown() {
        Character player = chooseCharacter();
        Character cpu = getRandomOpponent(player);

        player.resetHp();
        cpu.resetHp();

        System.out.println("\n");
        System.out.println("                                                                                ┌──────────────────────────────────────────────────────────────────┐");
        System.out.println("                                                                                                 ⚔️ " + player.getName() + "        VS        " + cpu.getName() + " ⚔️");
        System.out.println("                                                                                └──────────────────────────────────────────────────────────────────┘");
        System.out.print("                                                                          --------------------------------------------------------------------------------");

        int round = 1;

        List<String> battleLog = new ArrayList<>();

        while (player.isAlive() && cpu.isAlive()) {
            System.out.println("\n");
            System.out.println("                                                                                ╔══════════════════════════════════════════════════════════════════╗");
            System.out.println("                                                                                ║                            ROUND " + round + "                               ║");
            System.out.println("                                                                                ╚══════════════════════════════════════════════════════════════════╝");
            System.out.println("                                                                                ┌──────────────────────────────────────────────────────────────────┐");
            System.out.println("                                                                                            " + player.getName() + " HP: " + player.getHp() + "        VS        " + cpu.getName() + " HP: " + cpu.getHp());
            System.out.println("                                                                                └──────────────────────────────────────────────────────────────────┘");

            // === Player Turn ===
            System.out.println("\n");

            System.out.println("                                                                                🎯 Your turn! Choose a skill:");
            int choice = getValidSkillChoice(player);

            int playerDamage = player.useSkill(choice);
            cpu.takeDamage(playerDamage);
            battleLog.add("                                                                                   🧍 " + player.getName() + " used Skill " + choice + " and dealt " + playerDamage + " damage!");


            if (!cpu.isAlive()) {
                battleLog.add("                                                                                   💀 " + cpu.getName() + " was defeated!");
                displayBattleLog(battleLog, round);
                break;
            }

            // === CPU Turn ===
            int enemyChoice = getRandomAvailableSkill(cpu);
            int enemyDamage = cpu.useSkill(enemyChoice);
            player.takeDamage(enemyDamage);
            battleLog.add("                                                                                   🤖 " + cpu.getName() + " used Skill " + enemyChoice + " and dealt " + enemyDamage + " damage!");


            // === Display Log for This Round ===
            displayBattleLog(battleLog, round);
            battleLog.clear();

            // === Cooldown Update ===
            reduceCooldowns(player);
            reduceCooldowns(cpu);

            round++;
        }


        // === Battle End ===
        //System.out.println("\n                                                                                ===== 🏁 BATTLE OVER 🏁 =====");
        System.out.println("\n");
        System.out.println("                                                                              ╔══════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                                                                                        🏁  BATTLE OVER  🏁                          ");
        System.out.println("                                                                              ╚══════════════════════════════════════════════════════════════════════╝");
        if (player.isAlive()) {
            System.out.println("                                                                                                     🎉 " + player.getName() + " wins the battle!");
        } else {
            System.out.println("                                                                                                     💀 " + cpu.getName() + " wins the battle!");
        }

        playAgain();
    }

    // ✅ Prompts user until a skill that is not in cooldown is chosen
    private static int getValidSkillChoice(Character player) {
        while (true) {
            player.displaySkills();
            System.out.print("                                                                                Enter choice (1–3): ");

            int choice = getValidSkillInput();

            if (isSkillReady(player, choice)) {
                return choice;
            } else {
                System.out.println("                                                                                ❌ That skill is still on cooldown! Please choose another skill.\n");
            }
        }
    }

    // ✅ Checks if a given skill is ready to use
    private static boolean isSkillReady(Character c, int skill) {
        return switch (skill) {
            case 1 -> c.cd1 == 0;
            case 2 -> c.cd2 == 0;
            case 3 -> c.cd3 == 0;
            default -> false;
        };
    }

    // ✅ Randomly picks an available skill for CPU (if all on cooldown, pick skill1)
    private static int getRandomAvailableSkill(Character cpu) {
        List<Integer> available = new ArrayList<>();
        if (cpu.cd1 == 0) available.add(1);
        if (cpu.cd2 == 0) available.add(2);
        if (cpu.cd3 == 0) available.add(3);

        if (available.isEmpty()) return 1;
        return available.get(rand.nextInt(available.size()));
    }

    // ✅ Reduces all cooldowns by 1 turn (but not below 0)
    private static void reduceCooldowns(Character c) {
        if (c.cd1 > 0) c.cd1--;
        if (c.cd2 > 0) c.cd2--;
        if (c.cd3 > 0) c.cd3--;
    }

    // === Character Selection ===
    private static Character chooseCharacter() {
        System.out.println("\n\n");
        System.out.println("                                                                            ╔══════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                                                            ║                           CHOOSE YOUR CHARACTER                          ║");
        System.out.println("                                                                            ╚══════════════════════════════════════════════════════════════════════════╝");

        System.out.println("                                                                            ┌──────────────────────────────────────────────────────────────────────────┐");
        System.out.println("                                                                            │  COLLEGE      │ AVAILABLE CHARACTERS                                     │");
        System.out.println("                                                                            ├──────────────────────────────────────────────────────────────────────────┤");
        System.out.println("                                                                            │  CCS          │  1. Ton         2. Jay                                   │");
        System.out.println("                                                                            │  CMBA         │  3. Josh        4. Patricia                              │");
        System.out.println("                                                                            │  CCJ          │  5. Kal-Khent                                            │");
        System.out.println("                                                                            │  CNAHS        │  6. Lanz        7. Ashley                                │");
        System.out.println("                                                                            │  CEA          │  8. Sir G       9. Ian                                   │");
        System.out.println("                                                                            │  CASE         │ 10. Jon        11. Coleen                                │");
        System.out.println("                                                                            ├──────────────────────────────────────────────────────────────────────────┤");
        System.out.println("                                                                            │  0. Exit                                                                 │");
        System.out.println("                                                                            └──────────────────────────────────────────────────────────────────────────┘");
        System.out.print("                                                                                Select Character (0–11): ");


        int choice = getValidCharacterInput();

        return switch (choice) {
            case 1 -> new Ton();
            case 2 -> new Jay();
            case 3 -> new Josh();
            case 4 -> new Patricia();
            case 5 -> new KalKhent();
            case 6 -> new Lanz();
            case 7 -> new Ashley();
            case 8 -> new SirG();
            case 9 -> new Ian();
            case 10 -> new Jon();
            case 11 -> new Coleen();
            case 0 -> {
                System.out.print("                                                                                Returning to main menu...");
                Main.main(null);
                yield null;
            }
            default -> new Ton();
        };
    }

    private static Character getRandomOpponent(Character player) {
        List<Character> allChars = new ArrayList<>(Arrays.asList(
                new Ton(), new Jay(), new Josh(), new Patricia(),
                new KalKhent(), new Lanz(), new Ashley(),
                new SirG(), new Ian(), new Jon(), new Coleen()
        ));

        allChars.removeIf(c -> c.getName().equals(player.getName()));
        return allChars.get(rand.nextInt(allChars.size()));
    }

    // === Input Validation ===
    private static int getValidSkillInput() {
        while (true) {
            try {
                int input = Integer.parseInt(scan.nextLine().trim());
                if (input >= 1 && input <= 3) return input;
                System.out.print("                                                                                Invalid choice. Enter (1–3): ");
            } catch (Exception e) {
                System.out.print("                                                                                Please enter a number (1–3): ");
            }
        }
    }

    private static int getValidCharacterInput() {
        while (true) {
            try {
                int input = Integer.parseInt(scan.nextLine().trim());
                if (input >= 0 && input <= 11) return input;
                System.out.print("\n                                                                                ❌ Invalid choice! Please enter a number (0-11): ");
            } catch (Exception e) {
                System.out.print("\n                                                                                Please enter a number (0–11): ");
            }
        }
    }

    // === Replay Logic ===
    private static void playAgain() {
        while (true) {
            try {
                System.out.print("\n                                                                          Do you want to play again? (y/n/o): ");
                String choice = scan.nextLine().trim().toLowerCase();

                if (choice.equals("y")) {
                    startShowdown();
                } else if (choice.equals("n")) {
                    System.out.println("\n                                                                          Returning to Main Menu...\n");
                    Main.main(null);
                    return;
                } else if (choice.equals("o")) {
                    System.out.println("\n                                                                          Exiting the game...");
                    System.exit(0);
                } else {
                    throw new Exception("\n                                                                          Invalid input");
                }
            } catch (Exception e) {
                System.out.println("\n                                                                          ❌ Please enter (y/n/o) only!");
            }
        }
    }
    // === BATTLE LOG DISPLAY ===
    private static void displayBattleLog(List<String> log, int round) {
        System.out.println("\n");
        System.out.println("                                                                                    ╔══════════════════════════════════════════════════════════╗");
        System.out.println("                                                                                                        📜 ROUND " + round + " SUMMARY 📜                     ");
        System.out.println("                                                                                    ╚══════════════════════════════════════════════════════════╝");
        for (String entry : log) {
            System.out.println("         " + entry);
        }
        System.out.print("\n                                                                          --------------------------------------------------------------------------------");
    }

}
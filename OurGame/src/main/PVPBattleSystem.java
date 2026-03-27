package main;
import Entity.*;
import Entity.Character;

import java.util.*;

public class PVPBattleSystem {

    private static final Scanner scan = new Scanner(System.in);

    public static void startPVP() {
        // Player 1 Selection
        System.out.println("\n                                                                                     --- PLAYER 1 SELECTION ---");
        Character p1 = chooseCharacter(1);
        if (p1 == null) return;

        // Player 2 Selection
        System.out.println("\n                                                                                     --- PLAYER 2 SELECTION ---");
        Character p2 = chooseCharacter(2);
        if (p2 == null) return;

        p1.resetHp();
        p2.resetHp();

        System.out.println("\n\n                                                                              ⚔️  P V P   M O D E   S T A R T !  ⚔️");
        System.out.println("                                                                                " + p1.getName() + " VS " + p2.getName());

        int round = 1;
        List<String> battleLog = new ArrayList<>();

        while (p1.isAlive() && p2.isAlive()) {
            System.out.println("\n");
            System.out.println("                                                                                ╔══════════════════════════════════════════════════════════════════╗");
            System.out.println("                                                                                ║                            ROUND " + round + "                               ║");
            System.out.println("                                                                                ╚══════════════════════════════════════════════════════════════════╝");
            System.out.println("                                                                                ┌──────────────────────────────────────────────────────────────────┐");
            System.out.println("                                                                                            " + p1.getName() + " HP: " + p1.getHp() + "        VS        " + p2.getName() + " HP: " + p2.getHp());
            System.out.println("                                                                                └──────────────────────────────────────────────────────────────────┘");

            // === Player 1 Turn ===
            System.out.println("\n                                                                                🎯 " + p1.getName() + "'s (P1) turn! Choose a skill:");
            int p1Choice = getValidSkillChoice(p1);
            int p1Damage = p1.useSkill(p1Choice);
            p2.takeDamage(p1Damage);
            battleLog.add("🧍 " + p1.getName() + " used Skill " + p1Choice + " and dealt " + p1Damage + " damage!");

            if (!p2.isAlive()) {
                battleLog.add("💀 " + p2.getName() + " was defeated!");
                displayBattleLog(battleLog, round);
                break;
            }

            // === Player 2 Turn ===
            System.out.println("\n                                                                                🎯 " + p2.getName() + "'s (P2) turn! Choose a skill:");
            int p2Choice = getValidSkillChoice(p2);
            int p2Damage = p2.useSkill(p2Choice);
            p1.takeDamage(p2Damage);
            battleLog.add("🧍 " + p2.getName() + " used Skill " + p2Choice + " and dealt " + p2Damage + " damage!");

            if (!p1.isAlive()) {
                battleLog.add("💀 " + p1.getName() + " was defeated!");
            }

            // === Round Summary ===
            displayBattleLog(battleLog, round);
            battleLog.clear();

            // === Cooldowns ===
            reduceCooldowns(p1);
            reduceCooldowns(p2);

            round++;
        }

        System.out.println("\n\n                                                                              🏆 RESULT: " + (p1.isAlive() ? p1.getName() + " (P1)" : p2.getName() + " (P2)") + " wins!");
        playAgain();
    }

    private static Character chooseCharacter(int playerNum) {
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

        int choice = getValidInput(0, 11);
        return switch (choice) {
            case 0 -> null;
            case 1 -> new Ton(); case 2 -> new Jay(); case 3 -> new Josh(); case 4 -> new Patricia();
            case 5 -> new KalKhent(); case 6 -> new Lanz(); case 7 -> new Ashley();
            case 8 -> new SirG(); case 9 -> new Ian(); case 10 -> new Jon(); case 11 -> new Coleen();
            default -> null;
        };
    }

    private static int getValidSkillChoice(Character p) {
        while (true) {
            p.displaySkills();
            System.out.print("                                                                                Enter choice (1–3): ");
            int choice = getValidInput(1, 3);
            if (isSkillReady(p, choice)) return choice;
            System.out.println("                                                                                ❌ Skill on cooldown! Choose another.");
        }
    }

    private static boolean isSkillReady(Character c, int skill) {
        return switch (skill) {
            case 1 -> c.cd1 == 0; case 2 -> c.cd2 == 0; case 3 -> c.cd3 == 0;
            default -> false;
        };
    }

    private static void reduceCooldowns(Character c) {
        if (c.cd1 > 0) c.cd1--; if (c.cd2 > 0) c.cd2--; if (c.cd3 > 0) c.cd3--;
    }

    private static int getValidInput(int min, int max) {
        while (true) {
            try {
                int input = Integer.parseInt(scan.nextLine().trim());
                if (input >= min && input <= max) return input;
                System.out.print("                                                                                Invalid! Enter (" + min + "-" + max + "): ");
            } catch (Exception e) {
                System.out.print("                                                                                Enter a number: ");
            }
        }
    }

    private static void playAgain() {
        System.out.print("\n                                                                          PVP Play Again? (y/n): ");
        if (scan.nextLine().trim().toLowerCase().equals("y")) startPVP();
    }

    private static void displayBattleLog(List<String> log, int round) {
        System.out.println("\n                                                                                    📜 ROUND " + round + " LOG:");
        for (String entry : log) System.out.println("                                                                                      " + entry);
    }
}

package Entity;
import main.*;
import java.util.Scanner;

public class Instructions {

    private static Scanner scan = new Scanner(System.in);

    public static void showInstructions() {
           instructions();
        }

        public static void showdownModeInstructions () {
            System.out.println("\n\n");
            System.out.println("                                                                           ╔══════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                                                           ║                    GAME INSTRUCTIONS — SHOWDOWN MODE                     ║");
            System.out.println("                                                                           ╠══════════════════════════════════════════════════════════════════════════╣");

            System.out.println("                                                                           ║ OBJECTIVE:                                                               ║");
            System.out.println("                                                                           ║ Defeat your opponent by reducing their HP to 0 before they defeat you.   ║");

            System.out.println("                                                                           ╠══════════════════════════════════════════════════════════════════════════╣");
            System.out.println("                                                                           ║ HOW TO PLAY:                                                             ║");
            System.out.println("                                                                           ║ 1. Choose your character — each has unique stats and skills.             ║");
            System.out.println("                                                                           ║ 2. Battles are turn-based. You and the enemy take turns acting.          ║");
            System.out.println("                                                                           ║ 3. On your turn, choose an action:                                       ║");
            System.out.println("                                                                           ║      • Attack → Deal damage.                                             ║");
            System.out.println("                                                                           ║      • Skill  → Use special abilities (if off cooldown).                 ║");
            System.out.println("                                                                           ║ 4. After your move, the enemy automatically performs an action.          ║");
            System.out.println("                                                                           ║ 5. The fight ends when either side reaches 0 HP.                         ║");

            System.out.println("                                                                           ╠══════════════════════════════════════════════════════════════════════════╣");
            System.out.println("                                                                           ║ WINNING & LOSING:                                                        ║");
            System.out.println("                                                                           ║ • Opponent HP hits 0 → YOU WIN!                                          ║");
            System.out.println("                                                                           ║ • Your HP hits 0 → YOU LOSE!                                             ║");

            System.out.println("                                                                           ╠══════════════════════════════════════════════════════════════════════════╣");
            System.out.println("                                                                           ║ TIPS:                                                                    ║");
            System.out.println("                                                                           ║ • Watch your HP and defend smartly.                                      ║");
            System.out.println("                                                                           ║ • Manage cooldowns — big skills change the tide.                         ║");
            System.out.println("                                                                           ║ • Each hero has strengths and weaknesses. Adapt to survive.              ║");
            System.out.println("                                                                           ║ • Some skills inflict effects such as poison, debuffs, and buffs.        ║");

            System.out.println("                                                                           ╠══════════════════════════════════════════════════════════════════════════╣");
            System.out.println("                                                                           ║ DEPARTMENTS & CLASSES:                                                   ║");
            System.out.println("                                                                           ║ • CCS  — Ton, Jay                                                        ║");
            System.out.println("                                                                           ║ • CMBA — Josh, Patricia                                                  ║");
            System.out.println("                                                                           ║ • CCJ  — Kal-Khent                                                       ║");
            System.out.println("                                                                           ║ • CNAHS— Lanz, Ashley                                                    ║");
            System.out.println("                                                                           ║ • CEA  — Sir G, Ian                                                      ║");
            System.out.println("                                                                           ║ • CASE — Jon, Coleen                                                     ║");

            System.out.println("                                                                           ╠══════════════════════════════════════════════════════════════════════════╣");
            System.out.println("                                                                           ║ NOTE:                                                                    ║");
            System.out.println("                                                                           ║ Every character has unique abilities, damage ranges, and cooldowns.      ║");
            System.out.println("                                                                           ║ Smart timing and strategy determine victory.                             ║");

            System.out.println("                                                                           ╚══════════════════════════════════════════════════════════════════════════╝");

        }

        private static void adventureModeInstructions () {
            System.out.println("\n\n");
            System.out.println("                                                                           ╔══════════════════════════════════════════════════════════════════════════╗");
            System.out.println("                                                                           ║                   GAME INSTRUCTIONS — ADVENTURE MODE                     ║");
            System.out.println("                                                                           ╠══════════════════════════════════════════════════════════════════════════╣");

            System.out.println("                                                                           ║ OBJECTIVE:                                                               ║");
            System.out.println("                                                                           ║ Choose your hero and explore different worlds. Defeat all enemies        ║");
            System.out.println("                                                                           ║ in each world to complete your adventure! Clear all stages to become     ║");
            System.out.println("                                                                           ║ the ultimate champion of Adventure Mode!                                 ║");

            System.out.println("                                                                           ╠══════════════════════════════════════════════════════════════════════════╣");
            System.out.println("                                                                           ║ HOW TO PLAY:                                                             ║");
            System.out.println("                                                                           ║ 1. Choose your hero (1–11) — each has unique stats, skills.              ║");
            System.out.println("                                                                           ║ 2. Select a world to explore:                                            ║");
            System.out.println("                                                                           ║      • RTL → Research & Technology Lab (traps & puzzles)                 ║");
            System.out.println("                                                                           ║      • GLE → Great Learning Environment                                  ║");
            System.out.println("                                                                           ║      • Gymnasium → Battlefield of Strength                               ║");
            System.out.println("                                                                           ║      • BasketballCourt → Arena of Speed & Agility                        ║");
            System.out.println("                                                                           ║      • Canteen → Hub of Survival & Strategy                              ║");
            System.out.println("                                                                           ║ 3. Each world has unique enemies, challenges, and boss fights.           ║");
            System.out.println("                                                                           ║ 4. Commands during exploration:                                          ║");
            System.out.println("                                                                           ║      • attack → Fight enemies encountered                                ║");
            System.out.println("                                                                           ║      • skill  → Use your hero’s ability (if off cooldown)                ║");
            System.out.println("                                                                           ║ 5. Defeat all enemies in a world to clear it.                            ║");
            System.out.println("                                                                           ║ 6. Complete all stages to win the game!                                  ║");

            System.out.println("                                                                           ╠══════════════════════════════════════════════════════════════════════════╣");
            System.out.println("                                                                           ║ WINNING & LOSING:                                                        ║");
            System.out.println("                                                                           ║ • Defeat all enemies and the final boss in a world → WORLD CLEARED!      ║");
            System.out.println("                                                                           ║ • If your HP reaches 0 → You lose and must restart.                      ║");

            System.out.println("                                                                           ╠══════════════════════════════════════════════════════════════════════════╣");
            System.out.println("                                                                           ║ TIPS:                                                                    ║");
            System.out.println("                                                                           ║ • Each hero has strengths and weaknesses — experiment to find your best  ║");
            System.out.println("                                                                           ║   playstyle.                                                             ║");
            System.out.println("                                                                           ║ • Manage your HP carefully; some battles can be long.                    ║");
            System.out.println("                                                                           ║ • Boss fights may require strategy — learn enemy patterns and use        ║");
            System.out.println("                                                                           ║   your strongest skills.                                                 ║");
            System.out.println("                                                                           ║ • Some worlds may suit certain heroes better than others.                ║");

            System.out.println("                                                                           ╠══════════════════════════════════════════════════════════════════════════╣");
            System.out.println("                                                                           ║ WORLDS OVERVIEW:                                                         ║");
            System.out.println("                                                                           ║ • RTL → Technology puzzles, electric traps, and robotic enemies.         ║");
            System.out.println("                                                                           ║ • BasketballCourt → Fast-paced enemies that test your reflexes.          ║");
            System.out.println("                                                                           ║ • Canteen → Resource management and survival challenges.                 ║");
            System.out.println("                                                                           ║ • GLE → Mental tests, magical enemies, and academic trials.              ║");
            System.out.println("                                                                           ║ • Gymnasium → Strong physical enemies and endurance battles.             ║");

            System.out.println("                                                                           ╠══════════════════════════════════════════════════════════════════════════╣");
            System.out.println("                                                                           ║ NOTE:                                                                    ║");
            System.out.println("                                                                           ║ Adventure Mode focuses on progression.                                   ║");
            System.out.println("                                                                           ║ Defeat all bosses to complete your journey and prove your strength       ║");
            System.out.println("                                                                           ║ as a true adventurer!                                                    ║");

            System.out.println("                                                                           ╚══════════════════════════════════════════════════════════════════════════╝");


        }

    private static void chooseAgain() {
        while(true) {
            try {
                System.out.print("\n                                                                                    Do you want to choose another instruction? (y/n/o): ");
                String choice = scan.nextLine().trim().toLowerCase();

                if (choice.equals("y")) {
                   instructions();
                } else if (choice.equals("n")){
                    System.out.println("\n                                                                                    Returning to main menu...");
                    System.out.println();
                    Main.main(null);
                } else if (choice.equals("o")) {
                    System.out.println("\n                                                                                    Exiting the program...");
                    System.exit(0);
                } else {
                    throw new Exception("\n                                                                                    Invalid input");
                }
            } catch (Exception e) {
                System.out.println("\n                                                                                    Error: Please enter (y/n/o) only!");
            }
          }
        }

    private static void instructions() {
        while(true) {
            try {
                System.out.print("\n                                                                      Choose type of instruction, 'S' for Showdown Mode and 'A' for Adventure Mode (S/A): ");
                String choice = scan.nextLine().trim().toLowerCase();

                if (choice.equals("s")) {
                    showdownModeInstructions();
                    chooseAgain();
                } else if (choice.equals("a")) {
                    adventureModeInstructions();
                    chooseAgain();
                } else {
                    throw new Exception("\n                                                                                    Invalid input");
                }
            } catch (Exception e) {
                System.out.println("\n                                                                                                Error: Please enter (S/A) only!");
            }
        }
    }
}


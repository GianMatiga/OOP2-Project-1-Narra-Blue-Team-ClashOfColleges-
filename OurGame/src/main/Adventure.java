package main;

import Entity.*;
import Entity.Character;
import Worlds.*;

import java.util.*;

public class Adventure {

    static final Scanner scan = new Scanner(System.in);
    static Random rand = new Random();
    public static int rtlClears = 0;
    public static int gleClears = 0;
    public static int gymClears = 0;
    public static int bcClears = 0;
    public static int ctClears = 0;

    public static void startAdventure() {

        displayTitle();

        int option = 0;
        while (true) {
            try {
                System.out.print("\n                                                                                               Select an option: ");
                option = scan.nextInt();
                scan.nextLine();

            } catch (Exception e) {
                System.out.println("                                                                                               ❌ Invalid input! Please choose from (1-2)!");
                scan.nextLine();
                continue;
            }

            switch (option) {
                case 1:
                    Character chosenHero = selectHero();
                    initiateWorlds(chosenHero);
                    continue;
                case 2:
                    System.out.println("                                                                                           Exiting adventure mode!");
                    Main.main(null);
                    break;
                default: System.out.println("                                                                                               ❌ Invalid choice!");
            }
        }
    }



    //====================================  METHODS  ===========================================
    //HERO SELECTION
    public static Character selectHero() {
        Character heroChoice = null;

        while(heroChoice == null) {
            displayHeroes();
            try {
                int choice = scan.nextInt();

                switch (choice) {
                    case 1 -> heroChoice = new Ton();
                    case 2 -> heroChoice = new Jay();
                    case 3 -> heroChoice = new Josh();
                    case 4 -> heroChoice = new Patricia();
                    case 5 -> heroChoice = new KalKhent();
                    case 6 -> heroChoice = new Lanz();
                    case 7 -> heroChoice = new Ashley();
                    case 8 -> heroChoice = new SirG();
                    case 9 -> heroChoice = new Ian();
                    case 10 -> heroChoice = new Jon();
                    case 11 -> heroChoice = new Coleen();
                    case 0 -> {
                        System.out.print("                                                                               Returning to main menu...");
                        Adventure.startAdventure();
                    }
                    default -> System.out.println("                                                                               ❌ Invalid choice! Please enter a number (1-11):");
                }
            } catch (Exception e) {
                System.out.println("                                                                               Please enter a number (1–11):");
                scan.nextLine();
            }
        }
        return heroChoice;
    }
    //WORLD SELECTION
    public static void initiateWorlds(Character chosenHero) {
        int world = -1;

        while(true) {
            displayWorlds();
            try {
                world = scan.nextInt();
                scan.nextLine();

                if(world == 6) {
                    Adventure.selectHero();
                }
                else if (world >= 1 && world <= 5 ) {
                    break;
                } else {
                    System.out.println("                                                                                    ❌ Invalid choice! Please choose (1–6)");
                }


            } catch (Exception e) {
                System.out.print("                                                                                    ❌ Invalid input! Please choose from (1-6): ");
                scan.nextLine();
            }
        }
        AdventureBattleSystem bs = new AdventureBattleSystem();

        switch (world) {

            case 1 -> {
                RTL rtl = new RTL();
                Enemy[] rtlEnemies = {
                        rtl.new PaperHogger(),
                        rtl.new ChalkBoy(),
                        rtl.new Wierdo(),
                        rtl.new RTLPhantom(),
                        rtl.new BossPrincipal(),
                };
                System.out.println("\n\n");
                System.out.println("                                                                               ╔══════════════════════════════════════════════════════════════════╗");
                System.out.println("                                                                               ║                          WELCOME TO RTL                          ║");
                System.out.println("                                                                               ╚══════════════════════════════════════════════════════════════════╝");

                boolean result = bs.startBattle(chosenHero, rtlEnemies);

                if (!result) { // hero lose
                    Adventure.initiateWorlds(chosenHero);
                } else {
                    rtlClears++;
                    Adventure.initiateWorlds(chosenHero);
                }
            }
            case 2 -> {
                GLE gle = new GLE();
                Enemy[] gleEnemies = {
                        gle.new Arkiiteks(),
                        gle.new McCuePal(),
                        gle.new DrNarrSingh(),
                        gle.new SeerEnjeeniir(),
                        gle.new BossG(),
                };
                System.out.println("\n\n");
                System.out.println("                                                                               ╔══════════════════════════════════════════════════════════════════╗");
                System.out.println("                                                                               ║                          WELCOME TO GLE                          ║");
                System.out.println("                                                                               ╚══════════════════════════════════════════════════════════════════╝");

                boolean result = bs.startBattle(chosenHero, gleEnemies);

                if (!result) {
                    Adventure.initiateWorlds(chosenHero);
                } else {
                    gleClears++;
                    Adventure.initiateWorlds(chosenHero);
                }
            }
            case 3 -> {
                Gymnasium gym = new Gymnasium();
                Enemy[] gymEnemies = {
                        gym.new Coach(),
                        gym.new YogaLolo(),
                        gym.new DancingRolly(),
                        gym.new SweatyJon(),
                        gym.new ArnisDiablo(),
                };
                System.out.println("\n\n");
                System.out.println("                                                                               ╔══════════════════════════════════════════════════════════════════╗");
                System.out.println("                                                                               ║                       WELCOME TO GYMNASIUM                       ║");
                System.out.println("                                                                               ╚══════════════════════════════════════════════════════════════════╝");

                boolean result = bs.startBattle(chosenHero, gymEnemies);

                if (!result) {
                    Adventure.initiateWorlds(chosenHero);
                } else {
                    gymClears++;
                    Adventure.initiateWorlds(chosenHero);
                }
            }
            case 4 -> {
                BasketballCourt bc = new BasketballCourt();
                Enemy[] bcEnemies = {
                        bc.new DribbleGableen(),
                        bc.new SpikeJupeta(),
                        bc.new Referee(),
                        bc.new BouncyAmpol(),
                        bc.new AuraMaster(),
                };
                System.out.println("\n\n");
                System.out.println("                                                                               ╔══════════════════════════════════════════════════════════════════╗");
                System.out.println("                                                                               ║                    WELCOME TO BASKETBALL COURT                   ║");
                System.out.println("                                                                               ╚══════════════════════════════════════════════════════════════════╝");

                boolean result = bs.startBattle(chosenHero, bcEnemies);

                if (!result) {
                    Adventure.initiateWorlds(chosenHero);
                } else {
                    bcClears++;
                    Adventure.initiateWorlds(chosenHero);
                }
            }
            case 5 -> {
                Canteen ct = new Canteen();
                Enemy[] ctEnemies = {
                        ct.new GreedyJaede(),
                        ct.new PanDeBureeCat(),
                        ct.new OilyGreg(),
                        ct.new SirEatallat(),
                        ct.new ChefMamasitas(),
                };
                System.out.println("\n\n");
                System.out.println("                                                                               ╔══════════════════════════════════════════════════════════════════╗");
                System.out.println("                                                                               ║                        WELCOME TO CANTEEN                        ║");
                System.out.println("                                                                               ╚══════════════════════════════════════════════════════════════════╝");

                boolean result = bs.startBattle(chosenHero, ctEnemies);

                if (!result) {
                    Adventure.initiateWorlds(chosenHero);
                } else {
                    ctClears++;
                    Adventure.initiateWorlds(chosenHero);
                }
            }
                case 6 -> {
                    System.out.println("                                                                                    Returning to hero selection...");
                    Adventure.selectHero();
                }
        }
    }

    // =========================== DISPLAY METHODS ============================

    //display "ADVENTURE MODE"
    public static void displayTitle() {
        System.out.println("\n\n                                                                     ╔═════════════════════════════════════════════════════════════════════════════════════════╗ ");
        System.out.println("                                                                     ║                                                                                         ║");
        System.out.println("                                                                     ║                                                                                         ║");
        System.out.println("                                                                     ║                                                                                         ║");
        System.out.println("                                                                     ║   █████╗  ██████╗  ██╗   ██╗ ███████╗ ███╗   ██╗ ████████╗ ██╗   ██╗ ██████╗  ███████╗  ║");
        System.out.println("                                                                     ║  ██╔══██╗ ██╔══██╗ ██║   ██║ ██╔════╝ ████╗  ██║ ╚══██╔══╝ ██║   ██║ ██╔══██╗ ██╔════╝  ║");
        System.out.println("                                                                     ║  ███████║ ██║  ██║ ██║   ██║ ███████╗ ██║██╗ ██║    ██║    ██║   ██║ █████╔═╝ ███████╗  ║");
        System.out.println("                                                                     ║  ██╔══██║ ██║  ██╝ ██║   ██║ ██╔════╝ ██║╚██╗██║    ██║    ██║   ██║ ██╔══██╗ ██╔════╝  ║");
        System.out.println("                                                                     ║  ██║  ██║ █████╔╝   ██████╔╝ ███████╗ ██║ ╚████║    ██║    ╚██████╔╝ ██║  ██║ ███████╗  ║");
        System.out.println("                                                                     ║  ╚═╝  ╚═╝ ╚════╝    ╚═════╝  ╚══════╝ ╚═╝  ╚═══╝    ╚═╝     ╚═════╝  ╚═╝  ╚═╝ ╚══════╝  ║");
        System.out.println("                                                                     ║                         ███╗   ███╗  ██████╗  ██████╗  ███████╗                         ║");
        System.out.println("                                                                     ║                         ████╗ ████║ ██╔═══██╗ ██╔══██╗ ██╔════╝                         ║");
        System.out.println("                                                                     ║                         ██╔████╔██║ ██║   ██║ ██║  ██║ ███████╗                         ║");
        System.out.println("                                                                     ║                         ██║╚██╔╝██║ ██║   ██║ ██║  ██║ ██╔════╝                         ║");
        System.out.println("                                                                     ║                         ██║ ╚═╝ ██║  ╚█████╔╝ ██████╔╝ ███████╗                         ║");
        System.out.println("                                                                     ║                         ╚═╝     ╚═╝   ╚════╝  ╚═════╝  ╚══════╝                         ║");
        System.out.println("                                                                     ║                                                                                         ║");
        System.out.println("                                                                     ║                                                                                         ║");
        System.out.println("                                                                     ║                                                                                         ║");
        System.out.println("                                                                     ╚═════════════════════════════════════════════════════════════════════════════════════════╝");
        System.out.println("\n\n");

        System.out.println("                                                                                              ╠══════════════════════════════════════╣");
        System.out.println("                                                                                              ║              MAIN MENU               ║");
        System.out.println("                                                                                              ╠══════════════════════════════════════╣");
        System.out.println("                                                                                              ║              [1] START               ║");
        System.out.println("                                                                                              ║              [2] EXIT                ║");
        System.out.println("                                                                                              ╚══════════════════════════════════════╝");
    }
    public static void displayHeroes() {
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
        System.out.println("                                                                            │  CASE         │  10. Jon        11. Coleen                               │");
        System.out.println("                                                                            ├──────────────────────────────────────────────────────────────────────────┤");
        System.out.println("                                                                            │  0. Exit                                                                 │");
        System.out.println("                                                                            └──────────────────────────────────────────────────────────────────────────┘");

        System.out.print("                                                                               Select Character (1–11): ");

    }
    public static void displayWorlds() {
        System.out.println("\n\n");
        System.out.println("                                                                                 ┌──────────────────────────────────────────────────────────────┐────────┐");
        System.out.println("                                                                                 │                        CHOOSE WORLD                          │ CLEARS │");
        System.out.println("                                                                                 ├──────────────────────────────────────────────────────────────┤────────┤");
        System.out.println("                                                                                 │                         [1] RTL                              │   " + rtlClears + "    │");
        System.out.println("                                                                                 │                         [2] GLE                              │   " + gleClears + "    │");
        System.out.println("                                                                                 │                         [3] Gymnasium                        │   " + gymClears + "    │");
        System.out.println("                                                                                 │                         [4] Basketball Court                 │   " + bcClears + "    │");
        System.out.println("                                                                                 │                         [5] Canteen                          │   " + ctClears + "    │");
        System.out.println("                                                                                 │                         [6] Exit                             │        │");
        System.out.println("                                                                                 └──────────────────────────────────────────────────────────────┘────────┘");
        System.out.print("                                                                                    Select a world (1–6): ");

    }
}

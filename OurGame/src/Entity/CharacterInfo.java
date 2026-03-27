package Entity;

import main.*;
import java.util.*;

public class CharacterInfo {

    private static Scanner scan = new Scanner(System.in);

    public static void showInfo() {
        Character info = chooseCharacter();
        displayCharacterInfo(info);
        chooseAgain();
    }

    private static Character chooseCharacter() {
        System.out.println("\n\n");
        System.out.println("                                                                            ╔══════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                                                            ║                            CHOOSE A CHARACTER                            ║");
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
        System.out.println("                                                                            └──────────────────────────────────────────────────────────────────────────┘");

        System.out.print("\n                                                                                Select Character (1–11): ");

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
            default -> new Ton();
        };
    }

    private static int getValidCharacterInput() {
        while (true) {
            try {
                int input = Integer.parseInt(scan.nextLine().trim());
                if (input >= 1 && input <= 11) return input;
                System.out.print("\n                                                                                Invalid choice. Enter (1–11): ");
            } catch (Exception e) {
                System.out.print("\n                                                                                Please enter a number (1–11): ");
            }
        }
    }

    private static void chooseAgain() {
        while(true) {
            try {
                System.out.print("\n                                          Do you want to choose another character info again? (y/n/o): ");
                String choice = scan.nextLine().trim().toLowerCase();

                if (choice.equals("y")) {
                    Character next = chooseCharacter();
                    displayCharacterInfo(next);
                } else if (choice.equals("n")){
                    System.out.println("\n                                          Returning to main menu...");
                    System.out.println();
                    Main.main(null);
                } else if (choice.equals("o")) {
                    System.out.println("\n                                          Exiting the program...");
                    System.exit(0);
                } else {
                    throw new Exception("\n                                          Invalid input");
                }
            } catch (Exception e) {
                System.out.println("\n                                          Error: Please enter (y/n/o) only!");
            }
        }
    }

    private static void displayCharacterInfo(Character info) {
        System.out.println("\n\n");
        System.out.println("                                          ╔══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("                                                                                     -=-=-=-=-=- You chose: " + info.getName() + " (" + info.getProgram() + ") : " + info.getDepartment() + " -=-=-=-=-=-                                ");
        System.out.println("                                          ╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
        info.displayStory();
        info.displaySkillsDescription();
    }
}



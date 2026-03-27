package Entity;
import java.util.Random;

public class Josh extends Character {

    public Josh() {
        super("Josh", 700, "CMBA", "Accountancy");
        this.cdTime1 = 0;
        this.cdTime2 = 3;
        this.cdTime3 = 4;
    }

    @Override
    public int skill1() {
        int damage = rand.nextInt(110 - 61 + 1) + 61;
        System.out.println("\n                                                                                " + name + " used Coin Toss! 💰 Damage: " + damage);
        cd1 = cdTime1;
        return damage;
    }

    @Override
    public int skill2() {
        int damage = rand.nextInt(120 - 71 + 1) + 71;
        System.out.println("\n                                                                                " + name + " performed Tax Audit! 📊 Damage: " + damage + " (CD: 3)");
        cd2 = cdTime2;
        return damage;
    }

    @Override
    public int skill3() {
        int damage = rand.nextInt(270 - 131 + 1) + 131;
        System.out.println("\n                                                                                " + name + " unleashed Number Crunch! 💹 Massive damage: " + damage + " (CD: 4)");
        cd3 = cdTime3;
        return damage;
    }

    @Override
    public void displaySkills() {
        System.out.println("                                                                                1. Coin Toss (" + cdStatus(cd1) + ")");
        System.out.println("                                                                                2. Tax Audit (" + cdStatus(cd2) + ")");
        System.out.println("                                                                                3. Number Crunch (" + cdStatus(cd3) + ")");
    }

    @Override
    public void displayStory(){
        System.out.print("""
                                                            An Accountancy student from CIT-U who fights with precision and logic.
                                                            Josh treats every battle like a formula — every move must add up, every strike must balance.
                                                            Calm, strategic, and sharp, he believes victory always goes to the one who makes the smartest calculation.
                """);
        System.out.println("                                          ╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
    }

    @Override
    public void displaySkillsDescription(){
        System.out.println("                                            1. Coin Toss – 60–110 dmg (CD: 0)");
        System.out.println("                                               - A risky strike that balances luck and calculation.");
        System.out.println();
        System.out.println("                                            2. Tax Audit – 70–120 dmg (CD: 3)");
        System.out.println("                                               - Analyzes the opponent’s weaknesses and exploits the numbers.");
        System.out.println();
        System.out.println("                                            3. Number Crunch – 130–270 dmg (CD: 4)");
        System.out.println("                                               - Analyzes the opponent’s weaknesses and exploits the numbers.");
        System.out.println("                                          ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }
}
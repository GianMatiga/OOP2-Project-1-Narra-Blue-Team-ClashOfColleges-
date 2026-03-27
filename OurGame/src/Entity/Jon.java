package Entity;
import java.util.Random;

public class Jon extends Character {

    public Jon() {
        super("Jon", 800, "CASE", "Biology");
        this.cdTime1 = 0;
        this.cdTime2 = 3;
        this.cdTime3 = 4;
    }

    @Override
    public int skill1() {
        int damage = rand.nextInt(80 - 51 + 1) + 51;
        System.out.println("\n                                                                                " + name + " used Sting Strike! 🐝 Damage: " + damage);
        cd1 = cdTime1;
        return damage;
    }

    @Override
    public int skill2() {
        int damage = rand.nextInt(100 - 61 + 1) + 61;
        System.out.println("\n                                                                                " + name + " activated Regrowth! 🌿 Damage: " + damage + " (CD: 3)");
        cd2 = cdTime2;
        return damage;
    }

    @Override
    public int skill3() {
        int damage = 120 * 3;
        System.out.println("\n                                                                                " + name + " unleashed Ecosystem! 🐜 Continuous Damage: " + damage + " (CD: 4)");
        cd3 = cdTime3;
        return damage;
    }

    @Override
    public void displaySkills() {
        System.out.println("                                                                                1. Sting Strike (" + cdStatus(cd1) + ")");
        System.out.println("                                                                                2. Regrowth (" + cdStatus(cd2) + ")");
        System.out.println("                                                                                3. Ecosystem (" + cdStatus(cd3) + ")");
    }
    @Override
    public void displayStory(){
        System.out.print("""
                                                           A Biology major from CIT-U who studies life — and uses that knowledge to dominate in battle.
                                                           Jon understands anatomy, timing, and precision, striking at vital points with scientific accuracy.
                                                           Calm and observant, he fights not just with strength, but with the intelligence of someone who knows how every living thing and survives.
                """);
        System.out.println("                                          ╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
    }

    @Override
    public void displaySkillsDescription(){
        System.out.println("                                            1. Sting Strike – 50-80 (CD: 0)");
        System.out.println("                                               - A venomous attack inspired by nature’s deadliest creatures.");
        System.out.println();
        System.out.println("                                            2. Regrowth – 60-100 (CD: 3)");
        System.out.println("                                               - Harnesses natural vitality to recover over time.");
        System.out.println();
        System.out.println("                                            3. Ecosystem – 360 dmg (CD: 4)");
        System.out.println("                                               - Summons nature’s balance to continuously damage the opponent.");
        System.out.println("                                          ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }
}
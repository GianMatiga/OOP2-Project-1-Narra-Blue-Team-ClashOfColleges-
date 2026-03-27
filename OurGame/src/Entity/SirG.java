package Entity;
import java.util.Random;

public class SirG extends Character {

    public SirG() {
        super("Sir G", 1000, "CEA", "Civil Engineering");
        this.cdTime1 = 0;
        this.cdTime2 = 3;
        this.cdTime3 = 4;
    }

    @Override
    public int skill1() {
        int damage = rand.nextInt(50 - 31 + 1) + 31;
        System.out.println("\n                                                                                " + name + " used Hammer Blow! 🔨 Damage: " + damage);
        cd1 = cdTime1;
        return damage;
    }

    @Override
    public int skill2() {
        int damage = rand.nextInt(140 - 81 + 1) + 81;
        System.out.println("\n                                                                                " + name + " built a Brick Wall! 🧱 Damage: " + damage + " (CD: 3)");
        cd2 = cdTime2;
        return damage;
    }

    @Override
    public int skill3() {
        int damage = rand.nextInt(200 - 151 + 1) + 151; //
        System.out.println("\n                                                                                " + name + " performed Structural Analysis! 📐 Damage: " + damage + " (CD: 4)");
        cd3 = cdTime3;
        return damage;
    }

    @Override
    public void displaySkills() {
        System.out.println("                                                                                1. Hammer Blow (" + cdStatus(cd1) + ")");
        System.out.println("                                                                                2. Brick Wall (" + cdStatus(cd2) + ")");
        System.out.println("                                                                                3. Structural Analysis (" + cdStatus(cd3) + ")");
    }
    @Override
    public void displayStory(){
        System.out.print("""
                                                            A Civil Engineering teacher from CIT-U who builds his victories from the ground up.
                                                            Sir G fights with structure, strength, and strategy — every move designed like a blueprint for success.
                                                            Unshakable and dependable, he treats every battle like a construction project: plan it and make it stand tall no matter what.
                """);
        System.out.println("                                          ╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
    }

    @Override
    public void displaySkillsDescription(){
        System.out.println("                                            1. Hammer Blow – 30–50 dmg (CD: 0)");
        System.out.println("                                               - A heavy hit that lands like a reinforced beam.");
        System.out.println();
        System.out.println("                                            2. Brick Wall – 80-150 dmg (CD: 3)");
        System.out.println("                                               - Constructs a solid defense that absorbs incoming hits.");
        System.out.println();
        System.out.println("                                            3. Structural Analysis – 150–200 dmg (CD: 4)");
        System.out.println("                                               - Breaks down even the toughest defenses with precise calculations.");
        System.out.println("                                          ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }
}
package Entity;
import java.util.Random;

public class Jay extends Character {

    public Jay() {
        super("Jay", 750, "CCS", "Information Technology");
        this.cdTime1 = 0;
        this.cdTime2 = 3;
        this.cdTime3 = 4;
    }

    @Override
    public int skill1() {
        int damage = rand.nextInt(100 - 51 + 1) + 51;
        System.out.println("\n                                                                                " + name + " used Debug Strike! 💻 Damage: " + damage);
        cd1 = cdTime1;
        return damage;
    }

    @Override
    public int skill2() {
        int damage = rand.nextInt(140 - 61 + 1) + 61;
        System.out.println("\n                                                                                " + name + " cast Lag Spike! ⚡ Damage: " + damage + " (CD: 3)");
        cd2 = cdTime2;
        return damage;
    }

    @Override
    public int skill3() {
        int damage = rand.nextInt(250 - 151 + 1) + 151;
        System.out.println("\n                                                                                " + name + " activated System Update! 🔧 Damage: " + damage + " (CD: 4)");
        cd3 = cdTime3;
        return damage;
    }

    @Override
    public void displaySkills() {
        System.out.println("                                                                                1. Debug Strike (" + cdStatus(cd1) + ")");
        System.out.println("                                                                                2. Lag Spike (" + cdStatus(cd2) + ")");
        System.out.println("                                                                                3. System Update (" + cdStatus(cd3) + ")");
    }
    @Override
    public void displayStory(){
        System.out.print("""
                                                            A CITU student who treats battle like fixing a broken system.
                                                            Jay disrupts enemies with glitches, slows their moves, and upgrades himself to stay ahead.
                                                            To him, foes are just errors waiting to be erased.
                """);
        System.out.println("                                          ╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
    }

    @Override
    public void displaySkillsDescription(){
        System.out.println("                                            1. Debug Strike – 50–100 dmg (CD: 0)");
        System.out.println("                                               - A clean and direct attack to “remove” enemy glitches.");
        System.out.println();
        System.out.println("                                            2. Lag Spike – 60–140 dmg (CD: 3)");
        System.out.println("                                               - Overloads the enemy’s system, freezing them for one round.");
        System.out.println();
        System.out.println("                                            3. System Update – 150-250 (CD: 4)");
        System.out.println("                                               - Optimizes your stats, upgrading both power and resistance.");
        System.out.println("                                          ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }
}
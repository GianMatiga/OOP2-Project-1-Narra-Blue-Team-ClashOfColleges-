package Entity;
import java.util.Random;

public class Ian extends Character {

    public Ian() {
        super("Ian", 860, "CEA", "Electrical Engineering");
        this.cdTime1 = 0;
        this.cdTime2 = 3;
        this.cdTime3 = 4;
    }

    @Override
    public int skill1() {
        int damage = rand.nextInt(60 - 46 + 1) + 46;
        System.out.println("\n                                                                                " + name + " fired Shock Bolt! ⚡ Damage: " + damage);
        cd1 = cdTime1;
        return damage;
    }

    @Override
    public int skill2() {
        int damage = rand.nextInt(150 - 66 + 1) + 66;
        System.out.println("\n                                                                                " + name + " used Overload! 🔋 Damage: " + damage + " (CD: 3)");
        cd2 = cdTime2;
        return damage;
    }

    @Override
    public int skill3() {
        int damage = rand.nextInt(310 - 121 + 1) + 121;
        System.out.println("\n                                                                                " + name + " unleashed Short Circuit! ⚡ Massive Damage: " + damage + " (CD: 4)");
        cd3 = cdTime3;
        return damage;
    }

    @Override
    public void displaySkills() {
        System.out.println("                                                                                1. Shock Bolt (" + cdStatus(cd1) + ")");
        System.out.println("                                                                                2. Overload (" + cdStatus(cd2) + ")");
        System.out.println("                                                                                3. Short Circuit (" + cdStatus(cd3) + ")");
    }
    @Override
    public void displayStory(){
        System.out.print("""
                                                            An Electrical Engineering student from CIT-U who channels the power of energy and precision.
                                                            Ian fights with intensity and control, striking like a surge of electricity — fast, unpredictable, and powerful.
                                                            Always charged with determination, he believes that even in darkness, the one who masters the current holds the power to win.
                """);
        System.out.println("                                          ╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
    }

    @Override
    public void displaySkillsDescription(){
        System.out.println("                                            1. Shock Bolt – 45–60 dmg (CD: 0)");
        System.out.println("                                               - Unleashes a quick surge of electrical power.");
        System.out.println();
        System.out.println("                                            2. Overload – 65-150 dmg (CD: 3)");
        System.out.println("                                               - Charges up your next move for a devastating discharge.");
        System.out.println();
        System.out.println("                                            3. Short Circuit – 120-310 (CD: 4)");
        System.out.println("                                               - Fires a high-voltage blast that disrupts enemy skills.");
        System.out.println("                                          ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }
}
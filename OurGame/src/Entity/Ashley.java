package Entity;
import java.util.Random;

public class Ashley extends Character {

    public Ashley() {
        super("Ashley", 920, "CNAHS", "Medical Technology");
        this.cdTime1 = 0;
        this.cdTime2 = 3;
        this.cdTime3 = 4;
    }

    @Override
    public int skill1() {
        int damage = rand.nextInt(90 - 51 + 1) + 51;
        System.out.println("\n                                                                                " + name + " used Scalpel Slash! 🩸 Damage: " + damage);
        cd1 = cdTime1;
        return damage;
    }

    @Override
    public int skill2() {
        int damage = rand.nextInt(160 - 71 + 1) + 71;
        System.out.println("\n                                                                                " + name + " released Sedative Gas! ☁️ Damage: " + damage + " (CD: 3)");
        cd2 = cdTime2;
        return damage;
    }

    @Override
    public int skill3() {
        int damage = rand.nextInt(300 - 161 + 1) + 161;
        System.out.println("\n                                                                                " + name + " activated Defibrillate! ⚡ Damage: " + damage + " (CD: 4)");
        cd3 = cdTime3;
        return damage;
    }

    @Override
    public void displaySkills() {
        System.out.println("                                                                                1. Scalpel Slash (" + cdStatus(cd1) + ")");
        System.out.println("                                                                                2. Sedative Gas (" + cdStatus(cd2) + ")");
        System.out.println("                                                                                3. Defibrillate (" + cdStatus(cd3) + ")");
    }

    @Override
    public void displayStory(){
        System.out.print("""
                                                            A Medical Technology student from CIT-U who treats every battle like a laboratory test — precise, calculated, and clean.
                                                            Ashley uses her sharp mind and steady hands to analyze her opponents and strike where it hurts most.
                                                            Cool under pressure, she fights to prove that science and skill make the perfect cure for defeat.
                """);
        System.out.println("                                          ╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
    }

    @Override
    public void displaySkillsDescription(){
        System.out.println("                                            1. Scalpel Slash – 50–90 dmg (CD: 0)");
        System.out.println("                                               - A sharp and surgical attack aimed with perfect accuracy.");
        System.out.println();
        System.out.println("                                            2. Sedative Gas – 70–160 dmg (CD: 3)");
        System.out.println("                                               - Releases a calming mist that weakens the opponent’s strikes.");
        System.out.println();
        System.out.println("                                            3. Defibrillate – 160-300 dmg (CD: 4)");
        System.out.println("                                               - Revives your fighting spirit with an electric shock of pure damage.");
        System.out.println("                                          ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }
}
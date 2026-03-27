package Entity;
import java.util.Random;

public class KalKhent extends Character {

    public KalKhent() {
        super("Kal-Khent", 1000, "CCJ", "Criminology");
        this.cdTime1 = 0;
        this.cdTime2 = 3;
        this.cdTime3 = 4;
    }

    @Override
    public int skill1() {
        int damage = rand.nextInt(95 - 61 + 1) + 61;
        System.out.println("\n                                                                                " + name + " delivered Interrogation Punch! 👊 Damage: " + damage);
        cd1 = cdTime1;
        return damage;
    }

    @Override
    public int skill2() {
        int damage = rand.nextInt(160 - 71 + 1) + 71;
        System.out.println("\n                                                                                " + name + " used Crime Scene Analysis! 🔍 Damage: " + damage + " (CD: 3)");
        cd2 = cdTime2;
        return damage;
    }

    @Override
    public int skill3() {
        int damage = rand.nextInt(200 - 141 + 1) + 141;
        System.out.println("\n                                                                                " + name + " activated Evidence Analysis! ⚖️ Counterattack Damage: " + damage + " (CD: 4)");
        cd3 = cdTime3;
        return damage;
    }

    @Override
    public void displaySkills() {
        System.out.println("                                                                                1. Interrogation Punch (" + cdStatus(cd1) + ")");
        System.out.println("                                                                                2. Crime Scene Analysis (" + cdStatus(cd2) + ")");
        System.out.println("                                                                                3. Evidence Analysis (" + cdStatus(cd3) + ")");
    }

    @Override
    public void displayStory(){
        System.out.print("""
                                                            A Criminology major from CIT-U who believes in justice both inside and outside the ring.
                                                            Kal-Khent fights with discipline and authority, striking down opponents with the precision of a trained enforcer.
                                                            He never fights recklessly — every move is a calculated judgment.
                                                            To him, every battle is a test of who deserves to stand on the right side of the law.
                """);
        System.out.println("                                          ╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
    }

    @Override
    public void displaySkillsDescription(){
        System.out.println("                                            1. Interrogation Punch – 60–90 dmg (CD: 0)");
        System.out.println("                                               - A straight hit that demands answers — painfully.");
        System.out.println();
        System.out.println("                                            2. Crime Scene Analysis – 70–160 dmg (CD: 3)");
        System.out.println("                                               - Examines the opponent’s weak points like a crime report.");
        System.out.println();
        System.out.println("                                            3. Evidence Analysis – 140-200 dmg (CD: 4)");
        System.out.println("                                               - Predicts the enemy’s move and counters with precise justice.");
        System.out.println("                                          ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }
}
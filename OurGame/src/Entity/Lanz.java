package Entity;
import java.util.Random;

public class Lanz extends Character {

    public Lanz() {
        super("Lanz", 850, "CNAHS", "Nursing");
        this.cdTime1 = 0;
        this.cdTime2 = 3;
        this.cdTime3 = 4;
    }

    @Override
    public int skill1() {
        int damage = rand.nextInt(70 - 41 + 1) + 41;
        System.out.println("\n                                                                                " + name + " used Injection Strike! 💉 Damage: " + damage);
        cd1 = cdTime1;
        return damage;
    }

    @Override
    public int skill2() {
        int damage = rand.nextInt(120 - 81 + 1) + 81;
        System.out.println("\n                                                                                " + name + " activated Adrenaline Rush! 💪 Damage: " + damage + " (CD: 3)");
        cd2 = cdTime2;
        return damage;
    }

    @Override
    public int skill3() {
        int damage = rand.nextInt(300 - 141 + 1) + 141;
        System.out.println("\n                                                                                " + name + " used Care Package! ❤️ Damage: " + damage + " (CD: 4)");
        cd3 = cdTime3;
        return damage;
    }

    @Override
    public void displaySkills() {
        System.out.println("                                                                                1. Injection Strike (" + cdStatus(cd1) + ")");
        System.out.println("                                                                                2. Adrenaline Rush (" + cdStatus(cd2) + ")");
        System.out.println("                                                                                3. Care Package (" + cdStatus(cd3) + ")");
    }
    @Override
    public void displayStory(){
        System.out.print("""
                                                            A Nursing student from CIT-U who knows that saving lives and fighting share the same goal — precision and care.
                                                            Lanz fights with calm focus, protecting his allies and striking only when necessary.
                                                            His medical knowledge lets him patch up wounds mid-battle and exploit his opponents’ weak points.
                                                            Behind his gentle nature lies a fighter who believes that healing and strength can exist in one heart.
                """);
        System.out.println("                                          ╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
    }

    @Override
    public void displaySkillsDescription(){
        System.out.println("                                            1. Injection Strike – 40–70 dmg (CD: 0)");
        System.out.println("                                               - Delivers a painful dose of precision and toxin.");
        System.out.println();
        System.out.println("                                            2. Adrenaline Rush – 80-120 (CD: 3)");
        System.out.println("                                               - A quick energy boost that heightens strength and speed.");
        System.out.println();
        System.out.println("                                            3. Care Package – 140-300 dmg (CD: 4)");
        System.out.println("                                               - Applies emergency treatment to recover and cleanse status effects.");
        System.out.println("                                          ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }
}
package Entity;
import java.util.Random;

public class Coleen extends Character {

    public Coleen() {
        super("Coleen", 680, "CASE", "Psychology");
        this.cdTime1 = 0;
        this.cdTime2 = 3;
        this.cdTime3 = 4;
    }

    @Override
    public int skill1() {
        int damage = rand.nextInt(80 - 46 + 1) + 46;
        System.out.println("\n                                                                                " + name + " used Mental Shock! 💥 Damage: " + damage);
        cd1 = cdTime1;
        return damage;
    }

    @Override
    public int skill2() {
        int damage = rand.nextInt(140 - 61 + 1) + 61;
        System.out.println("\n                                                                                " + name + " used Suggestion! 🌀 Damage: " + damage + " (CD: 3)");
        cd2 = cdTime2;
        return damage;
    }

    @Override
    public int skill3() {
        int damage = rand.nextInt(290 - 151 + 1) + 151;
        System.out.println("\n                                                                                " + name + " cast Mind Games! 🧩 Damage: " + damage + " (CD: 4)");
        cd3 = cdTime3;
        return damage;
    }

    @Override
    public void displaySkills() {
        System.out.println("                                                                                1. Mental Shock (" + cdStatus(cd1) + ")");
        System.out.println("                                                                                2. Suggestion (" + cdStatus(cd2) + ")");
        System.out.println("                                                                                3. Mind Games (" + cdStatus(cd3) + ")");
    }
    @Override
    public void displayStory(){
        System.out.print("""
                                                            A Psychology major from CIT-U who understands how people think — and uses it to her advantage in battle.
                                                            Coleen reads her opponents like open books, predicting their every move and striking when their confidence falters.
                                                            Calm, clever, and slightly mysterious, she believes that true strength comes from mastering not just the body, but the mind.
                """);
        System.out.println("                                          ╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
    }

    @Override
    public void displaySkillsDescription(){
        System.out.println("                                            1. Mental Shock – 40–80 dmg (CD: 0)");
        System.out.println("                                               - A sudden psychic jolt that disrupts the enemy’s focus.");
        System.out.println();
        System.out.println("                                            2. Suggestion – 60–140 dmg (CD: 3)");
        System.out.println("                                               - Subtly manipulates the opponent’s confidence, weakening their blows.");
        System.out.println();
        System.out.println("                                            3. Mind Games – 150-290 dmg (CD: 4)");
        System.out.println("                                               - Twists the enemy’s perception, making them hesitate — or self-destruct.");
        System.out.println("                                          ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }
}
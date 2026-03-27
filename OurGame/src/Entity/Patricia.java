package Entity;
import java.util.Random;

public class Patricia extends Character {

    public Patricia() {
        super("Patricia", 900, "CMBA", "Hotel Management");
        this.cdTime1 = 0;
        this.cdTime2 = 3;
        this.cdTime3 = 4;
    }

    @Override
    public int skill1() {
        int damage = rand.nextInt(81 - 51 + 1) + 51;
        System.out.println("\n                                                                                " + name + " smashed a tray! 🍽️ Damage: " + damage);
        cd1 = cdTime1;
        return damage;
    }

    @Override
    public int skill2() {
        int damage = rand.nextInt(131 - 91 + 1) + 91;
        System.out.println("\n                                                                                " + name + " cast Overcharge! 💵 Damage: " + damage + " (CD: 3)");
        cd2 = cdTime2;
        return damage;
    }

    @Override
    public int skill3() {
        int damage = rand.nextInt(281 - 150 + 1) + 150;
        System.out.println("\n                                                                                " + name + " used Welcome Package! 🎁 Damage: " + damage + " (CD: 4)");
        cd3 = cdTime3;
        return damage;
    }

    @Override
    public void displaySkills() {
        System.out.println("                                                                                1. Tray Smash (" + cdStatus(cd1) + ")");
        System.out.println("                                                                                2. Overcharge (" + cdStatus(cd2) + ")");
        System.out.println("                                                                                3. Welcome Package (" + cdStatus(cd3) + ")");
    }
    @Override
    public void displayStory(){
        System.out.print("""
                                                            A Hotel Management student known for her elegance and charm.
                                                            Patricia fights with poise and precision, turning every move into a display of discipline and hospitality.
                                                            Behind her calm smile is a fierce competitor who believes that order, respect, and presentation win every battle.
                """);
        System.out.println("                                          ╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
    }

    @Override
    public void displaySkillsDescription(){
        System.out.println("                                            1. Tray Smash – 50–80 dmg (CD: 0)");
        System.out.println("                                               - A polished but powerful swing with professional flair.");
        System.out.println();
        System.out.println("                                            2. Overcharge – 90–130 dmg (CD: 3)");
        System.out.println("                                               - Adds an unwanted service fee — draining the enemy’s gold over time.");
        System.out.println();
        System.out.println("                                            3. Welcome Package – 150-280 dmg (CD: 4)");
        System.out.println("                                               - Takes a quick recovery break, restoring health and refreshing skills.");
        System.out.println("                                          ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }
}
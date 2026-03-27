package Entity;

public class Ton extends Character {

    public Ton() {
        super("Ton", 720, "CCS", "Computer Science");
        this.cdTime1 = 0;
        this.cdTime2 = 3;
        this.cdTime3 = 4;
    }

    @Override
    public int skill1() {
        int damage = rand.nextInt(60 - 41 + 1) + 41;
        System.out.println("\n                                                                                " + name + " used Ping Attack! ⚡ Damage: " + damage);
        cd1 = cdTime1;
        return damage;
    }

    @Override
    public int skill2() {
        int damage = rand.nextInt(120 - 61 + 1) + 61;
        System.out.println("\n                                                                                " + name + " activated Firewall! 🧱 Damage: " + damage);
        cd2 = cdTime2;
        return damage;
    }

    @Override
    public int skill3() {
        int damage = rand.nextInt(220 - 131 + 1) + 131;
        System.out.println("\n                                                                                " + name + " used Code Crack! 💻 Damage: " + damage);
        cd3 = cdTime3;
        return damage;
    }

    @Override
    public void displaySkills() {
        System.out.println("                                                                                [1.] Ping Attack (" + cdStatus(cd1) + ")");
        System.out.println("                                                                                [2.] Firewall (" + cdStatus(cd2) + ")");
        System.out.println("                                                                                [3.] Code Crack (" + cdStatus(cd3) + ")");
    }


    @Override
    public void displayStory(){
        System.out.print("""
                                                            A CITU student who saw reality as code, Ton discovered how to hack its very rules.
                                                            In battle, he injects viruses, steals abilities, and rewrites attacks to turn them against their owners.
                                                            To him, nothing is unbreakable—not even magic.
                """);
        System.out.println("                                          ╠══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╣");
    }

    @Override
    public void displaySkillsDescription(){
        System.out.println("                                            1. Ping Attack – 40–60 dmg (CD: 0)");
        System.out.println("                                               - A quick digital strike that hits with network precision.");
        System.out.println();
        System.out.println("                                            2. Firewall – 60-120 dmg (CD: 3)");
        System.out.println("                                               - Deploys a powerful defense barrier that halves incoming damage.");
        System.out.println();
        System.out.println("                                            3. Code Crack – 120-220 dmg (CD: 4)");
        System.out.println("                                               - Breaks through the enemy’s system and steals their next move.");
        System.out.println("                                          ╚══════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }
}
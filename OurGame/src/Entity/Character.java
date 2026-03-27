package Entity;

import java.util.Random;

public abstract class Character {

    // ===== CORE ATTRIBUTES =====
    protected String name;
    protected int hp;
    protected int maxHp;
    protected String department;
    protected String program;
    protected Random rand = new Random();

    // ===== DAMAGE (Optional base stats) =====
    protected int minDamage;
    protected int maxDamage;

    // ===== COOLDOWN TRACKERS =====
    public int cd1 = 0;      // Current cooldown for Skill 1
    public int cd2 = 0;      // Current cooldown for Skill 2
    public int cd3 = 0;      // Current cooldown for Skill 3
    public int cdTime1 = 0;  // Base cooldown duration for Skill 1
    public int cdTime2 = 0;  // Base cooldown duration for Skill 2
    public int cdTime3 = 0;  // Base cooldown duration for Skill 3

    // ===== CONSTRUCTORS =====
    public Character(String name, int hp, String department, String program) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.department = department;
        this.program = program;
    }

    public Character(String name, int hp, int minDamage, int maxDamage, String department, String program) {
        this.name = name;
        this.hp = hp;
        this.maxHp = hp;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        this.department = department;
        this.program = program;
    }

    // ===== HP MANAGEMENT =====
    public void resetHp() {
        this.hp = this.maxHp;
    }

    public void takeDamage(int damage) {
        hp -= damage;
        if (hp < 0) hp = 0;
    }

    public boolean isAlive() {
        return hp > 0;
    }

    // ===== INFO GETTERS =====
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getProgram() { return program; }
    public int getHp() { return hp; }

    // ===== SKILL FRAMEWORK =====
    public abstract int skill1();
    public abstract int skill2();
    public abstract int skill3();

    public int useSkill(int choice) {
        switch (choice) {
            case 1 -> {
                cd1 = cdTime1;
                return skill1();
            }
            case 2 -> {
                cd2 = cdTime2;
                return skill2();
            }
            case 3 -> {
                cd3 = cdTime3;
                return skill3();
            }
            default -> {
                System.out.println("Invalid skill choice!");
                return 0;
            }
        }
    }

    // ===== DISPLAY METHODS =====
    public abstract void displaySkills();
    public abstract void displayStory();
    public abstract void displaySkillsDescription();

    // ===== COOLDOWN HELPERS =====
    public void reduceCooldowns() {
        if (cd1 > 0) cd1--;
        if (cd2 > 0) cd2--;
        if (cd3 > 0) cd3--;
    }

    public String cdStatus(int cd) {
        return cd > 0 ? "CD: " + cd + " turn(s)" : "Ready!";
    }

}
package Entity;

public abstract class Enemy extends Character {
    protected String type; //normal, boss, etc

    public Enemy(String name, int hp, String type, String department, String program) {
        super(name, hp, department, program);
        this.type = type;
    }

    public abstract int getSkillCount();

    //============================ ENEMY DISPLAY ====================================
    public void displayEnemy() {
        System.out.println("                                                                                Enemy: " + name);
        System.out.println("                                                                                Type: " + type);
        System.out.println("                                                                                HP: " + hp + "/" + maxHp);
    }

    public void displayName() {
        System.out.print(name);
    }
}

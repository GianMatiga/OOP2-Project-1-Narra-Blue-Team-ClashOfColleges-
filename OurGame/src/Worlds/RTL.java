package Worlds;
import Entity.Enemy;

import java.util.Random;

public class RTL {

    private static final Random rand = new Random();

    //================================== PaperHogger ==========================================

    public class PaperHogger extends Enemy {
        private boolean isDefenseActive = false;

        public PaperHogger() {
            super("Paper Hogger", 400, "Normal", "Education", "BS Education");
        }

        @Override
        public void takeDamage(int damage) {
            if (isDefenseActive) {
                damage = (int)(damage * 0.8);
                System.out.println("                                                                                🛡️ Fold Defense reduced damage to " + damage + "!");
                isDefenseActive = false;
            }
            hp -= damage;
            if (hp < 0) hp = 0;
        }
        @Override
        public int getSkillCount() { return 2; }

        //================================ SKILLS ============================================
        @Override
        public int skill1() {
            int damage = rand.nextInt(31) + 100; // 100–130
            System.out.println("                                                                                📄✂️ Paper Hogger used Paper Cut! 💥 Deals " + damage + " damage!");
            return damage;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                📜🛡️ Paper Hogger used Fold Defense!");
            isDefenseActive = true;
            return 0;
        }

        @Override
        public int skill3() { return 0; }

        //=============================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                " + name); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }

        @Override
        public void displayStory() { System.out.println("                                                                                A hoarder of school paper works, now fueled by academic stress!"); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. Paper Cut – 100–130 dmg");
            System.out.println("                                                                                2. Fold Defense – Reduces damage by 20% for 1 turn");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Paper Cut: Sharp attack using thick paper.");
            System.out.println("                                                                                - Fold Defense: Reduces damage next turn.");
        }
    }

    // ======================================= ChalkBoy ==========================================
    public class ChalkBoy extends Enemy {

        public ChalkBoy() {
            super("Chalk Boy", 300, "Normal", "Education", "BS Education");
        }

        @Override
        public void takeDamage(int damage) {
            super.takeDamage(damage);
        }

        @Override
        public int getSkillCount() { return 2; }

        //=================================== SKILLS ===========================================
        @Override
        public int skill1() {
            int damage = rand.nextInt(41) + 80; // 80–120
            System.out.println("                                                                                🧽 Chalk Boy used Chalk Toss! 💥 Deals " + damage + " damage!");
            return damage;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                🌫️ Chalk Boy used Dust Cloud! Enemy accuracy reduced by 10%!");
            return 0;
        }

        @Override
        public int skill3() { return 0; }

        //=================================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                " + name); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }
        @Override
        public void displayStory() { System.out.println("                                                                                A teacher’s assistant reborn from the dusty corners of the classroom."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. Chalk Toss – 80–120 dmg");
            System.out.println("                                                                                2. Dust Cloud – Lowers enemy accuracy by 10%");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Chalk Toss: Throws a sharp chalk stick!");
            System.out.println("                                                                                - Dust Cloud: Blinds enemy temporarily.");
        }
    }

    //====================================== Wierdo ===============================================
    public class Wierdo extends Enemy {

        public Wierdo() {
            super("Weirdo", 250, "Normal", "CCS", "BS Information Technology");
        }

        @Override
        public void takeDamage(int damage) {
            super.takeDamage(damage);
        }

        @Override
        public int getSkillCount() { return 2; }

        //=================================== SKILLS ===========================================
        @Override
        public int skill1() {
            int damage = rand.nextInt(21) + 90; // 90–110
            System.out.println("                                                                                😱 Weirdo screamed! Deals " + damage + " damage!");
            return damage;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                🤪 Weirdo freaks out! Unpredictable behavior!");
            return 0;
        }

        @Override
        public int skill3() { return 0; }

        //=================================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                Weirdo"); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }
        @Override
        public void displayStory() { System.out.println("                                                                                An odd entity lurking in the halls, mumbling equations and nonsense."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. Scream – 90–110 dmg");
            System.out.println("                                                                                2. Freak Out – Random effect");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Scream: Deals moderate damage.");
            System.out.println("                                                                                - Freak Out: May confuse or buff itself.");
        }
    }

    //==================================== RTL Phantom ==========================================
    public class RTLPhantom extends Enemy {
        private boolean isDodging = false;

        public RTLPhantom() {
            super("RTL Phantom", 500, "Elite", "Education", "BS Education");
        }

        @Override
        public void takeDamage(int damage) {
            if (isDodging) {
                System.out.println("                                                                                💨 RTL Phantom dodged the attack!");
                isDodging = false;
                return;
            }
            hp -= damage;
            if (hp < 0) hp = 0;
        }

        @Override
        public int getSkillCount() { return 2; }

        //=================================== SKILLS ===========================================
        @Override
        public int skill1() {
            int damage = rand.nextInt(31) + 120; // 120–150
            System.out.println("                                                                                👻 RTL Phantom used Phantom Swipe! 💥 Deals " + damage + " damage!");
            return damage;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                💨 RTL Phantom vanished! Next attack will miss!");
            isDodging = true;
            return 0;
        }

        @Override
        public int skill3() { return 0; }

        //=================================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                RTL Phantom"); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }
        @Override
        public void displayStory() { System.out.println("                                                                                A ghostly being haunting the Research, Thesis, and Literature halls."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. Phantom Swipe – 120–150 dmg");
            System.out.println("                                                                                2. Vanish – Avoids next attack");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Phantom Swipe: Deals heavy ghost damage.");
            System.out.println("                                                                                - Vanish: Evades next attack completely.");
        }
    }

    // BossPrincipal
    public class BossPrincipal extends Enemy {
        private boolean isShielded = false;

        public BossPrincipal() {
            super("Principal", 1000, "Boss", "CMBA", "BS Business Administration");
        }

        @Override
        public void takeDamage(int damage) {
            if (isShielded) {
                damage = (int)(damage * 0.7);
                System.out.println("                                                                                🏫 Principal’s defense reduced damage to " + damage + "!");
                isShielded = false;
            }
            hp -= damage;
            if (hp < 0) hp = 0;
        }
        @Override
        public int getSkillCount() { return 3; }

        //=================================== SKILLS ===========================================
        @Override
        public int skill1() {
            int damage = rand.nextInt(31) + 150; // 150–180
            System.out.println("                                                                                📋 Principal used Detention Slip! 💥 Deals " + damage + " damage!");
            return damage;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                🏫 Principal called a Faculty Meeting! Defense increased!");
            isShielded = true;
            return 0;
        }

        @Override
        public int skill3() {
            System.out.println("                                                                                🚫 Principal issued a Suspension! Target stunned!");
            return 0;
        }
        //=================================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                Principal"); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }
        @Override
        public void displayStory() { System.out.println("                                                                                The strict overseer of the RTL realm — no late submissions tolerated."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. Detention Slip – 150–180 dmg");
            System.out.println("                                                                                2. Faculty Meeting – Buffs self");
            System.out.println("                                                                                3. Suspension – Stuns target");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Detention Slip: Heavy punishment attack.");
            System.out.println("                                                                                - Faculty Meeting: Temporarily increases defense.");
            System.out.println("                                                                                - Suspension: Stuns the opponent.");
        }
    }
}



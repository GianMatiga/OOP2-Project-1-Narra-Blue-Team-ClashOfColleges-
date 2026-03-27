package Worlds;

import Entity.Enemy;

import java.util.Random;

public class GLE {

    private static final Random rand = new Random();

    //==================================== Arkiiteks =========================================
    public class Arkiiteks extends Enemy {
        public Arkiiteks() { super("Arkiiteks", 420, "Normal","CEA", "BS Architecture"); }

        @Override
        public void takeDamage(int damage) {
            super.takeDamage(damage);
        }

        @Override
        public int getSkillCount() { return 2; }

        //================================ SKILLS ============================================
        @Override
        public int skill1() {
            int dmg = rand.nextInt(41) + 90;
            System.out.println("                                                                                ✏️ Arkiiteks used Draft Slash! Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                📐 Arkiiteks raised a Blueprint Shield! Damage will be reduced!");
            return 0;
        }

        @Override
        public int skill3() { return 0; }
        //=============================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                Arkiiteks"); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }

        @Override
        public void displayStory() { System.out.println("                                                                                A diligent architect who drafts both dreams and destruction!"); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. ✏️ Draft Slash – 90–130 dmg");
            System.out.println("                                                                                2. 📐 Blueprint Shield – Blocks 25% damage next turn");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Draft Slash: A sharp drawing blade attack.");
            System.out.println("                                                                                - Blueprint Shield: Reduces incoming damage temporarily.");
        }
    }

    //=================================== Mc Cue Pal =========================================
    public class McCuePal extends Enemy {
        public McCuePal() { super("Mc Cue Pal", 480, "Normal","CEA", "BS Chemical Engineer"); }

        @Override
        public void takeDamage(int damage) {
            super.takeDamage(damage);
        }
        @Override
        public int getSkillCount() { return 2; }

        //================================ SKILLS ============================================
        @Override
        public int skill1() {
            int dmg = rand.nextInt(41) + 100;
            System.out.println("                                                                                💧 Mc Cue Pal splats Goo Splash! Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                🧼 Mc Cue Pal spreads Sticky Trail! You’re slowed!");
            return 0;
        }

        @Override
        public int skill3() { return 0; }

        //=============================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                Mc Cue Pal"); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }

        @Override
        public void displayStory() { System.out.println("                                                                                A sticky blob made of failed glue experiments—now sentient and mischievous!"); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. 💧 Goo Splash – 100–140 dmg");
            System.out.println("                                                                                2. 🧼 Sticky Trail – Slows enemy actions next turn");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Goo Splash: Sticky damage attack.");
            System.out.println("                                                                                - Sticky Trail: Makes enemies sluggish for a turn.");
        }
    }

    //============================== Dr. Narr Singh ==========================================
    public class DrNarrSingh extends Enemy {
        public DrNarrSingh() { super("Dr. Narr Singh", 550, "Normal","CNAHS", "BS Nursing"); }

        @Override
        public void takeDamage(int damage) {
            super.takeDamage(damage);
        }

        @Override
        public int getSkillCount() { return 2; }

        //================================ SKILLS ============================================
        @Override
        public int skill1() {
            int dmg = rand.nextInt(41) + 120;
            System.out.println("                                                                                ⚡ Dr. Narr Singh unleashed Electric Shock! Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                💥 Experiment backfired! Dr. Narr Singh takes 50 recoil damage!");
            hp = Math.max(0, hp - 50);
            return 180;
        }

        @Override
        public int skill3() { return 0; }
        //=============================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                Dr. Narr Singh"); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }

        @Override
        public void displayStory() { System.out.println("                                                                                A brilliant yet reckless scientist obsessed with chemical experiments."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. ⚡ Electric Shock – 120–160 dmg");
            System.out.println("                                                                                2. 💥 Experiment Gone Wrong – 180 dmg, takes 50 recoil dmg");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Electric Shock: High-voltage burst of energy.");
            System.out.println("                                                                                - Experiment Gone Wrong: Huge damage but harms the user too.");
        }
    }

    //================================== Seer Enjeeniir ======================================
    public class SeerEnjeeniir extends Enemy {
        public SeerEnjeeniir() { super("Seer Enjeeniir", 600, "Elite","CEA", "BS Civil Engineer"); }

        @Override
        public void takeDamage(int damage) {
            super.takeDamage(damage);
        }

        @Override
        public int getSkillCount() { return 2; }

        //================================ SKILLS ============================================
        @Override
        public int skill1() {
            int dmg = rand.nextInt(31) + 130;
            System.out.println("                                                                                ⚙️ Seer Enjeeniir hurled a Gear Toss! Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            int heal = 100;
            int actualHeal = Math.min(heal, maxHp - hp);
            hp += actualHeal;
            System.out.println("                                                                                🤖 Seer Enjeeniir deployed Repair Drone! Restoring HP.");
            return actualHeal;
        }

        @Override
        public int skill3() { return 0; }

        //=============================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                Seer Enjeeniir"); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }

        @Override
        public void displayStory() { System.out.println("                                                                                A mechanical genius who fights using his custom-built gadgets!"); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. ⚙️ Gear Toss – 130–160 dmg");
            System.out.println("                                                                                2. 🤖 Repair Drone – Restores HP");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Gear Toss: Launches sharp gears for solid damage.");
            System.out.println("                                                                                - Repair Drone: Sends a drone to heal himself.");
        }


    }

    //==================================== Boss G ============================================
    public class BossG extends Enemy {
        public BossG() { super("Boss G", 1000, "Boss","CEA", "BS Engineering"); }

        @Override
        public void takeDamage(int damage) {
            super.takeDamage(damage);
        }

        @Override
        public int getSkillCount() { return 3; }
        //================================ SKILLS ============================================
        @Override
        public int skill1() {
            int dmg = rand.nextInt(41) + 180;
            System.out.println("                                                                                ☣️ Boss G unleashed Chemical Burst! Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                🌫️ Boss G released Toxic Fog! Enemy attack power reduced!");
            return 0;
        }

        @Override
        public int skill3() {
            System.out.println("                                                                                💣 Boss G activated Acid Overload! A massive chemical blast!");
            if (rand.nextInt(100) < 20) {
                System.out.println("                                                                                😵 The reaction backfired! Boss G took 100 damage!");
                hp = Math.max(0, hp - 100);
            }
            return 300;
        }
        //=============================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                Boss G"); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }

        @Override
        public void displayStory() { System.out.println("                                                                                The ultimate engineer whose toxic inventions can destroy cities!"); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1. ☣️ Chemical Burst – 180–220 dmg");
            System.out.println("                                                                                2. 🌫️ Toxic Fog – Reduces enemy attack by 25%");
            System.out.println("                                                                                3. 💣 Acid Overload – 300 dmg, 20% chance to self-damage");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Chemical Burst: Explosive chemical shot.");
            System.out.println("                                                                                - Toxic Fog: Weakens enemies’ attacks.");
            System.out.println("                                                                                - Acid Overload: Devastating attack with recoil risk.");
        }
    }
}

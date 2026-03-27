package Worlds;

import Entity.Enemy;

import java.util.Random;

public class BasketballCourt {

    private static final Random rand = new Random();

    //================================== Dribble Gableen =====================================
    public class DribbleGableen extends Enemy {
        private boolean isBuffed = false;

        public DribbleGableen() {
            super("Dribble Gableen", 420, "Normal" ,"PE Department", "BS Physical Education");
        }

        @Override
        public void takeDamage(int damage) {
            super.takeDamage(damage);
        }
        @Override
        public int getSkillCount() { return 2; }

        //================================ SKILLS ============================================
        @Override
        public int skill1() {
            int dmg = rand.nextInt(31) + 90;
            if (isBuffed) {
                dmg *= 2;
                isBuffed = false;
                System.out.println("                                                                                💥 Dribble Gableen’s next attack is doubled!");
            }
            System.out.println("                                                                                1️⃣ Dribble Gableen used Crossover! 💥 Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                2️⃣ Dribble Gableen used Ankle Break! 🌀 Next attack will deal double damage!");
            isBuffed = true;
            return 0;
        }

        @Override
        public int skill3() { return 0; }

        //=============================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                Dribble Gableen"); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }

        @Override
        public void displayStory() { System.out.println("                                                                                A flashy dribbler who breaks ankles and hearts on the court."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1️⃣ Crossover – 💥 90–120 dmg");
            System.out.println("                                                                                2️⃣ Ankle Break – 🌀 Doubles next attack damage");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Crossover: A tricky dribble that hits fast.");
            System.out.println("                                                                                - Ankle Break: Doubles damage of the next attack.");
        }
    }


    //===================================== Spike Jupeta ======================================
    public class SpikeJupeta extends Enemy {
        private boolean isDodging = false;

        public SpikeJupeta() {
            super("Spike Jupeta", 450, "Normal","CNAHS", "BS Nursing");
        }

        @Override
        public void takeDamage(int dmg) {
            if (isDodging) {
                System.out.println("                                                                                💨 Spike Jupeta dodged the attack!");
                isDodging = false;
                return;
            }
            hp -= dmg;
            if (hp < 0) hp = 0;
        }

        @Override
        public int getSkillCount() { return 2; }

        //================================ SKILLS ============================================
        @Override
        public int skill1() {
            int dmg = rand.nextInt(41) + 100;
            System.out.println("                                                                                1️⃣ Spike Jupeta used Minus Tempo! ⚡ Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                2️⃣ Spike Jupeta used Jupeta Dash! 💨 Will dodge next attack!");
            isDodging = true;
            return 0;
        }

        @Override
        public int skill3() { return 0; }

        //=============================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                Spike Jupeta"); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }

        @Override
        public void displayStory() { System.out.println("                                                                                Fast as lightning, Spike Jupeta never lets the ball touch the ground."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1️⃣ Minus Tempo – ⚡ 100–140 dmg");
            System.out.println("                                                                                2️⃣ Jupeta Dash – 💨 Evades next attack");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Minus Tempo: Fast strike that hits before you blink.");
            System.out.println("                                                                                - Jupeta Dash: Dodges the next incoming attack.");
        }
    }

    //================================= Referee =============================================
    public class Referee extends Enemy {
        public Referee() {
            super("Referee", 500, "Normal","PE Department", "BS Physical Education");
        }

        @Override
        public void takeDamage(int damage) {
            super.takeDamage(damage);
        }
        @Override
        public int getSkillCount() { return 2; }


        //================================ SKILLS ============================================
        @Override
        public int skill1() {
            int dmg = rand.nextInt(31) + 120;
            System.out.println("                                                                                1️⃣ Referee used Red Card! 🟥 Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                2️⃣ Referee used Foul Call! 📢 Opponent stunned for 1 turn!");
            return 0;
        }

        @Override
        public int skill3() { return 0; }
        //=============================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                Referee"); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }

        @Override
        public void displayStory() { System.out.println("                                                                                The whistle of justice echoes through the court—no foul goes unnoticed!"); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1️⃣ Red Card – 🟥 120–150 dmg");
            System.out.println("                                                                                2️⃣ Foul Call – 📢 Stuns for 1 turn");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Red Card: Heavy strike that punishes reckless play.");
            System.out.println("                                                                                - Foul Call: Stuns the opponent with authority.");
        }
    }
    //================================ Bouncy Ampol ===========================================
    public class BouncyAmpol extends Enemy {
        private boolean isReflecting = false;

        public BouncyAmpol() {
            super("Bouncy Ampol", 470, "Elite","CTHM", "BS Hotel Managment");
        }

        @Override
        public void takeDamage(int dmg) {
            if (isReflecting) {
                int reflected = (int)(dmg * 0.3);
                System.out.println("                                                                                🦴 Bouncy Ampol reflects " + reflected + " damage back!");
                dmg = (int)(dmg * 0.7);
                isReflecting = false;
            }
            hp -= dmg;
            if (hp < 0) hp = 0;
        }

        @Override
        public int getSkillCount() { return 2; }

        //================================ SKILLS ============================================
        @Override
        public int skill1() {
            int dmg = rand.nextInt(41) + 110;
            System.out.println("                                                                                1️⃣ Bouncy Ampol used Ampol Dunk! 💀 Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                2️⃣ Bouncy Ampol activated Ampol Boner v1! 🦴 Will reflect next damage!");
            isReflecting = true;
            return 0;
        }

        @Override
        public int skill3() { return 0; }
        //=============================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                Bouncy Ampol"); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }

        @Override
        public void displayStory() { System.out.println("                                                                                Once a dunk master, now an undead baller rising for one last game."); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1️⃣ Ampol Dunk – 💀 110–150 dmg");
            System.out.println("                                                                                2️⃣ Ampol Boner v1 – 🦴 Reflects 30% of next damage");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Ampol Dunk: Heavy slam from beyond the grave.");
            System.out.println("                                                                                - Ampol Boner v1: Reflects part of the next damage received.");
        }
    }

    //=================================== Aura Master ======================================
    public class AuraMaster extends Enemy {
        private boolean hasBarrier = false;

        public AuraMaster() {
            super("Aura Master", 1000, "Boss","PE Department", "BS Physical Education");
        }

        @Override
        public void takeDamage(int dmg) {
            if (hasBarrier) {
                System.out.println("                                                                                🛡️ Aura Master blocked the attack!");
                hasBarrier = false;
                return;
            }
            hp -= dmg;
            if (hp < 0) hp = 0;
        }
        @Override
        public int getSkillCount() { return 3; }

        //================================ SKILLS ============================================
        @Override
        public int skill1() {
            int dmg = rand.nextInt(41) + 180;
            System.out.println("                                                                                1️⃣ Aura Master used Dunk it Jonathan! 🔥 Deals " + dmg + " damage!");
            return dmg;
        }

        @Override
        public int skill2() {
            System.out.println("                                                                                2️⃣ Aura Master activated Aura Barrier! 🛡️ Will block next attack!");
            hasBarrier = true;
            return 0;
        }

        @Override
        public int skill3() {
            System.out.println("                                                                                3️⃣ Aura Master used Full Court Buwaya! 💥 Deals 300 damage to all!");
            return 300;
        }
        //=============================== DISPLAYS ===========================================
        @Override
        public void displayName() { System.out.print("                                                                                Aura Master"); }

        @Override
        public void displayEnemy() {
            super.displayEnemy();
        }

        @Override
        public void displayStory() { System.out.println("                                                                                A legendary baller who mastered aura control—his shots shake the court!"); }

        @Override
        public void displaySkills() {
            System.out.println("                                                                                1️⃣ Dunk it Jonathan – 🔥 180–220 dmg");
            System.out.println("                                                                                2️⃣ Aura Barrier – 🛡️ Blocks next attack");
            System.out.println("                                                                                3️⃣ Full Court Buwaya – 💥 300 dmg AOE blast");
        }

        @Override
        public void displaySkillsDescription() {
            System.out.println("                                                                                - Dunk it Jonathan: Fiery dunk that scorches the floor.");
            System.out.println("                                                                                - Aura Barrier: Blocks one incoming attack.");
            System.out.println("                                                                                - Full Court Buwaya: Devastating AOE ultimate attack.");
        }
    }
}

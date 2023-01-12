/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author colep
 */
public class GameSim {

    public static int generateRandomNum(int Low, int High) {
        return (int) (Math.random() * (High - Low) + Low);
    }

    public static int getBossHealth(int multi, int level) {
        return 50 + level * multi * 10;
    }

    public static int getTotalDamage(int bossHealth, int attackNum) {

        int atk, atkDamage;
        atkDamage = 0;
        String atkType = "";

        atk = generateRandomNum(1, 6);

        if (atk == 1) {
            atkDamage = 0;
            atkType = ("MISS");

        } else if (atk == 2) {
            atkDamage = 2 * 15;
            atkType = ("NORMAL");

        } else if (atk == 3) {
            atkDamage = 3 * 15;
            atkType = ("NORMAL");

        } else if (atk == 4) {
            atkDamage = 4 * 15;
            atkType = ("NORMAL");

        } else if (atk == 5) {
            atk = 5;
            atkDamage = bossHealth / 2;
            atkType = ("CRITICAL");
        }
        System.out.println("ATTACK: " + attackNum + "   ATTACK TYPE: " + atkType + "   ATTACK DAMAGE: " + atkDamage);
        return atkDamage;

    }

    //change the 2 back to 11 for proper code
    public static void main(String[] args) {
        for (int level = 1; level < 11; level++) {

            int multi = generateRandomNum(1, 4);
            int bossHealth = getBossHealth(multi, level);
            int atkTotal = 0;

            System.out.println("\n" + "\n" + "LEVEL: " + level);
            System.out.println("BOSS TOTAL HEALTH: " + getBossHealth(multi, level));
            for (int turn = 1; turn < 5; turn++) {

                int atkDamage = getTotalDamage(bossHealth, turn);

                atkTotal = atkTotal + atkDamage;

            }
            System.out.println("TOTAL ATTACK DAMAGE: " + atkTotal);

            int newBossHealth = bossHealth - atkTotal;

            if (newBossHealth < 0) {
                newBossHealth = 0;
            }

            if (atkTotal >= bossHealth) {
                System.out.println("BOSS HEALTH REMAINING: " + newBossHealth);
                System.out.println("BOSS DEFEATED");

            } else if (atkTotal < bossHealth) {
                System.out.println("BOSS HEALTH REMAINING: " + newBossHealth);
                System.out.println("LEVEL LOST");

            }

        }

    }

}

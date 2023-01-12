/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Methods;

/**
 *
 * @author colep
 */
public class EggsSim {

    public static int totalEggs = 25;
    public static int totalPower = 0;
    public static int bestPower = 0;
    public static int bestDay = 0;

    public static int generateRandomNum(int Low, int High) {
        return (int) (Math.random() * (High - Low) + Low);
    }

    public static void oneDay() {
        totalPower = 0;

        int numEggs = generateRandomNum(2, 8);

        if (numEggs > totalEggs) {
            totalEggs = numEggs;
        }

        System.out.println("Total Eggs: " + totalEggs + "\n" + "Eggs for the day: " + numEggs);

        totalEggs -= numEggs;

        for (int eggNum = 1; eggNum <= numEggs; eggNum++) {

            int power = 0;
            String type = "";

            int eggType = generateRandomNum(1, 3);

            if (eggType == 1) {
                type = "Elf";
                power = 430;

            } else if (eggType == 2) {
                type = "Vampire";
                power = 320;

            } else if (eggType == 3) {
                type = "Zombie";
                power = 175;

            }

            totalPower = totalPower + power;

            System.out.println("Egg: " + eggNum + "  Type: " + type + "   Power: " + power);

        }
        System.out.println("Total power for the day: " + totalPower + "\n");

    }

    public static void main(String[] args) {

        for (int day = 1; day <= 7; day++) {

            System.out.println("DAY " + day + ":" + "\n");
            oneDay();
            if (totalPower > bestPower) {
                bestPower = totalPower;
                bestDay = day;
            }
            if (totalEggs == 0) {
                break;
            }

        }
        System.out.println("The most power generated was " + bestPower + " on day ");

    }
}

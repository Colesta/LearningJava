//Cole Peters November Exam Revision 2021 Grade 10
package NovemberRevision;

import javax.swing.JOptionPane;

//2.1
public class LeagueTwenty {

    //2.2
    private static String currentPlayerName = "";
    private static Double currentPlayerAverage = 0.0;
    private static int currentPlayerFifties = 0;
    private static int MvpNum = 0;
    private static String MVPname;
    private static double topMVPnum = 0;
    private static String topMVPname;

    public static void main(String[] args) {
        int PlayerNum = 0;
        //3.1
        currentPlayerName = JOptionPane.showInputDialog("Input a Player's Name");
        //3.2
        System.out.println("====================" + "\n" + "PLAYER STATS" + "\n" + "====================");
        //3.3
        while (!"XXX".equals(currentPlayerName)) {
            //3.4
            System.out.println("NAME: " + currentPlayerName);
            //5.1
            generatePlayer();
            System.out.println(" " + "\n" + " ");
            //3.5
            currentPlayerName = JOptionPane.showInputDialog("Input a Player's Name");
            //3.6
            PlayerNum += 1;
        }
        //5.2
        System.out.println("====================" + "\n" + "TEAM STATS" + "\n" + "====================");
        //5.3
        System.out.println("MVP COUNT : " + MvpNum);
        System.out.println("MVP NAMES : " + MVPname);
        //5.4
        System.out.println("MVP WINNER : " + topMVPname);
        System.out.println("MVP AVG : " + topMVPnum);
    }

    //4.1
    public static void generatePlayer() {
        String experinceLevel = "";
        int playerScore = 1;
        //4.2
        int playerExperience = (int) (Math.random() * (4 - 1)) + 1;
        switch (playerExperience) {
            //4.3
            case 1:
                experinceLevel = "junior";
                break;
            case 2:
                experinceLevel = "senior";
                break;
            case 3:
                experinceLevel = "expert";
                break;
        }
        System.out.println("EXP: " + experinceLevel);
        //4.5
        createPlayerCode(currentPlayerName);
        //4.6
        int games = 5;
        for (int i = 0; i < games; i++) {
            switch (playerExperience) {
                case 1:
                    playerScore = (int) (Math.random() * 50 - 0) + 0;
                    break;
                case 2:
                    playerScore = (int) (Math.random() * 100 - 0) + 0;
                    break;
                case 3:
                    playerScore = (int) (Math.random() * 150 - 0) + 0;
                    break;
            }
            if (playerScore >= 50) {
                currentPlayerFifties += 1;
            }
            currentPlayerAverage = currentPlayerAverage + playerScore;
        }
        //4.7
        currentPlayerAverage = currentPlayerAverage / games;
        currentPlayerAverage = Math.round(currentPlayerAverage * 10.0) / 10.0;

        if (currentPlayerAverage > topMVPnum) {
            topMVPnum = currentPlayerAverage;
            topMVPname = currentPlayerName;

        }

        //4.8
        if (currentPlayerFifties >= 3) {
            System.out.println("NOM: true");
            MvpNum += 1;
            MVPname += currentPlayerName + "";
        } else {
            System.out.println("NOM: false");
        }

    }

    //4.4
    public static void createPlayerCode(String name) {
        name = currentPlayerName.toUpperCase();
        String L1 = name.charAt(0) + "";
        String L2 = name.charAt(3) + "";
        String L3 = name.charAt(2) + "";
        String Num = name.length() + "";
        System.out.println("CODE: " + L1 + L2 + L3 + Num);

    }

}

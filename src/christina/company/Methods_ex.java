package christina.company;

public class Methods_ex {
    public static void main(String[] args) {
        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("Tim", highScorePosition);

        highScorePosition = calculateHighScorePosition(900);
        displayHighScorePosition("Bob", highScorePosition);

        highScorePosition = calculateHighScorePosition(400);
        displayHighScorePosition("Percy", highScorePosition);

        highScorePosition = calculateHighScorePosition(50);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Gilbert", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Gilbert", highScorePosition);

    }

    public static oid displayHighScorePosition(String playerName, int highScorePosition)
    {
        System.out.println(playerName + " managed to get into position "
                + highScorePosition + " on the high score table");

    }

    public static int calculateHighScorePosition(int playerScore)
    {
//        if (playerScore >= 1000)
//        {
//            return 1;
//        }
//        else if (playerScore >= 500 && playerScore < 1000)
//        {
//            return 2;
//        }
//        else if (playerScore >= 100 && playerScore < 500);
//        {
//            return 3;
//        }
//        else
//        {
//            return 4;
//        }

        int position = 4;   // assuming position 4 will be returned

        if (playerScore >= 1000) {
            position = 1;
        } else if (playerScore >= 500) {
            position = 2;
        } else if (playerScore >= 100) {
            position = 3;
        }

        return position;
    }

}

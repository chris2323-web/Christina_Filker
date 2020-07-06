package christina.company;

public class Methods_Java {
    public static void main(String[] args)
    {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(gameOver, score, levelCompleted, bonus);
        System.out.println("Your final Score was: " + highScore);

        highScore = calculateScore(true, 1000, 8, 200);
        System.out.println("Your final Score was: " + highScore);

        highScore = calculateScore(false, 100, 8, 200);
        System.out.println("Your final Score was: " + highScore);

//        if (gameOver == true)
//        {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final 1st Score was: " + finalScore);
//        }

//        gameOver = true;
//        score = 10000;
//        levelCompleted = 8;
//        bonus = 200;
//
//        if (gameOver == true)
//        {
//            int finalScore = score + (levelCompleted * bonus);
//            System.out.println("Your final 2nd Score was: " + finalScore);
//        }
    }


    public static int calculateScore(boolean gameOver, int score, int levelCompleted, int bonus)
    {

        if (gameOver == true)
        {
            int finalScore = score + (levelCompleted * bonus);
            finalScore = finalScore + 2000;
            return finalScore;
        }
            return -1;
    }


}

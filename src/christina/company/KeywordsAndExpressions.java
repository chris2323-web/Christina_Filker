package christina.company;

public class KeywordsAndExpressions {
    public static void main(String[] args)
    {
        int myVariable = 50;    //the entire line is a statement and "myVariable = 50;" is the expression.
        boolean gameOver = true;
        int score;
        score = 800;
        int levelCompleted;
        levelCompleted = 5;
        int bonus;
        bonus = 100;

//        if(score < 5000 && score > 1000)
//        {
//            System.out.println("Score was less than 5000 but greater than 1000");  //mai mic de 5000 dar mai mare de 1000
//        }
//        else if ( score < 1000)                                                    // mai mic de 1000
//        {
//            System.out.println("Score was less than 1000");
//        }
//        else
//        {
//            System.out.println("Got here");
//        }

        if (gameOver == true)
        {
         int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final 1st Score was: " + finalScore);
        }

       score = 10000;
       levelCompleted = 8;
       bonus = 200;

        if (gameOver == true)
        {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final 2nd Score was: " + finalScore);
        }

    }

}

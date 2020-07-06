package christina.company;

public class Operators {

    public Operators() {
    }

    public static void main(String[] args) {
        int result = 1 + 2; //1 + 2 = 3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1;  // 3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5;  // 20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        result = result % 3;    // the remainder of (4 % 3 ) = 1
        System.out.println("4 % 3  = " + result);

        //result = result + 1;
        result++; // 1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        //result = result - 1;
        result--; // 2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2;
        result += 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        //result = result * 10
        result *= 10; //3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3; //30 / 3 = 10
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -= 2; // 10 - 2 = 8
        System.out.println("10 - 2 = " + result);

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 80;
        if (topScore < 100)
        {
            System.out.println("You got the high score!");
        }


        int secondTopScore = 60;
        if (topScore > secondTopScore && topScore < 100 )
        {
            System.out.println("Greater then second top score and less than 100");
        }


        if (topScore < secondTopScore || topScore > 100 )
        {
            System.out.println("less then second top score and less than 100");
        }

        boolean isCar = false;
        if (isCar)
        {
            System.out.println("(isCAr) tests for true");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if (wasCar)
        {
            System.out.println("wasCar is true");
        }

        int ageOfClient = 20;
        boolean isEighteenOrOver = (ageOfClient == 20) ? true : false;
        if (isEighteenOrOver)
        {
            System.out.println("it is greater than 18");
        }


        //Challenge - 39
        double mydouble = 20.00d;
        double mydouble2 = 80.00d;
        double resultdouble = (mydouble + mydouble2) * 100.00d;
        System.out.println(resultdouble);

        resultdouble = resultdouble % 40d;   //10000 % 40.00
        System.out.println("10000 % 40d: " + resultdouble);

        boolean reminderresult = (resultdouble == 0) ? true : false;
        System.out.println("if the reminder is 0 the result should be true: " + reminderresult);

        if (!reminderresult)
        {
            System.out.println("Got some remainder");
        }

        for (int i = 0; i < ; i++) {
            
        }



    }
}

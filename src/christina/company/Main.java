package christina.company;

public class Main
{
    public static void main(String[] args)
    {
	    int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value = " + myMinIntValue);
        System.out.println("Integer Maximum Value = " + myMaxIntValue);
        System.out.println("Busted Max value = " + (myMaxIntValue + 1));
        System.out.println("Busted Min value = " + (myMinIntValue - 1));

        int myMaxIntText = 2147483647;
        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue / 2);

        byte number = 23;
        short number1 = 100;
        int number2 = 1230;
        long Total = 50000L + (number + number1 + number2) * 10L;
        System.out.println("Long total is = " + Total);

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("FloatMinimum Value = " + myMinFloatValue);
        System.out.println("FloatMaximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("DoubleMinimum Value = " + myMinDoubleValue);
        System.out.println("DoubleMaximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue: " + myIntValue);
        System.out.println("MyFloatValue: " + myFloatValue);
        System.out.println("MyDoubleValue: " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilogram = numberOfPounds * 0.45359237d;
        System.out.println("Converted kg = " + convertedKilogram );

        char myChar = 'D';
        char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

        char myCopyright = '\u00A9';
        System.out.println(myCopyright);

        String myString = "This is a string";
        System.out.println("my String is: " + myString);
        myString = myString + ", and this is more.";
        System.out.println("my String is: " + myString);
        myString = myString + "\u00A9 2019";
        System.out.println("my String is: " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.55";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println(lastString);



    }
}

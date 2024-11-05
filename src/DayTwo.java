import java.util.Scanner;

public class DayTwo {
    public static void main(String[] args) {
        /*
        // 1. Hello World
        System.out.println("Hello World!");

        // 2. Simple Calculator
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        float a = scanner.nextFloat();
        System.out.print("Enter second number: ");
        float b = scanner.nextFloat();
        System.out.println("First number + second number = " + (a+b));
        System.out.println("First number - second number = " + (a-b));
        System.out.println("First number * second number = " + (a*b));
        System.out.println("First number / second number = " + (a/b));

        // 3. Odd or Even
        System.out.print("Enter a number: ");
        int c = scanner.nextInt();
        if (c % 2 == 0) {
            System.out.println("This number is even");
        } else {
            System.out.println("This number is odd");
        }

        // 4. Greatest Number
        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Enter third number: ");
        int thirdNumber = scanner.nextInt();
        if (firstNumber>=secondNumber && firstNumber>=thirdNumber) {
            System.out.println("Greatest number is " + firstNumber);
        } else if (secondNumber>=firstNumber && secondNumber>=thirdNumber) {
            System.out.println("Greatest number is " + secondNumber);
        } else {
            System.out.println("Greatest number is " + thirdNumber);
        }
        */

        // E1. Text toUpper, E2. Text toLower

        String txtLower = "hello world";
        System.out.println(txtLower.toUpperCase());

        String txtUpper = "HELLO WORLD";
        System.out.println(txtUpper.toLowerCase());

        // E3. Check if String contains a Substring
        String txtContain = "Hello, world!";
        System.out.println(txtContain.contains("world"));

        // E4. First Char
        String firstCharOf = "Hello";
        System.out.println(firstCharOf.charAt(0));

        // E5. Replace Char
        String replaceCharOf = "Hello, World!";
        System.out.println(replaceCharOf.replace('o', 'a'));

        // E6. Check string start and end substrings
        String myString = "Hello, World!";
        String startString = "Hello";
        String endString = "World!";
        System.out.println(myString.startsWith(startString));
        System.out.println(myString.endsWith(endString));

        // E7. Extracting Substring Between Two Indices
        System.out.println(myString.substring(7, 12));

        // E8. Find 1st and last occurence of char
        String charOccurrence = "Abracadabra";
        System.out.println(charOccurrence.indexOf('a'));
        System.out.println(charOccurrence.lastIndexOf('a'));

        // E9. Replace Word In Sentence
        String mySentence = "Java is fun";
        System.out.println(mySentence.replace("fun", "awesome"));
    }
}

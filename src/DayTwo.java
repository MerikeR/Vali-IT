import java.util.Scanner;

public class DayTwo {
    public static void main(String[] args) {

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
        int d = scanner.nextInt();
        System.out.print("Enter second number: ");
        int e = scanner.nextInt();
        System.out.print("Enter third number: ");
        int f = scanner.nextInt();
        if (d>e && d>f) {
            System.out.println("Greatest number is " + d);
        } else if (e>d && e>f) {
            System.out.println("Greatest number is " + e);
        } else {
            System.out.println("Greatest number is " + f);
        }

    }
}

import java.util.Scanner;

public class Day7 {
    /*
    public static void main(String[] args) {
        int number = 7;
        String result = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println("The number is " + number +  " is " + result);
    }

    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 20;
        int result = (num1<=num2) ? num2 : num1;
        System.out.println("The maximum number is " + result);
    }
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age: ");
        int personsAge = scanner.nextInt();
        int expectedAge = 18;
        String result = (personsAge >= expectedAge) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(result);
    }
}

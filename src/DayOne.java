//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class DayOne {
    public static void main(String[] args) {

        /*

        System.out.println("Merike");


        int a = 1;
        int b = 2;
        if (b > a) {
            System.out.println("b is bigger than a");
        } else if (b < a) {
            System.out.println("b is smaller than a");
        } else {
            System.out.println("b is equal to a");
        }*/


        int a = -2;
        int b = 3;
        if (b > a && a > 0) {
            System.out.println("b is bigger than a, and a is positive");
        } else if (a > b && b > 0) {
            System.out.println("a is bigger than b, and b is positive");
        } else if (a == b || (a < 0 && b < 0)) {
            System.out.println("a and b are either equal or both are negative");
        } else {
            System.out.println("No specific conditions were met");
        }

    }
}
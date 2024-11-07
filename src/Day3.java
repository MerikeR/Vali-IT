import java.util.Arrays;

public class Day3 {
    /*
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        getArea(a, b);
    }
    private static void getArea(int a, int b) {
        int pindala = a * b;
        checkArea(pindala);
    }
    private static void checkArea(int pindala) {
        if (pindala > 20) {
            System.out.println("Area is bigger than 20");
        } else if (pindala < 20) {
            System.out.println("Area is smaller than 20");
        } else {
            System.out.println("Area is equal to 20");
        }
    }

    public static void main(String[] args){
        boolean checkIfNumberIsEven = isEven(4);
        System.out.println(checkIfNumberIsEven);
    }
    public static boolean isEven (int number){
        return number % 2 == 0;
    }
    public static void main(String[] args){
        boolean checkIfNumberIsEven = isEven(4);
        System.out.println(checkIfNumberIsEven);
    }
    public static boolean isEven (int number){
        return number % 2 == 0;
    }

    public static void main(String[] args){
        int id = 1;
        getUser(id);
    }
    private static void getUser(int id){
        getUserFullName();
        getUserAge();
    }
    private static String getUserFullName() {
        String userFullName = "John Doe";
        return userFullName;
    }
    private static int getUserAge(){
        int age = 30;
        return age;
    }
    */

    public static void main(String[] args) {
        int[] m = new int[10];
        int length = m.length;
        System.out.println(length);
        System.out.println(Arrays.toString(m));
        int[] m2 = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(m2));
        String [] randomWords = {"Java", "Tesla", "Hello"};
        Arrays.sort(randomWords);
        System.out.println(Arrays.toString(randomWords));
        System.out.println(randomWords[1] + ", " + randomWords[2]);
    }
}
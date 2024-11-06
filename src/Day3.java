public class Day3 {
        public static void main(String[] args) {
        getUser();
    }
    private static void getUser() {
        boolean isTrue = true;
        System.out.println("Hello");
        if(isTrue) {
            getName();
        }
    }
    private static void getName() {
        boolean isFalse = false;
        boolean isTrue = true;
        int number = 5;
        System.out.println("John");
        if(isFalse) {
            getPassword();
        } else {
            System.out.println("Is false!");
            getPassword(number);
        }
    }
    private static void getPassword() {
        System.out.println("Password");
    }
    private static void getPassword(int number) {
        System.out.println("...");
    }
}

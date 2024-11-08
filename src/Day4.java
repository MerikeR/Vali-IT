public class Day4 {
    /*public static void main(String[] args) {

        // E1.
        int[] myArray1 = new int[5];
        myArray1[0]++;
        myArray1[1] = myArray1[1] + 2;
        myArray1[2] = myArray1[1] + 1;
        myArray1[3] = myArray1[3] + 4;
        myArray1[4] = 5;
        System.out.println(Arrays.toString(myArray1));

        // E2.
        int[] myArray2 = {10, 20, 30, 40, 50};
        System.out.println(myArray2[2]);

        // E3.
        int[] myArray3 = {5, 10, 15, 20};
        myArray3[1] = 12;
        System.out.println(Arrays.toString(myArray3));

        // E4.
        int[] myArray4 = {8, 6, 7, 5, 3, 0, 9};
        int length = myArray4.length;
        System.out.println(length);

        // E5.
        int[] myArray5 = {4, 2, 8, 1, 6};
        int sumMyArray5 = myArray5[0] + myArray5[1] + myArray5[2] + myArray5[3] + myArray5[4];
        System.out.println(sumMyArray5);


        // While loop
        int count = 1;
        while (count <= 5) {
            System.out.println("Count is: " + count);
            count++;
            System.out.println("Count is after count++: " + count);
        }

        // Do...while Loop
        int count1 = 1;
        do {
            System.out.println("Count is: " + count1);
            count1++;
        }
        while (count1 <= 5);

        // For Loop
        for (int count2 = 1; count2 <= 5; count2++) {
            System.out.println("Count: " + count2);
        }

        // forEach Loop
        String[] fruits = {"Apple", "Banana", "Orange"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }
        int i = 1;
        int k = 1;
        i = +2; // i = 2, + ei mõjuta kuidagi
        k += 2; // k = k+2
    }
        public static void main(String[] args) {
        PrintNumbers();
        PrintCarBrands();
        PrintSumIntegers();
        PrintEvenNumbers();
        PrintMultiplTable();
        }

        // E1.
        private static void PrintNumbers() {
            int[] myArray = new int[10];
            for (int number1 = 1; number1 <= myArray.length; number1++) {
                System.out.println("Number " + number1);
            }
        }

        // E2.
        private static void PrintCarBrands() {
        String[] carBrands = {"Ford", "Honda", "Audi"};
        for (String carBrand : carBrands) {
            System.out.println("Day5.objectCreation.Car brand: " + carBrand);
            }
        }

        // E3.
        private static void PrintSumIntegers() {
            int number2 = 0;
            int summa = 0;
            while (number2 <= 100) {
                summa += number2;
                number2++;
            }
            System.out.println("Sum of first 100 positive integers is " + summa);
        }

        // E4.
        private static void PrintEvenNumbers() {
        for (int evenNum = 2; evenNum <= 20; evenNum += 2) {
            System.out.print(evenNum + " ");
        }
        }

        // E5
        private static void PrintMultiplTable() {
        int a = 7;
            System.out.println("Multiple Table: ");
        for (int b = 1; b <= 10; b++) {
            System.out.println(a + " x " + b + " = " + (a * b));
        }
    }
    public static void main(String[] args) {

        for (int count = 1; count <= 5; count++) {
            if (count == 3) {
                break;
            }
                System.out.println("Count is: " + count);
        }

        for (int count = 1; count <= 5; count++) {
            if (count == 3) {
                continue;
            }
            System.out.println("Count is: " + count);
        }
        int diceRoll = rollDice();
        System.out.println("You rolled a number: " + diceRoll);
    }
    private static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

     */
    public static void main(String[] args) {

        firstEvenNumber();
        oddNumbersSkipMultipliesOfFive();
        multipliesOfThreeSkipMultipliesOfSix();
        sumUntilNegativeFound();
        firstNumberGreaterThanFifty();
    }

    private static void firstEvenNumber() {

        // E1.
        int [] numbers = {1, 3, 7, 4, 9, 10};

        for (int a : numbers) {
            if (a % 2 == 0) {
                System.out.println("First even number is: " + a);
                break;
            }
        }
    }

    private static void oddNumbersSkipMultipliesOfFive() {

        // E2.
        for (int b = 1; b <= 20; b +=2) {

            if (b % 5 == 0) {
                continue;
            }
            System.out.println(b);
        }
    }

    private static void multipliesOfThreeSkipMultipliesOfSix() {

        // E3.
        for (int c = 3; c <= 30; c +=3) {

            if (c % 6 == 0) {
                continue;
            }
            System.out.println(c);
        }
    }
    private static void sumUntilNegativeFound() {

        // E4

        int[] myArray = {5, 12, 3, 7, -4, 8, 2};
        int sum = 0;
        for (int d : myArray) {
           if (d < 0) {
               break;
           }
           sum += d;
        }
        System.out.println("Sum of non-negative numbers is: " + sum);
    }
    private static void firstNumberGreaterThanFifty() {

        // E5.
        int[] numbers = {23, 45, 39, 51, 48, 60};
        for (int f : numbers) {
            if (f > 50) {
                System.out.println("First number greater than 50 is: " + f);
                break;
            }
        }
    }
}
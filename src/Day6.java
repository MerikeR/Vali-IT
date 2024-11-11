public class Day6 {
    /*
    public static void main(String[] args) {
        Set<String> setOfWords = new HashSet<>();
        String sentence = "This is a simple sentence";
        String[] words = sentence.split("\\s+");

        for (String word : words) {
            setOfWords.add(word);
            System.out.println(word);
        }

        System.out.println(setOfWords);
    }

    public static void main(String[] args) {
        Set<Character> setOfChars = new HashSet<>();
        for(char i= 'a'; i <= 'z'; i++) {
            setOfChars.add(i);
        }
        for(char i= 'a'; i <= 'z'; i++) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                setOfChars.remove(i);
            }
        }

        System.out.println(setOfChars);
    }

    public static void main(String[] args) {
        Set<Character> setOfChars = new HashSet<>();
        for (char i = 'a'; i <= 'z'; i++) {
            if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
                continue;
            }
            setOfChars.add(i);
        }

        System.out.println("Set of characters without vowels is: " + setOfChars);
    }



    public static void main(String[] args) {
        Set<Character> consonants = new HashSet<>();
        Set<Character> vowels = Set.of('a', 'e', 'i', 'o', 'u');
        for (char i = 'a'; i <= 'z'; i++) {
            consonants.add(i);
            consonants.removeAll(vowels);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int randomNum = (int)(Math.random() * 51); // 0 to 50
        int maxAttempts = 50;

        for (int i=0; i <= maxAttempts; i++) {
            System.out.print("Please guess a number between 1 and 50: ");
            int guessedNumber = scanner.nextInt();
            if (guessedNumber == randomNum) {
                System.out.println("You guessed correctly!");
                break;
            }   else {
                System.out.println("Try again!");
            }
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> ages = new HashMap<>();
        ages.put("Mati", 25);
        ages.put("Kati", 30);
        ages.put("Tõnu", 35);

        for (String nameKey : ages.keySet()) {
            System.out.println(nameKey + " is " + ages.get(nameKey) + " years old.");
        }
        for (Integer value : ages.values()) {
            System.out.println(value);
        }
    }

    public static void main(String[] args) {
        Map<String, String> mapOfJobs = new HashMap<>();
        mapOfJobs.put("John", "manager");
        mapOfJobs.put("Marie", "assistant");

        for (String user : mapOfJobs.keySet()) {
            System.out.println(user + "'s job is " + mapOfJobs.get(user) + ".");
        }
    }

    public static void main(String[] args) {
        Map<String, Character> mapOfGrades = new HashMap<>();
        mapOfGrades.put("Mati", 'A');
        mapOfGrades.put("Kati", 'D');
        mapOfGrades.put("Tõnu", 'C');

        for (String student : mapOfGrades.keySet()) {
            System.out.println(student + "'s grade is " + mapOfGrades.get(student) + ".");
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> mapOfGrades = new HashMap<>();
        mapOfGrades.put("Mati", 85);
        mapOfGrades.put("Kati", 93);
        mapOfGrades.put("Tõnu", 74);

        for (String student : mapOfGrades.keySet()) {
            System.out.println(student + "'s grade is " + mapOfGrades.get(student) + ".");
        }
    }

    public static void main(String[] args) {
        Map<String, Integer> mapOfSalaries = new HashMap<>();
        mapOfSalaries.put("John", 2500);
        mapOfSalaries.put("Mary", 3000);
        mapOfSalaries.put("Ann", 3500);

        System.out.println("Initial map: \n");

        for (String employee : mapOfSalaries.keySet()) {
            System.out.println(employee + "'s salary is " + mapOfSalaries.get(employee) + ".");
        }

        mapOfSalaries.remove("Mary");

        System.out.println("\nUpdated map: \n");

        for (String employee : mapOfSalaries.keySet()) {
            System.out.println(employee + "'s salary is " + mapOfSalaries.get(employee) + ".");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Compound interest calculator: \n");
        System.out.print("Enter initial amount of money you want to invest or borrow: ");
        double initialAmount = scanner.nextDouble();
        System.out.print("Enter annual interest rate in percents: ");
        double compoundInterestRate = scanner.nextDouble();
        System.out.print("Enter the number of times the interest is compounded per year: ");
        double timesOfCompoundedPerYear = scanner.nextDouble();
        System.out.print("Enter the time the money is invested or borrowed for - in years: ");
        double timeOfInvesting = scanner.nextDouble();

        double compoundInterest = initialAmount * Math.pow(compoundInterestRate / 100 / timesOfCompoundedPerYear + 1, timesOfCompoundedPerYear * timeOfInvesting);

        System.out.println("Amount of money accumulated after interest is " + compoundInterest);
    }

     */
}


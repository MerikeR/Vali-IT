package Day5;

import java.util.ArrayList;
import java.util.List;

public class lists {
    /*

    public static void main(String[] args) {

        List<String> listOfNames = new ArrayList<>();
        listOfNames.add("Alex");
        listOfNames.add("Bob");
        listOfNames.add("Charlie");

        System.out.println(listOfNames);

        for (String name : listOfNames) {
            System.out.println(name);
        }

        listOfNames.remove(1);
        System.out.println(" ");

        System.out.println("Print out name: " + listOfNames.get(0));
        System.out.println("Print out name: " + listOfNames.get(1));

        listOfNames.set(1, "John");

        System.out.println("Names after modification: " + listOfNames);
    }


    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        for (int i = 0; i < numbers.size(); i++){
            System.out.println("Element at index " + i + ": " + numbers.get(i));
        }
    }

     */
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            numbers.add(i);
        }

        for (int i = numbers.size(); i >= 0; i--) {
            if (numbers.get(i) % 2 == 0) {
                numbers.remove(i);
            }
        }

        System.out.println("List after removing even numbers: " + numbers);
    }
}

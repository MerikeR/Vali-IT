package Day5.objectCreation;

public class BookData {
    public static void main(String[] args) {
        Book book1 = new Book();
        Book book2 = new Book("AAA", "BBB", 2020);

        System.out.println("Book 1: " + book1.title + ", " + book1.author + ", " + book1.yearPublished);
        System.out.println(" ");
        System.out.println("Book 2: " + book2.title + ", " + book2.author + ", " + book2.yearPublished);
    }
}

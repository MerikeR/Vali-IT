package Day5.objectCreation;

public class Book {
    String title;
    String author;
    int yearPublished;

    public Book() {
        title = "Unknown";
        author = "Unknown";
        yearPublished = 1900;
    }

    public Book(String title, String author, int yearPublished) {
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
    }


}


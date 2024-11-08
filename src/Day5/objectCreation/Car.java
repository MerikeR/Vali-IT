package Day5.objectCreation;

public class Car {
    String brand;
    String model;
    int year;

    // Default constructor
    public Car() {
        // Initialize default values
        brand = "Not specified";
        model = "Unknown";
        year = 2000;
    }

    // Parameterized constructor
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car("Honda", "Civic", 2010);

        car1.displayDetails();

        System.out.println(" ");

        car2.displayDetails();
    }

    public void displayDetails() {
        System.out.println("Day5.objectCreation.Car details: ");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }
}

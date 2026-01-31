import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Car myFirstCar = new Car();

        myFirstCar.make = "Toyota";
        myFirstCar.model = "Corolla";
        myFirstCar.color = "Black";
        myFirstCar.year = 2019;

        // display the car details for myFirstCar
        // --------------------------------------
        myFirstCar.getCarDetails();

        // array of Car objects
        // --------------------------------------
        Car[] cars = new Car[5];

        // object of Scanner class
        // --------------------------------------
        Scanner scanner = new Scanner(System.in);

        // loop though the array of cars
        // --------------------------------------
        for (int index = 0; index < 5; index++) {
            cars[index] = new Car(); // create a new car object at current index

            // prompt the user for details
            System.out.println("Enter details for car " + (index + 1));

            // get user input and assign to 'make' of the car object at current index

            // repeat for make
            // --------------------------------------
            System.out.print("Make: ");
            cars[index].make = scanner.nextLine();


            // repeat for model
            // --------------------------------------
            System.out.print("Model: ");
            cars[index].model = scanner.nextLine();


            // repeat for color
            // --------------------------------------
            System.out.print("Color: ");
            cars[index].color = scanner.nextLine();


            // repeat for year this will use .nextInt()
            // --------------------------------------
            System.out.print("Year: ");
            cars[index].year = scanner.nextInt();


            // consume the newline character after nextInt()
            scanner.nextLine();

        }

        // call getCarDetails for each car object in the collection
        System.out.println("You Car Collection");


        // Inside the main method, write another for loop to iterate through the cars array.
        for(int index = 0; index < 5; index++) {

            // Call the getCarDetails method with the car object at the current index position.
            // Store the return value from the method in a variable called carDetails.
            String carDetails = cars[index].getCarDetails();

            // Print the carDetails
            System.out.println(carDetails);
        }
    }
}

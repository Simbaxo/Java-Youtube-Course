public class Main {

    public static void main(String[] args) {

        // variable = a reusable container for a value
        //            a variable behaves as if it was the value it contains

        // Primitive = simple value stored directly in memory (stack)
        // Reference = memory address (stack) that points to the (heap)

        // Primitive vs Reference
        // ---------    ---------
        // int          string
        // double       array
        // char         object
        // boolean

        // 2 Steps to creating a variable
        // -----------------------------
        // 1. declaration
        // 2. assignment

        int age =21;
        int year = 2025;
        int quantity = 1;

        double price = 19999.99;
        double gpa = 3.5;
        double tempature = -12.5;

        char grade = 'A';
        char symbol = '!';
        char currency = '$';

        boolean isStudent = true;
        boolean forSale = false;
        boolean isOnLine = true;

        String name = "Andres Mena";
        String food = "pizza";
        String email = "fake123@gmail.com";
        String car = "Mustang";
        String color = "red";

        System.out.println("Hello " + name);
        System.out.println("You are " + age + " years old.");
        System.out.println("Your gpa is " + gpa);
        System.out.println("Your average letter grade is " + grade);

        System.out.println("Your choice is a " + color + " " + year +" " + car);
        System.out.println("The price is " + currency + price);

        if(forSale){
            System.out.println("There is a " + car + " for sale");
        } else {
            System.out.println("There is no " + car + " for sale");
        }
    }
}

public class ModularExample {

    // Method to print a message
    public static void printMessage() {
        System.out.println("Welcome to Software Construction!");
    }

    // Method to calculate sum of two integers
    public static int calculateSum(int a, int b) {
        return a + b;
    }

    // Main method to call the modular functions
    public static void main(String[] args) {
        // Call the message printing method
        printMessage();

        // Call the sum calculation method
        int result = calculateSum(7, 8);
        System.out.println("The sum is: " + result);
    }
}

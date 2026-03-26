public class HelloApp {

    public static void main(String[] args) {

        // Check if no arguments are provided
        if (args.length == 0) {
            System.out.println("Hello, World! - uc5.java:7");
            return;
        }

        // Use StringBuilder to build the names string
        StringBuilder nameBuilder = new StringBuilder();

        boolean first = true;

        // Enhanced for loop to iterate through arguments
        for (String name : args) {
            if (!first) {
                nameBuilder.append(", ");
            }
            nameBuilder.append(name);
            first = false;
        }

        // Print final greeting
        System.out.println("Hello, - uc5.java:26" + nameBuilder.toString() + "!");
    }
}
public class HelloApp {

    public static void main(String[] args) {


        if (args.length > 0) {
            String name = args[0];  
            System.out.println("Hello, - uc2.java:8" + name + "!");
        } 
        else {
           
            System.out.println("Hello, World! - uc2.java:12");
        }

    }
}

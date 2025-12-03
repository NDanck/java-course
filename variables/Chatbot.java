import java.util.Scanner;

public class Chatbot {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, what is your name?");
        String name = scanner.nextLine();

        System.out.println("\nHi " + name + "! I'm Javabot. Where are you from?");
        String home = scanner.nextLine();

        System.out.println("\nI hear it's beautiful at " + home + "! I'm from a place called Oracle!");
        System.out.println("How old are you?");
        int age = scanner.nextInt();

        System.out.println("\nSo you're " + age + ", cool! I'm 400 year old.");
        System.out.println("This means I'm " + (400 / age) + " times older than you.");
        System.out.println("Enough about me. What's your favourite language? (Just don't say Python)");
        scanner.nextLine(); // Throwaway next line
        String language = scanner.nextLine();

        if("Python".equals(language) || "python".equals(language)){
            System.out.println("Please never talk to me again!");

            scanner.close();

        } else if("Java".equals(language) || "java".equals(language)) {
            System.out.println(language + "! That's really nice! Nice chatting with you " + name + ". I have to go now!");

            scanner.close();
        } else {
            System.out.println(language + "... That's... Ok I guess. Nice chatting with you " + name + ". I have to go now!");

            scanner.close();
        }
        
    }
}

import java.util.Scanner;

public class ReturnValues {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Type in the lenght (m): ");
        double lenght = scan.nextDouble();

        System.out.println("Type in the width (m): ");
        double width = scan.nextDouble();

        System.out.println("Calculating...");
        double calculatedArea = calculateArea(lenght, width);

        printArea(lenght, width, calculatedArea);

        System.out.println("What language do you speak? ");
        scan.nextLine();
        String language = scan.nextLine();
        System.out.println(explainArea(language));

        scan.close();
    }

    public static double calculateArea(double lenght, double width){
        double area = lenght * width;

        return area;
    }

    public static String explainArea(String language) {

        switch (language) {
            case "English": return "Area equals lenght * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "Area es igual a largo * ancho";
            default: return "Unsupported language :(";
        }
    }

    public static void printArea(double lenght, double width, double area) {
        System.out.println("A rectangle with a lenght of " + lenght + " and a wodth of " + width + " has an area of " + area + "m^2");
    }
}

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

        System.out.println("Calculated area: " + calculatedArea + "m^2");
        
        scan.close();
    }

    public static double calculateArea(double lenght, double width){
        double area = lenght * width;

        return area;
    }
}

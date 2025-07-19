import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // User input for brick dimensions
        System.out.print("Enter length of one brick (cm): ");
        double length = sc.nextDouble();

        System.out.print("Enter breadth of one brick (cm): ");
        double breadth = sc.nextDouble();

        System.out.print("Enter number of bricks: ");
        int numberOfBricks = sc.nextInt();

        // Area of one brick
        double areaOneBrick = length * breadth;

        // Total area in cm²
        double totalAreaCm = areaOneBrick * numberOfBricks;

        // Convert to m² (1 m² = 10,000 cm²)
        double totalAreaM = totalAreaCm / 10000.0;

       
        System.out.println("\nTotal area of path:");
        System.out.println("In square centimeters: " + totalAreaCm + " cm²");
        System.out.println("In square meters: " + totalAreaM + " m²");

      
    }
}
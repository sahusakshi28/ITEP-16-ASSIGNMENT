import java.util.Scanner;
class Q39 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter of the cylinder (in cm): ");
        double diameter = sc.nextDouble();

        System.out.print("Enter the height of the cylinder (in cm): ");
        double height = sc.nextDouble();
        double radius = diameter / 2;
        double surfaceArea = 2 * 3.14 * radius * (height + radius);
        System.out.printf("The surface area of the cylinder is: %.2f ", surfaceArea);
    }
}
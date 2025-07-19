import java.util.Scanner;
class Q40{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius of the cylinder (in cm): ");
        double r = sc.nextDouble();

        System.out.print("Enter the height of the cylinder (in cm): ");
        double h = sc.nextDouble();
        double volume = 3.14 * r * r * h;
        System.out.printf("The volume of the cylinder is: %.2f ", volume);
    }
}

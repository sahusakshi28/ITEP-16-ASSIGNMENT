import java.util.Scanner;
class Q41{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the diameter of the cylinder (in cm): ");
        double d = sc.nextDouble();

        System.out.print("Enter the height of the cylinder (in cm): ");
        double h= sc.nextDouble();
        double r = d / 2;
        double volume = 3.14 * r * r * h;
        System.out.printf("The volume of the cylinder is: %.2f cm³\n", volume);
    }
}
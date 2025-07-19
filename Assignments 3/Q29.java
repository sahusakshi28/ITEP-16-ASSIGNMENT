import java.util.Scanner;

class Q29{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();

        System.out.print("Enter fourth number: ");
        int d = sc.nextInt();
        int lowest = a;

        if (b < lowest) {
            lowest = b;
        }
        if (c < lowest) {
            lowest = c;
        }
        if (d < lowest) {
            lowest = d;
        }
        System.out.println("The lowest number is: " + lowest);
    }
}
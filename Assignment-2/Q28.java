import java.util.Scanner;
class Q28 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length  ");
        double l = sc.nextDouble();

        System.out.print("Enter width of the carpet  ");
        double w = sc.nextDouble();

        System.out.print("Enter rate per square meter: ");
        double rate = sc.nextDouble();
        double area = l * w;
        double cost = area * rate;
        System.out.println("Total cost of the carpet is: " + cost);

    }
}

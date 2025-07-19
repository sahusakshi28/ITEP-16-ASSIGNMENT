import java.util.Scanner;

class Q27 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length : ");
        double l = sc.nextDouble();

        System.out.print("Enter the width : ");
        double w = sc.nextDouble();
        System.out.print("Enter the cost per square meter: ");
        double rate = sc.nextDouble();
        double area = l* w;
        double totalCost = area * rate;
        System.out.println("Total cost of tiling the room is: " + totalCost);

    }
}

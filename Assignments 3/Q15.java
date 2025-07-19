import java.util.Scanner;

class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the cost price of the bike: ₹");
        double costPrice = scanner.nextDouble();
        double tax;
        if (costPrice > 100000) {
            tax = costPrice * 0.15;
        } else if (costPrice > 50000 && costPrice <= 100000) {
            tax = costPrice * 0.10;
        } else if (costPrice >= 0) {
            tax = costPrice * 0.05;
        } else {
            System.out.println("Invalid cost price entered!");
            scanner.close();
            return;
        }
        System.out.println("Road Tax to be paid: ₹" + tax);
    }
}

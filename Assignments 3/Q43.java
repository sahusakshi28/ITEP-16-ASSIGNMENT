import java.util.Scanner;
 class Q43{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter electricity units consumed: ");
        double units = sc.nextDouble();

        double amount = 0, surcharge, totalBill;
        if (units <= 50) {
            amount = units * 0.50;
        } else if (units <= 150) {
            amount = (50 * 0.50) + (units - 50) * 0.75;
        } else if (units <= 250) {
            amount = (50 * 0.50) + (100 * 0.75) + (units - 150) * 1.20;
        } else {
            amount = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + (units - 250) * 1.50;
        }
        surcharge = amount * 0.20;
        totalBill = amount + surcharge;

        System.out.println("\nElectricity Bill Details:");
        System.out.println("Base Amount = " + String.format("%.2f", amount));
        System.out.println("Surcharge (20%) = " + String.format("%.2f", surcharge));
        System.out.println("Total Bill = " + String.format("%.2f", totalBill));
    }
}
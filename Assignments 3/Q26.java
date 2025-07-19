import java.util.Scanner;
class Q26{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        switch (n % 2) {
            case 0:
                System.out.println(n + " is Even.");
                break;
            case 1:
                System.out.println(n + " is Odd.");
                break;
            default:
                System.out.println("Invalid input!");
        }

        scanner.close();
    }
}

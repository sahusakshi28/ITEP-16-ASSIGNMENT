import java.util.Scanner;
class Q44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first term (a): ");
        int a = sc.nextInt();

        System.out.println("Enter the common difference (d): ");
        int d = sc.nextInt();

        System.out.println("Enter the term number (n): ");
        int n = sc.nextInt();
        int nthTerm = a + (n - 1) * d;
        System.out.println("The " + n + "th term of the A.P. is: " + nthTerm);
    }
}

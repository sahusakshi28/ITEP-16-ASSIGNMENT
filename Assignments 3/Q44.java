import java.util.Scanner;
 class Q44{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter choice (+, >, ==): ");
        String choice = sc.next();
        switch (choice) {
            case "+":
                System.out.println("Addition: " + (a + b));
                break;

            case ">":
                if (a > b) {
                    System.out.println(a + " is greater.");
                } else if (b > a) {
                    System.out.println(b + " is greater.");
                } else {
                    System.out.println("Both numbers are equal.");
                }
                break;

            case "==":
                if (a == b) {
                    System.out.println("Both numbers are equal.");
                } else {
                    System.out.println("Numbers are not equal.");
                }
                break;

            default:
                System.out.println("Invalid choice.");
        }
    }
}

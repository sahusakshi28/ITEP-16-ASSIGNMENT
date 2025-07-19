import java.util.Scanner;

class Q11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        System.out.print("Enter sex (M/F): ");
        char sex = scanner.next().toUpperCase().charAt(0);

        System.out.print("Enter marital status (Y/N): ");
        char maritalStatus = scanner.next().toUpperCase().charAt(0);

        if (sex == 'F') {
            System.out.println("The employee will work only in urban areas.");
        } else if (sex == 'M' && age >= 20 && age <= 40) {
            System.out.println("The employee can work anywhere.");
        } else if (sex == 'M' && age > 40 && age <= 60) {
            System.out.println("The employee will work in urban areas only.");
        } else {
            System.out.println("Invalid input");
        }

    }
}

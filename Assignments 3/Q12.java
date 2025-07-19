import java.util.Scanner;

class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 4-digit number: ");
        int number = scanner.nextInt();
        if (number >= 1000 && number <= 9999) {
            int reversed = 0;
            int temp = number;

            while (temp > 0) {
                int digit = temp % 10;    
                reversed = reversed * 10 + digit;
                temp = temp / 10;          
            }

            System.out.println("Reversed number: " + reversed);
        } else {
            System.out.println("Invalid input! Please enter a 4-digit number.");
        }

    }
}


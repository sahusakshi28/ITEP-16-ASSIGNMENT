import java.util.Scanner;
class Q14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your percentage: ");
        double percentage = sc.nextDouble();
        if (percentage > 90) {
            System.out.println("Grade: A");
        } else if (percentage > 80 && percentage <= 90) {
            System.out.println("Grade: B");
        } else if (percentage >= 60 && percentage <= 80) {
            System.out.println("Grade: C");
        } else if (percentage >= 0 && percentage < 60) {
            System.out.println("Grade: D");
        } else {
            System.out.println("Invalid input! Percentage should be between 0 and 100.");
        }

    }
}   


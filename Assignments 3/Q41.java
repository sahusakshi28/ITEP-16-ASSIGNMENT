import java.util.Scanner;

class Q41{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in Physics: ");
        int physics = sc.nextInt();

        System.out.print("Enter marks in Chemistry: ");
        int chemistry = sc.nextInt();

        System.out.print("Enter marks in Biology: ");
        int biology = sc.nextInt();

        System.out.print("Enter marks in Mathematics: ");
        int math = sc.nextInt();

        System.out.print("Enter marks in Computer: ");
        int computer = sc.nextInt();

        int total = physics + chemistry + biology + math + computer;
        double percentage = total / 5.0;

        System.out.println("\nTotal Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        char grade;

        if (percentage >= 90) {
            grade = 'A';
        } else if (percentage >= 80) {
            grade = 'B';
        } else if (percentage >= 70) {
            grade = 'C';
        } else if (percentage >= 60) {
            grade = 'D';
        } else if (percentage >= 40) {
            grade = 'E';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);
    }
}

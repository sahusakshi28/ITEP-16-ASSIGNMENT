import java.util.Scanner;

class Q18 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        double subjects = sc.nextDouble();

        double totalMarks = 0;
        double maxMarksPerSubject;
        System.out.print("Enter maximum marks per subject: ");
        maxMarksPerSubject = sc.nextDouble();
        for (int i = 1; i <= subjects; i++) {
            System.out.print("Enter marks obtained in subject " + i + ": ");
            double marks = sc.nextDouble();
            totalMarks += marks;
        }

        double totalMaxMarks = subjects * maxMarksPerSubject;
        double percentage = (totalMarks / totalMaxMarks) * 100;
        System.out.printf("Percentage obtained: %.2f%%\n", percentage);
    }
}

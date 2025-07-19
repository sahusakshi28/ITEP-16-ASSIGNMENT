import java.util.Scanner;
class Q33{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

    int check = num*2;
    int checksum = num/2;
        if (num==checksum) {
            System.out.println(num + " is Even.");
        } else {
            System.out.println(num + " is Odd.");
        }

    }
}

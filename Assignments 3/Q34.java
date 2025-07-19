import java.util.Scanner;

class Q34{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first side: ");
        int a = sc.nextInt();

        System.out.print("Enter second side: ");
        int b = sc.nextInt();

        System.out.print("Enter third side: ");
        int c = sc.nextInt();
        if((a==b)&&(a==c)&&(b==c)) {
            System.out.println("Equilateral Triangle");

        }else
        {
            if((a!=b)&&(b!=c)&&(a!=c)){
                System.out.println("Scalane Triangle");
            }
            else{
                System.out.println("Isoscales Triangle");
            }
        } 
    }
}
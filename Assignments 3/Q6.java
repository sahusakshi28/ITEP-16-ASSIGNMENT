import java.util.Scanner;
class Q6{
public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
        System.out.println("Enter number");
        int n = sc.nextInt();
        int abs= Math.abs(n);
        if(n<0)
        {
            System.out.println("After abs" + abs);
        }else
        {
            System.out.println("Number is already positive");
        }
    
}
}
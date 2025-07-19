import java.util.Scanner;
class Q20 {
public static void main(String args[]) {
Scanner sc = new Scanner(System.in); 
    System.out.print("Enter value of a: ");  
    int a = sc.nextInt();  

    System.out.print("Enter value of b: ");  
    int b = sc.nextInt();  

    System.out.println("\nBefore Swap: a = " + a + ", b = " + b);  
    a = a ^ b;  
    b = a ^ b;  
    a = a ^ b;  

    System.out.println("After Swap:  a = " + a + ", b = " + b); 
}

}

import java.util.Scanner;
class Q13{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Area of triangle is :");
int area= sc.nextInt();
System.out.println("One leg is :");
int b= sc.nextInt();
 
int h=((area*2)/b);
System.out.println("Height of triangle is : " +h);
}
}
import java.util.Scanner;
class Q2{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter Area of Rectangle:");
int area= sc.nextInt();

System.out.println("Enter Breadth of Rectange: ");
int breadth=sc.nextInt();
int length=(area/breadth);
int peri=(2*(length+breadth));
System.out.println("length of rectangle is " +length);
System.out.println("Perimeter of rectangle is: " +peri);
}
}
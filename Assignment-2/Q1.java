import java.util.Scanner;
class Q1{
public static void main(String args[]){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter perimeter of rectangle");
   int peri= sc.nextInt();
   
   System.out.println("Enter length of rectangle");
   int length=sc.nextInt();
   int breadth=((peri/2)-length);
   int area= length*breadth;
   System.out.println("Breadth of rectangle is :" + breadth);
   System.out.println("Area of rectangle is : " + area);
    
}
}

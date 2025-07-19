import java.util.Scanner;
class Q6{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Enter a:");
double a=sc.nextDouble();

System.out.println("Enter b:");
double b=sc.nextDouble();

System.out.println("Enter perimeter: ");
double peri=sc.nextDouble();

double c=(peri-(a+b));
double s=peri/2;
double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));

System.out.println("c is :" + c);
System.out.println("Area of triangle is: " + area);

}
}
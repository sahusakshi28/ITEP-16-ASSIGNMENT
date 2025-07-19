import java.util.Scanner;
class Q12{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Hypotenuse is ");
double hy = sc.nextDouble();

System.out.println("base is");
double b= sc.nextDouble();

double h= Math.sqrt(hy*hy-b*b);
double area= ((b*h)/2);
System.out.println("height of triangle is :" + h );
System.out.println("Area of triangle is : "+ area);

}
}
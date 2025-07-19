import java.util.Scanner;
class Q11{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Area of triangle is : ");
double area=sc.nextDouble();
System.out.println("ratio value of base is: ");
double ratiobase=sc.nextDouble();
System.out.println("ratio value of height is : ");
double ratioheight= sc.nextDouble();
double base,height,x;
x= Math.sqrt((area*2)/(ratiobase*ratioheight)); 
base=ratiobase*x;
height=ratioheight*x;
System.out.println("base of triangle is : " + base);
System.out.println("Height of triangle is :" + height);
}
}
import java.util.Scanner;
class Q8{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("height of triangle:");
float h=sc.nextFloat();
System.out.println("Area of triangle is:");
float a=sc.nextFloat();
float height=h/100;

float base=((a*2)/height);
System.out.println("base of triangle is: " + base);

}
}
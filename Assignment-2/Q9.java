import java.util.Scanner;
class Q9{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("Side of triangle: ");
float s= sc.nextFloat();

float area= (float)((1.732/4)*s*s);
System.out.println("area of triangle is : " + area);
}
}
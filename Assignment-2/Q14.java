import java.util.Scanner;
class Q14{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.println("base of diagonal :");
int base= sc.nextInt();
 
System.out.println("Height1 of triangle is :");
int height1= sc.nextInt();

System.out.println("Height2 of triangle is :");
int height2= sc.nextInt();

int area1=((base*height1)/2);
int area2=((base*height2)/2);
int res=area1+area2;
System.out.println("result is : " + res);
}
}
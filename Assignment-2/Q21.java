import java.util.Scanner;
class Q21{
public static void main(String args[])
{
Scanner sc= new Scanner(System.in);
System.out.println("Enter length1 :");
float l1=sc.nextFloat();

System.out.println("Enter breadth1 :");
float b1= sc.nextFloat();

System.out.println("Enter height:");
float h1= sc.nextFloat();

System.out.println("Enter length2:");
float l2=sc.nextFloat();

System.out.println("Breadth2 is :");
float b2=sc.nextFloat();

System.out.println("Height is :");
float h2= sc.nextFloat();
float vol1;
float vol2;
vol1=l1*b1*h1;
vol2=l2*b2*h2;
float num=vol2/vol1;
System.out.println("volume1 is " + vol1);
System.out.println("Volume2 is " +vol2);
System.out.println("number of bricks is : " + num);


}
}
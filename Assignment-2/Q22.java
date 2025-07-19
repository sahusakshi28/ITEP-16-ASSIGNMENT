import java.util.Scanner;
class Q22{
public static void main(String args[]){
Scanner sc = new Scanner(System.in);
System.out.println("length is :");
int l= sc.nextInt();
System.out.println("breadth is : ");
int w = sc.nextInt();
System.out.println("height is : ");
int d= sc.nextInt();
 int vol=l*w*d;
System.out.println("Volume of pond is : " + vol);
}
}
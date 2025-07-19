import java.util.Scanner;
class Q20{
public static void main(String args[]){
Scanner sc= new Scanner (System.in);
System.out.println("length is:");
int l=sc.nextInt();
System.out.println("Breadth is:");
int b=sc.nextInt();
System.out.println("Height is :");
int h=sc.nextInt();

int vol=l*b*h;

System.out.println("Volume is :" + vol);
}
}
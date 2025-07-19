import java.util.Scanner;
class Q23{
public static void main(String args[]){
Scanner sc = new Scanner (System.in);
System.out.println("length of carton :");
int l= sc.nextInt();
System.out.println("Breadth of carton: ");
int b = sc.nextInt();
System.out.println("Height of carton: ");
int h=sc.nextInt();

System.out.println("side of cubical box is : ");
int s = sc.nextInt();
int vol1= l*b*h;
int vol2= s*s*s;
int num=vol1/vol2;
System.out.println("volume of carton is : " + vol1);
System.out.println("volume of cubical box is : " + vol2);
System.out.println("number of boxes : " + num);

}
}
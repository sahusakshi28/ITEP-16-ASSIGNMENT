import java.util.Scanner;
class Q5{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("Cost of fence");
int cost= sc.nextInt();

System.out.println("rate of fencing");
int rate=sc.nextInt();

System.out.println("length of rectangle");
int l=sc.nextInt();


int peri=(cost/rate);
int b= ((peri/2)-l);
int area=l*b;
System.out.println("Perimeter is :" + peri);
System.out.println("Breadth is :" + b);
System.out.println("Area is:" +area);



}
}
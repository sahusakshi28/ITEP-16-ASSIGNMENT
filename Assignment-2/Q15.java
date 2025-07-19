import java.util.Scanner;
class Q15{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("length of shellys garden is : ");
int l= sc.nextInt();

System.out.println("Breadth of shellys garden is : ");
int b= sc.nextInt();

System.out.println("length of Rachels garden is :");
int side=sc.nextInt();

int area1= l*b;
int area2=side*side;
int max= (area1>area2)? area1:area2;

int diff= max-area1;
System.out.println("area of shellys garden is :" +area1);
System.out.println("area of rachels garden is : " + area2);
System.out.println("difference of both garden is :" +diff);




}
}
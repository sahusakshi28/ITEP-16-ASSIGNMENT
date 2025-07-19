import java.util.Scanner;
class Q19{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Side of cube :");
int edge= sc.nextInt();
System.out.println("length of cuboid:");
int l= sc.nextInt();
System.out.println("breadth of cuboid:");
int b= sc.nextInt();
System.out.println("Enter height of cuboid :");
int h = sc.nextInt();
int vol1=edge*edge*edge;
int vol2=l*b*h;
System.out.println(vol1);
System.out.println(vol2);
}
}

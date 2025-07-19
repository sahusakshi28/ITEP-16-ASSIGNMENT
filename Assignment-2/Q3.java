import java.util.Scanner;
class Q3{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter length of one tile ");
int length=sc.nextInt();

System.out.println("Enter breadth of a tile :");
int breadth=sc.nextInt();

System.out.println("Enter length of floor: ");
int len=sc.nextInt();
System.out.println("Enter breadth of floor");
int b=sc.nextInt();

int area1= length*breadth;
int area2=len*b;
int result=(area2/area1);
System.out.println("Area of tiles: " + area1 );
System.out.println("Area of floor:" + area2);
System.out.println("Number of tiles: "+ result);
}
}
import java.util.Scanner;
class Q18{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
System.out.println("Enter length");
int l=sc.nextInt();
System.out.println("Enter breadth");
int b=sc.nextInt();

int peri=(2*(l+b));
int distance=peri*10;

System.out.println("perimeter of rectangle is :" + peri);
System.out.println("distance is :" + distance);
}
}
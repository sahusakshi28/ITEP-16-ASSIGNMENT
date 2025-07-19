import java.util.Scanner;
class Q4{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);

System.out.println("Enter Length of plot");
float l= sc.nextFloat();

System.out.println("Enter breadth of plot");
float b=sc.nextFloat();

System.out.println("Enter cost per 100 m");
float cost= sc.nextFloat();
 
float rs=cost/100;
float area=l*b;
float total=area*rs;
System.out.println("Rate per mA^2:" + rs);
System.out.println("Area of plot:" + area);
System.out.println("Total cost :" + total);


}
}
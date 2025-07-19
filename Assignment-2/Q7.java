import java.util.Scanner;
class Q7{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("area of triangle ");
int area= sc.nextInt ();
System.out.println("Base of triangle is : ");
int base= sc.nextInt();
int height= ((area*2)/base);
System.out.println("height of triangle is:" + height);

}
}
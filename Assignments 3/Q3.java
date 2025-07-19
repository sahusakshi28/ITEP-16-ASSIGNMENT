import java.util.Scanner;
class Q3{
public static void main(String args[]){
Scanner sc= new Scanner(System.in);
 System.out.println("Enter salary");
 float s= sc.nextInt();
 System.out.println("Enter year");
 float yr= sc.nextInt();
 if(yr>5){
    float bonus=5f/100f ;
    float netsalary=bonus*s;
    System.out.println("bonus is : " + bonus); 
    System.out.println("You get bonus of rs: " + netsalary);
 }else{
    System.out.println("Your salary is " +s);
 }

}

}
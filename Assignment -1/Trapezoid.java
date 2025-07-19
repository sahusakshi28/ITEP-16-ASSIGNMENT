class Trapezoid{
public static void main(String args[]){
int b1=128;
int b2=92;
int h=40;
int area=(((b1+b2)*h)/2);
int avg=((b1+b2)/2);
int walk=avg*4;
int rem=area-walk;
System.out.println(area);
System.out.println(avg);
System.out.println(walk);
System.out.println(rem);
}
}
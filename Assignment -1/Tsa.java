class Tsa{
public static void main(String args[]){
double surfacearea=149;
double h=6;
double pi=3.14;
double a=2*pi;
double b=2*pi*h;
double c=-surfacearea;
double discriminant=Math.pow(b,2)-4*a*c;
double sqrD=Math.sqrt(discriminant);
double radius=(-b+sqrD)/(2*a);
double diameter=2*radius;
System.out.println(radius);
System.out.println(diameter);

}
}
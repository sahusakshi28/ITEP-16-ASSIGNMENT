class Cyl{
public static void main(String args[]){
double h;
double vol=1287;
double r=10;
double pi=3.14;
h=(vol/(pi*r*r));
double lateral=2*pi*r*h;
double area=2*pi*r*r;
double tsa=lateral+area;
System.out.println(tsa);

}
}
class Carton{
public static void main(String args[]){
int side=3;
int l=15;
int b=9;
int h=12;
int vol1;
int vol2;
vol1=side*side*side;
vol2=l*b*h;
int box=vol2/vol1;
System.out.println("Vol of cube box" + vol1);
System.out.println("Vol of Carton" + vol2);
System.out.println(box);
}
}
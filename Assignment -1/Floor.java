class Floor{
public static void main(String args[]){
int s=10;
int l=800;
int b=900;
int area1;
int area2;
area1=s*s;
area2=l*b;

int tile=area2/area1;
System.out.println("Area of tile" +area1);
System.out.println("Area of floor" +area2);
System.out.println("Number of tiles" +tile);
}
}
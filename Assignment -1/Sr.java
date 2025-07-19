class Sr{
public static void main(String args[]){
int l=22;
int b=15;
int s=21;
int area1;
int area2;
int diff;

area1=l*b;
area2=s*s;
int max=(area1>area2)?area1:area2;
diff=area2-area1;
System.out.println(area1);
System.out.println(area2);
System.out.println(max);
System.out.println(area2-area1);

}
}
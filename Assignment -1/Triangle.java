class Triangle{
public static void main(String args[])
{
  double a=10;
  double b=9;
  double sum;
  double c;
  double p=36;
  double area;
  double s;
  sum=a+b;
  c=p-sum;
  s=(a+b+c)/2;
  area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
  System.out.println(area);
} 
}
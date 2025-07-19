class Pathway{
public static void main(String args[]){
int l=30;
int w=20;
int width1=3;
int width2=4;
int area1=l*w;
int area2=l*width1;
int area3=w*width2;
int area4=width1*width2;
int total=((area2+area3)-area4);
int usable=(area1-total);
System.out.println(area1);
System.out.println(area2);
System.out.println(area3);
System.out.println(area4);
System.out.println(total);
System.out.println(usable);
}
}
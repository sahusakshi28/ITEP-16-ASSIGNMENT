class Ratio{
public static void main(String args[]){
   double area=320;
   double ratiobase= 8;
   double ratioheight= 5;
   double x;
   double base;
   double height;
   x= Math.sqrt((area*2)/(ratiobase*ratioheight));
   base=ratiobase*x;
   height=ratioheight*x;
   System.out.println(base);
   System.out.println(height);


}

}
class Circle{
    private double radius;
    private double pi;
    public void setData(double radius,double pi){
    this.radius=radius;
    this.pi=pi;
    }
    public double calculateArea(){
        return pi*radius*radius;
    }
    public double calculateCircumference(){
        return 2*pi*radius;
    }
    public void display(){
        System.out.println("Circle Geometry...");
        System.out.println("Radius of circle is:  "+radius);
        System.out.println("pi:  "+pi);
        System.out.println("Area of circle is:  "+calculateArea());
        System.out.println("Circumference of circle is:  "+calculateCircumference());
    }
}
class Q9{
    public static void main(String args[]){
        Circle c= new Circle();
        c.setData(5,3.14);
        c.calculateArea();
        c.calculateCircumference();
        c.display();
    }
}

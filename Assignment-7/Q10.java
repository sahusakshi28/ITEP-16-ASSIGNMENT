class Rectangle{
    private double length;
    private double width;
    public void setData(double length,double width){
    this.length=length;
    this.width=width;
    }
    public double calculateArea(){
        return length*width;
    }
    
    public void display(){
        System.out.println("Rectangle Area Calculator...");
        System.out.println("Length of rectangle:  "+length);
        System.out.println("Width of rectangle:  "+width);
        System.out.println("Area of rectangle is:  "+calculateArea());
        
    }
}
class Q10{
    public static void main(String args[]){
        Rectangle r= new Rectangle();
        r.setData(5,4);
        r.calculateArea();
        
        r.display();
    }
}


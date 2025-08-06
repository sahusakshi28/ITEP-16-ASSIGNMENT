class Mobile{
    private String brand;
    private String model;
    private double price;
    public void setData(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    

public boolean isAffordable(){
    return price < 20000;
}
public void displayMobile(){
    System.out.println("Details of Car....");
    System.out.println("Brand:  "+this.brand);
    System.out.println("Model :  "+this.model);
    System.out.println("Year:  "+this.price);
    System.out.println("Mobile is affordable:  "+isAffordable());
    }
    
}
class Q8{
    public static void main(String args[]){
    Mobile m=new Mobile();
    m.setData("oneplus","C35",20000);
    m.isAffordable();
    m.displayMobile();
    }
}


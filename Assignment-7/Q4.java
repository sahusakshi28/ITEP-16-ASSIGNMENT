class Car{
    private String brand;
    private String model;
    private int year;
    public void setData(String brand,String model,int year){
        this.brand=brand;
        this.model=model;
        this.year=year;
    }
    public void displayCar(){
    System.out.println("Details of Car....");
    System.out.println("Brand:  "+this.brand);
    System.out.println("Model :  "+this.model);
    System.out.println("Year:  "+this.year);
    }
}
class Q4{
    public static void main(String args[]){
        Car BMW=new Car();
        BMW.setData("BMW","G05",2018);
        BMW.displayCar();
    }
}

class Product{
    private String productid;
    private String name;
    private int quantity;
    private double price;
    public void setData(String productid,String name,int quantity,double price){
    this.productid=productid;
    this.name=name;
    this.quantity=quantity;
    this.price=price;
    } 
    public double calculateTotalValue(){
        return quantity*price;
    }
    public void displayProduct(){
        System.out.println("Product Details.....");
        System.out.println("Product ID:  "+this.productid);
        System.out.println("Product name"+this.name);
        System.out.println("Product Quantity:  "+this.quantity);
        System.out.println("Price of product is:  "+this.price );
        System.out.println("Total price of product is:  "+calculateTotalValue());

    }
}

class Q5{
    public static void main(String args[]){
        Product Laptop=new Product();
        Laptop.setData("101","Laptop",2,45000);
        Laptop.calculateTotalValue();
        Laptop.displayProduct();
    }
}
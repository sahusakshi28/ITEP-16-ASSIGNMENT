class Book{
    private String title;
    private String author;
    private double price;
    public void setData(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    public void displayBook(){
        System.out.println("Details of Books");
        System.out.println("Title:  "+this.title);
        System.out.println("Author:  "+this.author);
        System.out.println("Price : "+this.price);
    }
}
class Q2{
    public static void main(String args[]){
        Book India2020=new Book();
        India2020.setData("India2020: A Vision For The New Millenium","Dr.APJ Abdul Kalam",500);
        India2020.displayBook();
    }
}

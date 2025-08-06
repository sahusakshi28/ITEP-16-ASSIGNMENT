class Employee{
    private int id;
    private String name;
    private double salary;
    public void setData(int id,String name,double salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
public void displayEmployee(){
    System.out.println("Details of employee....");
    System.out.println("ID :  "+this.id);
    System.out.println("Name :  "+this.name);
    System.out.println("Salary: "+this.salary);
}
}
class Q1{
    public static void main(String args[]){
        Employee Sakshi=new Employee();

        Sakshi.setData(1001,"Sakshi Sahu",100000);
        Sakshi.displayEmployee();
    }
}

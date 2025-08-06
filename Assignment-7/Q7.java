class Student{
    private String name;
    private double mathMarks;
    private double scienceMarks;
    public void setData(String name,double mathMarks,double scienceMarks){
    this.name=name;
    this.mathMarks=mathMarks;
    this.scienceMarks=scienceMarks;
    }
    public double avgMarks(){
        return (mathMarks+scienceMarks)/2;
    }
    public void displayStudents(){
        System.out.println("Student Details...");
        System.out.println("Name of student: "+this.name);
        System.out.println("Marks of Maths is :  "+this.mathMarks);
        System.out.println("Marks of Science is :  "+this.scienceMarks);
        System.out.println("Average marks of Students:  "+avgMarks());
    }
}
class Q7{
    public static void main(String args[]){
        Student s=new Student();
        s.setData("Sakshi Sahu",89.6,90);
        s.avgMarks();
        s.displayStudents();
        
    }
}

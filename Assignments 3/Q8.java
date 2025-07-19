import java.util.Scanner;
class Q8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you have a medical cause");
        String m = sc.nextLine(); 
        System.out.println("Enter Total no of classes");
        int total=sc.nextInt();
        System.out.println("Enter classes attend");
        int attend = sc.nextInt();
        int res= ((attend*100)/total);
        System.out.println("percentage of attendance is :" + res);
        if((attend > 75) || ( m.equalsIgnoreCase("y")))
        {
            System.out.println("You are allowed to attend the class ");
        }else
        {
          System.out.println("You are not allowed to attend the class");
        }
    }
}

import java.util.Scanner;
class Q7{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Total no of classes");
        int total=sc.nextInt();
        System.out.println("Enter classes attend");
        int attend=sc.nextInt();
        int res= ((attend*100)/total);
        System.out.println("percentage of attendance is :" + res);
        if(attend>75){
            System.out.println("You are allowed to attend classes");
        }
        else{
            System.out.println("You arenot allowed to attend class");
        }
    }
}
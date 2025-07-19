import java.util.Scanner;
class Q5{
    public static void main(String args[]){
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter age of 1 person is :");
        int age1=sc.nextInt();
        System.out.println("Enter age of 2 person is :");
        int age2=sc.nextInt();
        System.out.println("Enter age of 3 person is :");
        int age3=sc.nextInt();
        if((age1>age2)&&(age1>age3)&&(age2<age3)){
            System.out.println("1st person is oldest");
            System.out.println("2nd person is youngest");
        }else{
            if((age2>age1)&&(age2>age3)&&(age3<age1)){
                System.out.println("2nd person is oldest");
                System.out.println("3rd person is youngest");
            }else{
                if((age1<age3)&&(age2<age3)&&(age1<age2)){
                    System.out.println("3rd person is oldest");
                    System.out.println("1st person is youngest");
                    
                }else
                      {
                          System.out.println("all are in same age");
                    }
                }
            }
        }
    }

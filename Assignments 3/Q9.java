import java.util.Scanner;
class Q9{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter character ...");
        char ch = sc.next().charAt(0);
        if(ch >='a'&& ch<='z')
        {
            System.out.println("The character is in lower case " + ch);
        }
        else{
            if(ch>='A' && ch <='Z'){
                System.out.println("The character is in Uppercase " + ch);
            }
            else{
                System.out.println("Invalid Character");
            }
        }

    }
}
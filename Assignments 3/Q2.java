import java.util.Scanner;
class Q2{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("How many item do you purchase");
        int q= sc.nextInt();
        System.out.print("cost per unit");
        int cost=100;
        int totalcost=q*100;
        if(totalcost>1000)
        {
            int discount=((10*totalcost)/100);
            int tc= totalcost-discount;
            System.out.println("Final price is : " + tc);

        }else
        {
            System.out.println("Final price is : " + totalcost);
        }

    }
}

import java.util.Scanner;

class Q31 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the perimeter of the square : ");
        double perimeter = sc.nextDouble();
        double side = perimeter / 4;
        double area = side * side;
        System.out.println("Side of the square: " + side + " m");
        System.out.println("Area of the square: " + area + " square meters");

        sc.close();
    }
}

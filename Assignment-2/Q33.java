import java.util.Scanner;

class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of the garden: ");
        int l = sc.nextInt();

        System.out.print("Enter width of the garden: ");
        int w = sc.nextInt();
        System.out.print("Enter width of the vertical pathway: ");
        int verticalPath = sc.nextInt();

        System.out.print("Enter width of the horizontal pathway: ");
        int horizontalPath = sc.nextInt();
        int totalArea = l * w;
        int verticalPathArea = verticalPath * w;
        int horizontalPathArea = horizontalPath * l;
        int overlapArea = verticalPath * horizontalPath;
        int pathArea = verticalPathArea + horizontalPathArea - overlapArea;
        int usableArea = totalArea - pathArea;
        System.out.println("Usable area of the garden: " + usableArea );
    }
}
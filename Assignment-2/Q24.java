import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter brick length (cm): ");
        double brickLengthCm = sc.nextDouble();
        System.out.print("Enter brick breadth (cm): ");
        double brickBreadthCm = sc.nextDouble();

        System.out.print("Enter brick height/thickness (cm): ");
        double brickHeightCm = sc.nextDouble();

      
        double brickLength = brickLengthCm / 100;
        double brickBreadth = brickBreadthCm / 100;
        double brickHeight = brickHeightCm / 100;

        
        System.out.print("Enter wall length (m): ");
        double wallLength = sc.nextDouble();

        System.out.print("Enter wall height (m): ");
        double wallHeight = sc.nextDouble();

        System.out.print("Enter wall thickness (m): ");
        double wallThickness = sc.nextDouble();

        // Input cost
        System.out.print("Enter cost per 1000 bricks: ");
        double costPerThousand = sc.nextDouble();

        // Calculate volumes
        double brickVolume = brickLength * brickBreadth * brickHeight;
        double wallVolume = wallLength * wallHeight * wallThickness;

        // Calculate number of bricks (rounded up)
        int numberOfBricks = (int) Math.ceil(wallVolume / brickVolume);

        // Calculate cost
        double totalCost = (numberOfBricks / 1000.0) * costPerThousand;

        System.out.println("\nNumber of bricks required: " + numberOfBricks);
        System.out.println("Total cost to build the wall: $" + totalCost);

       
    }
}
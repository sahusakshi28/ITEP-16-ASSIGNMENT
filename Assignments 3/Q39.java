import java.util.Scanner;
class Q39{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount: ");
        int amount = sc.nextInt();
        int[] notes = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        int[] noteCounter = new int[notes.length];

        int remaining = amount;
        for (int i = 0; i < notes.length; i++) {
            if (remaining >= notes[i]) {
                noteCounter[i] = remaining / notes[i];
                remaining = remaining % notes[i];
            }
        }
        System.out.println("\nCurrency Note Count:");
        for (int i = 0; i < notes.length; i++) {
            if (noteCounter[i] != 0) {
                System.out.println(notes[i] + " : " + noteCounter[i]);
            }
        }

    
    }
}
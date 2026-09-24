import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int x = sc.nextInt();

        if (x < 0) {
            System.out.println("output: " + 2 * x);
        }
        else if (x < 2) {
            output = x + 1;
        }
        else if (x < 5) {
            output = x * x - 1;
        }
        else {
            output = 3 * x * x + 2;
        }
    }
}

import java.util.Scanner;

public class CE1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && a < c) 
        {
            System.out.println("Smallest number: " + a);
        }
        else if (b < a && b < c) 
        {
            System.out.println("Smallest number: " + b);
        }
        else {
            System.out.println("Smallest number: " + c);
        }
    }
}

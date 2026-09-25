import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Payment: ");
        int payment = sc.nextInt();
        System.out.println("Age: ");
        int age = sc.nextInt();

        double tax;

        if (age < 18) {
            tax = 0;
        }
        else if (payment < 10000) {
            tax = 0;
        }
        else if (payment <= 20000) {
            tax = payment * 0.05;
        }
        else {
            tax = payment * 0.10;
        }

        System.out.printf("Your tax amounts in %.0f Tk%n", tax);
    }
}


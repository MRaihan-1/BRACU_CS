import java.util.Scanner;

public class CW2 {
    public static void main(String[] args) {
        System.out.println("Input: ");
        Scanner sc = new Scanner(System.in);
        int scores = sc.nextInt();

        if (scores >= 90 && scores <= 100)
        {
            System.out.println("Your grade is A");
        }
        else if (scores >= 85)
        {
            System.out.println("Your grade is A-");
        }
        else if (scores >= 70)
        {
            System.out.println("Your grade is B");
        }
        else if (scores >= 57)
        {
            System.out.println("Your grade is C");
        }
        else if (scores >= 50)
        {
            System.out.println("Your grade is D");
        }
        else {
            System.out.println("Your garde is F");
        }
    }
}

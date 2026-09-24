import java.util.Scanner;

public class CE2 {
    public static void main(String[] args) {
        System.out.println("Input: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if (num < 0) 
        {
            System.out.println("Number is negative");
        }
        else if (num == 0) 
        {
            System.out.println("Number is zero");
        }
        else if (num % 2 == 0) 
        {
            System.out.println("Number is positive and even");
        }
        else {
            System.out.println("Number is positive and odd");
        }
    }
}

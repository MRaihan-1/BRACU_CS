import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input: ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String operator = sc.next();

        if (operator.equals("+")) {
            System.out.println(num1 + num2);
        }
        else if (operator.equals("-")) {
            System.out.println(num1 - num2);
        }
        else if (operator.equals("*")) {
            System.out.println(num1 * num2);
        }
        else if (operator.equals("/")) {

            if (num2 != 0) {
                System.out.println(num1 / num2);
            }
            else {
                System.out.println("Cannot divide by zero");
            }
        }
        else {
            System.out.println("Invalid operator");
        }
    }
}

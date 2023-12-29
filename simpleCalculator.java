import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();
        System.out.println("Add :" + (a + b));
        System.out.println("Sub :" + (a - b));
        System.out.println("Mul :" + (a * b));
        if (b == 0) {
            System.out.println("Div : Divide by 0 is not allowed.");
        } else {
            System.out.println("Div :" + (a / b));
        }
        scan.close();
    }
}

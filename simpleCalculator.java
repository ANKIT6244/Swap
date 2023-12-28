import java.util.Scanner;

public class simpleCalculator {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("a = ");
        int a = scan.nextInt();
        System.out.print("b = ");
        int b = scan.nextInt();

        for (int i = 1; i <= 4; i++) {
            switch (i) {
                case 1:
                    System.out.println("Add :" + (a + b));
                    break;
                case 2:
                    System.out.println("Sub :" + (a - b));
                    break;
                case 3:
                    System.out.println("Mul :" + (a * b));
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Div : Divide by 0 is not allowed.");
                    } else
                        System.out.println("Div :" + (a / b));
                    break;
            }

        }
    }
}

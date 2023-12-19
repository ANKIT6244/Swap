import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);

        System.out.println("Enter Ankit's Marks:");
        String Name = name.nextLine();

        System.out.println("Enter Harsh's Marks:");
        String SecondName = name.nextLine();

        name.close();

        System.out.println("Ankit's Marks is: " + Name);
        System.out.println("Harsh's Marks is:" + SecondName);
    }
}
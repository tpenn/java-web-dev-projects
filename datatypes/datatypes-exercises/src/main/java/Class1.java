import java.util.Scanner;

public class Class1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.print("What is your name? ");
//        String name = input.nextLine();
//        System.out.println("Hello, " + name + "!");
        System.out.print("Please enter two integers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        System.out.println("-> " + num1 + " + " + num2 + " = " + add(num1, num2));
    }

    public static int add(int x, int y) {
        return x + y;
    }
}

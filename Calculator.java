import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int firstNum = in.nextInt();

        System.out.print("Enter another number: ");
        int secondNum = in.nextInt();

        System.out.println(addNums(firstNum, secondNum));
        in.close();
    }

    public static int addNums (int first, int second) {
        return first + second;
    }
}


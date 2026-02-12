import java.util.Scanner;

public class Calculator {
    public static void main(String [] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        float firstNum = in.nextFloat();

        System.out.print("Enter another number: ");
        float secondNum = in.nextFloat();

        System.out.print("Would you like to add, subtract, multiply, or divide? ");
        String response = in.next();

        switch (response) {
            case "add":
            case "addition":
                addNums(firstNum, secondNum);
                break;
            case "subtract":
            case "subtraction":
                subtractNum(firstNum, secondNum);
                break;
            case "multiply":
            case "multiplication":
                multiplyNum(firstNum, secondNum);
                break;
            case "divide":
            case "division":
                divideNum(firstNum, secondNum);
                break;
            default:
                System.out.println("Incorrect Input");
                break;
        }

        in.close();
    }

    public static void addNums (float first, float second) {
        System.out.println(first + second);
    }
    public static void subtractNum (float first, float second) {
        System.out.println(first - second);
    }
    public static void multiplyNum (float first, float second) {
        System.out.println(first * second);
    }
    public static void divideNum (float first, float second) {
        if (second == 0) {
            System.out.print("Error: Divide By Zero");
        } else {
             System.out.println(first / second);
        }
    }
}


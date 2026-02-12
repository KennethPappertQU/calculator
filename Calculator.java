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
                System.out.println(addNums(firstNum, secondNum));
                break;
            case "subtract":
            case "subtraction":
                System.out.println(subtractNum(firstNum, secondNum));
                break;
            case "multiply":
            case "multiplication":
                System.out.println(multiplyNum(firstNum, secondNum));
                break;
            case "divide":
            case "division":
                System.out.println(divideNum(firstNum, secondNum));
                break;
            default:
                System.out.println("Incorrect Input");
                break;
        }

        in.close();
    }

    public static float addNums (float first, float second) {
        return first + second;
    }
    public static float subtractNum (float first, float second) {
        return first - second;
    }
    public static float multiplyNum (float first, float second) {
        return first * second;
    }
    public static float divideNum (float first, float second) {
        return first / second;
    }
}


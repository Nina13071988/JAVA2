package DZ2;

import java.util.Scanner;
import java.util.logging.*;

public class task2 {
    private static final Logger logger = Logger.getLogger(task2.class.getName());

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        logger.info("Calculator started");

        System.out.print("Enter two numbers: ");
        double first = reader.nextDouble();
        double second = reader.nextDouble();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = reader.next().charAt(0);

        double result;

        switch(operator) {
            case '+':
                result = first + second;
                break;
            case '-':
                result = first - second;
                break;
            case '*':
                result = first * second;
                break;
            case '/':
                result = first / second;
                break;
            default:
                logger.warning("Invalid operator: " + operator);
                System.out.printf("Error! Enter correct operator");
                return;
        }

        logger.info("Calculation performed: " + first + " " + operator + " " + second + " = " + result);
        System.out.printf("%.1f %c %.1f = %.1f", first, operator, second, result);
    }
}
import java.sql.SQLInvalidAuthorizationSpecException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value: ");
        Float x = scanner.nextFloat();
        System.out.println("Enter second value: ");
        Float y = scanner.nextFloat();
        System.out.print("What do you want to do? Choose: \n1.addition\n2.substraction\n3.division\n4.multiplication");
        int select = scanner.nextInt();
        CalculatorBooster cal1 = new CalculatorBooster();
        switch (select) {
            case 1:
                System.out.println(cal1.addition(x, y));
                break;
            case 2:
                System.out.println(cal1.substraction(x, y));
                break;
            case 3:
                System.out.println(cal1.division(x, y));
                break;
            case 4:
                System.out.println(cal1.multiplication(x, y));
                break;
        }
    }
}
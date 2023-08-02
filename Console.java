import java.util.Scanner;
public class Console{
    public static void main(String[]args){
        System.out.println("Hours worked:");
        Scanner stdin = new Scanner(System.in);
        double hoursWorked = stdin.nextDouble();
        double grossPay = hoursWorked * 450.50;
        double withholdingTax = 0.2 * grossPay;
        double netPay = grossPay - withholdingTax;

        System.out.println("hours worked");
         System.out.println(450.50);
          System.out.println("gross pay");
           System.out.println("withholding Tax");
            System.out.println("net pay");
    }
}
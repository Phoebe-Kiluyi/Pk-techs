import java.util.Scanner;
public class Application{
    public static void main(String[]args){
        System.out.println("Please enter product price:");
        Scanner stdin = new Scanner(System.in);
        float productPrice = stdin.nextFloat();
        float valueAddedTax = 0.16f * productPrice;
        float sellingPrice = productPrice - valueAddedTax;

        System.out.println(productPrice);
        System.out.println(valueAddedTax);
        System.out.println(sellingPrice);
    }
}
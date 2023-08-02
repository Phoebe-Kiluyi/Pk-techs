import java.util.Scanner;
public class Quadratic{
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the value of a:");
        double a = input.nextDouble();

        System.out.println("Enter the value of b:");
        double b = input.nextDouble();

        System.out.println("Enter the value of c:");
        double c = input.nextDouble();
        //Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        if (discriminant > 0){
            double root1 = (-b + Math.sqrt(discriminant))/(2 * a);
            double root2 = (-b - Math.sqrt(discriminant))/(2 * a);
            System.out.println("The roots of the quadratic equation are:" + root1 + "and" + root2);
        }
        else if(discriminant == 0){
            double root = -b / (2 * a);
            System.out.println("The root of the quadratic equation is:" + root);
        }
        else{
            System.out.println("The quadratic equation has no real roots");
        }
    }
}
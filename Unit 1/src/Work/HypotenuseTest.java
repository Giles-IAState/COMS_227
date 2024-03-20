package Work;

import java.util.Scanner;

public class HypotenuseTest {
    public static double hypotenuse(double base, double height){

        return Math.sqrt(Math.pow(base, 2.0) + Math.pow(height, 2.0));
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("Please enter a base and height for calculation: ");
        double base = s.nextDouble();
        double height = s.nextDouble();

        System.out.println(hypotenuse(base,height));
    }
}
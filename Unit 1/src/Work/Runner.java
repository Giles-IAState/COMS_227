package Work;

import java.util.Scanner;

public class Runner {

    public static void main(String[] args){

        int w = 0;
        int h = 0;
        Scanner s = new Scanner(System.in);
        SimpleRectangle rect1 = new SimpleRectangle(w, h);

        System.out.println("Enter a width and height for a rectangle:");
        rect1.setWidth(s.nextInt());
        rect1.setHeight(s.nextInt());

        System.out.println("Set Width: " + rect1.getWidth() + ", and Set Height: " + rect1.getHeight());
        System.out.println("Area: " + rect1.getArea() + "        Perimeter: " + rect1.getPerimeter());
        System.out.printf("%.2f","Hypotenuse: " + rect1.getHypotenuse());

    }
}

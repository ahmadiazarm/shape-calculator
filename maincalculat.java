package calculator;
import java.util.Scanner;
public class maincalculat {
    public static void start() {

    Scanner eyes = new Scanner(System.in);
    Scanner sc = new Scanner(System.in);

    char choice =0;

    do {

        System.out.println("chose a shape you want to calculate:square[1] circle[2] rectangle[3] triangle[4] : ");
        int shape = eyes.nextInt();

        if (shape == 1) {
            System.out.println("enter the square ds:");
            double a = eyes.nextDouble();
            double y = ((a * a));
            System.out.println("Result for square:" + y);
            System.out.println("do you want yo continue yes or no:");
            choice = sc.next().charAt(0);

        } else if (shape == 2) {
            System.out.println("enter the Radius:");
            double r = eyes.nextDouble();
            double result = (r * r * 3.14);
            System.out.println("Result circle:" + result);
            System.out.println("do you want yo continue yes or no:");
            choice = sc.next().charAt(0);

        } else if (shape == 3) {
            System.out.println("enter rectangle length:");
            double l = eyes.nextDouble();
            System.out.println("enter rectangle width:");
            double w = eyes.nextDouble();
            double result = (w * l);
            System.out.println("Result rectangle:" + result);
            System.out.println("do you want yo continue yes or no :");
            choice = sc.next().charAt(0);

        } else if (shape == 4) {
            System.out.println("enter the triangle base :");
            double b = eyes.nextDouble();
            System.out.println("enter the triangle height :");
            double h = eyes.nextDouble();
            double x = ((b * h));
            double result = x / 2;
            System.out.println("Result triangle: " + result);
            System.out.println("do you want to continue yes or no :");
            choice = sc.next().charAt(0);

        }
    } while ( choice == 'y');

}
}


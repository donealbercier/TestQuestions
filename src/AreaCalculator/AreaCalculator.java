package AreaCalculator;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by doneal on 10/11/2016.
 */
public class AreaCalculator {
    public static void main(String[] args) {
        Menu menu = new Menu();
        Scanner menuChoice = new Scanner(System.in);
        Scanner side = new Scanner(System.in);
        Scanner rectangle = new Scanner(System.in);

        boolean finished = false;
        while (!finished) {
            System.out.println(menu.menuString);

                int choice = menuChoice.nextInt();

                    switch (choice) {
                        case(0): {
                            finished=true;
                            break;
                        }
                        case (1): {
                            System.out.print(menu.squareMenu);
                            double sideLength = side.nextDouble();
                            Square sq = new Square(sideLength);
                            System.out.println("The area is :" + sq.getArea());
                            break;
                        }
                        case (2): {
                            System.out.println(menu.rectangleMenu);
                            double sideLength=side.nextDouble();
                            double sideWidth =side.nextDouble();
                            Rectangle rec = new Rectangle(sideWidth,sideLength);
                            System.out.println("The area is :"+rec.getArea());


                        }
                        case (3): {
                            System.out.println(menu.circleMenu);
                            double radius=side.nextDouble();
                            Circle circle = new Circle(radius);
                            System.out.println("The area is :"+circle.getArea());
                        }
                    }




            System.out.print("\nDo you want to find another area(y/n):");
            String again = menuChoice.next().toLowerCase();
            finished = !again.equals("y");
            System.out.println("\n\n");
        }
    }
}

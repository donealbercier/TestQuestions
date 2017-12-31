package UdemyTutorial;

import java.util.Scanner;

public class SwitchExamples {

    static void printMenu(){
        String menu =
                        "==============================================\n" +
                        "----------------ICE CREAM SHOPPE--------------\n" +
                        "==============================================\n" +
                        "1) VANILLA -------------------------------3.75\n" +
                        "2) CHOCOLATE -----------------------------3.75\n" +
                        "3) STRAWBERRY ----------------------------3.75\n"+
                        "4) PLUM PUDDIN ---------------------------3.75\n"+
                        "5) LEMON ---------------------------------3.75\n" +
                        "6) BANANA --------------------------------3.75\n" +
                        "7) BIRTHDAY CAKE--------------------------3.75\n"+
                        "8) DOG FOOD -- ---------------------------3.75\n";
        System.out.println(menu);
    }

    static void iceCreamSelection(){
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("What Flavor Do You Want(enter the menu number): ");
        int switchStatement = reader.nextInt();
        System.out.println("How many scoops do you want(1, 2 or 3): ");
        int scoops = reader.nextInt();
        if(scoops>3||scoops<1){
            while(scoops>3||scoops<1){
                System.out.println("You can only get 1, 2, or 3 scoops");
                System.out.println("How many scoops do you want(1, 2 or 3): ");
                scoops = reader.nextInt();

            }
        }
        String scoopsString = scoops + " scoops of ";

        switch (switchStatement) {

            case (1):
                System.out.println("You chose " + scoopsString+ "Old Fashioned Vanilla. ");
                break;

            case (2):
                System.out.println("You chose " + scoopsString+ "Creamy Classic Chocolate");
                break;

            case (3):
                System.out.println("You got " + scoopsString+ "the Super Sweet Strawberry");
                break;

            case (4):
                System.out.println("You chose " + scoopsString+ "the Positively Perfect Plum Puddin");
                break;
            case (5):
                System.out.println("You chose " + scoopsString+ "Sour Power Lemon ");
                break;

            case (6):
                System.out.println("You chose " + scoopsString+ "Balmy Breeze Banana");
                break;

            case (7):
                System.out.println("HAPPY BIRTHDAY!!!");
                break;

            case (8):
                System.out.println("EWW GROSS");
                break;

            default:
                System.out.println("I'm sorry we don't carry that Ice Cream");
                break;
        }
    }

    static boolean continueShopping(){

        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Do you want more Ice Cream(y/n): ");
        String switchStatement = reader.next();

        switch (switchStatement){

            case("yes"):
                return true;

            case("y"):
                return true;

            case("no"):

                return false;

            case("n"):
                return false;

            default:
                System.out.println("I didn't understand that");
                return false;

            }
        }





    public static void main(String[] args){

        printMenu();

        boolean isShopping = true;
        int iceCreamEaten = 0;
        while (isShopping&&iceCreamEaten<5) {
            //Start With Selection
            iceCreamSelection();
            iceCreamEaten++;

            //Ask if User is Done
            isShopping = continueShopping();

            if(!isShopping){
                System.out.println("Hope you come back soon!!");
            }

            if(iceCreamEaten==5){
                System.out.println("You've Eaten too much... Go away");
            }

        }

    }
}

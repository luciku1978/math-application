package org.fasttrackit;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {

        MathOperation mathObject = new MathOperation();


        Scanner input = new Scanner(System.in);
        double userInput1;
        double userInput2;
        int userChoice;

        System.out.print("Introduceti primul numar: ");
        userInput1 = input.nextDouble();
        System.out.print("Introduceti al doilea numar: ");
        userInput2 = input.nextDouble();
        System.out.println("Selectati operatia matematica de efectuat:");
        System.out.println("1-Suma");
        System.out.println("2-Scadere");
        System.out.println("3-Inmultire");
        System.out.println("4-Impartire");
        userChoice = input.nextInt();

        switch (userChoice) {
            case 1:
                System.out.println("Rezultatul adunarii este: "+mathObject.suma(userInput1, userInput2));
                break;
            case 2:
                System.out.println("Rezultatul scaderii este: "+mathObject.scadere(userInput1, userInput2));
                break;
            case 3:
                System.out.println("Rezultatul inmultirii este: "+mathObject.produs(userInput1, userInput2));
                break;
            case 4:
                System.out.println("Rezultatul impartirii este: "+mathObject.impartire(userInput1, userInput2));
                break;
        }
    }
}

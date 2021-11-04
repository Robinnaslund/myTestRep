package Scount;

import java.util.Scanner;

public class StringCountMain {

    public static void main(String[] args) {

        StringCount sc = new StringCount();
        Scanner scan = new Scanner(System.in);
        System.out.println("Vänligen skriv en text:");

        while (true) {
            String text = scan.nextLine();
            System.out.println(sc.countCharacters(text));
            System.out.println(sc.CountRows(text));
            sc.isInputStop(text);
            if (sc.getStop()) {
                System.out.println("Du har skrivit " + sc.numberCharacters() + " tecken");
                System.out.println("Och " + sc.numberRows() + " rader.");
                break;



            }


        }


    }
}








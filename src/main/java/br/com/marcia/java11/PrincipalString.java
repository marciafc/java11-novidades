package br.com.marcia.java11;

import java.util.stream.Collectors;

public class PrincipalString {

    public static void main(String[] args) throws Exception {

        testIsBlank();

        testLines();

        testStrips();

        testRepeat();

    }

    private static void testIsBlank() {

        System.out.println("****** isBlank() ******");

        System.out.println(" ".isBlank()); //true

        String s = "Anupam";
        System.out.println(s.isBlank()); //false

        String s1 = "";
        System.out.println(s1.isBlank()); //true

        System.out.println();
    }

    private static void testLines() {

        System.out.println("****** lines() ******");

        String str = "Pizza\nOrégano\nTomate";
        System.out.println(str);

        System.out.println(str.lines().collect(Collectors.toList()));

        System.out.println();

        /**

         Saída:

         Pizza
         Orégano
         Tomate
         [Pizza, Orégano, Tomate]

         */
    }

    private static void testStrips() {

        System.out.println("****** strip(), stripLeading(), stripTrailing()  ******");

        String str = " Pizza ";
        System.out.print("Start");
        System.out.print(str.strip());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripLeading());
        System.out.println("End");

        System.out.print("Start");
        System.out.print(str.stripTrailing());
        System.out.println("End");

        System.out.println();

        /**

         Saída:

         StartPizzaEnd
         StartPizza End
         Start PizzaEnd

         */
    }

    private static void testRepeat() {

        System.out.println("****** repeat()  ******");

        String str = "pizza".repeat(3);
        System.out.println(str);

        System.out.println();

        /**

         Saída:

         pizzapizzapizza

         */
    }

}

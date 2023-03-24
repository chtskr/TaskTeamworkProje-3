package PROJECTS.PROJECTS03;

import java.util.Locale;
import java.util.Scanner;

public class CamelCase {

    /*
     TASK ->
       First letter to upper case
        parameter is one String
        return type is String
        words are delimited by a space.
        All the words first letter should be camel case

       input:

           I lIVe in uSa

      Result should be

           I Live In Usa

     */

    /*
            CamelCase : camelcase adında Kendisine gönderilen bir cümledeki kelimelerin sadece ilk karakterlerini
            büyük harfe çevirip return eden  method create ediniz.
            input: I lIVe in uSa
            output: I Live In Usa

     */
    public static void main(String[] args) {


        //System.out.println(camelCase());
        Scanner scanner =   new Scanner(System.in);
        System.out.println(" agam cümmle giriniz1 :) ");
        String cumle= scanner.nextLine();
        System.out.println(cumle.substring(0).toUpperCase(Locale.ROOT));

    }

    private static void camelCase() {




    }


    }




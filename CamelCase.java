package TeamWork.Project_03;

import java.util.Arrays;

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

        Scanner sc = new Scanner(System.in);
        System.out.println("Cümle Giriniz");
        String letter = sc.nextLine();

        String letter1[] = letter.split(" ");
        System.out.println(Arrays.toString(letter1)); //[I, lIVe, in, uSa]


        for (int i = 0; i < letter1.length; i++) {
            System.out.print(letter1[i].substring(0, 1).toUpperCase() + letter1[i].substring(1).toLowerCase() + " ");


        }

    }
}



package PROJECTS.PROJECTS03;

import java.util.Scanner;

public class SubtractionSquare {



     /*

    Given one method name is substSquare

    This method get two ints as parameter

    return type is int

    Get  square of the sum of the numbers using getSumOfSquares method ,

    Parameter 1 square of the sum + Parameter 2 square of the sum  = your result

    for example:
    int 1 = 10

    int 2 = 5;

    3025 + 225 = 3250

    return 3250

     */

    /* TASK ->
    Girilen iki tamsayı değerine kadar olan sayıların topamının karalerinin toplamını return eden substSquare
    method create ediniz.

   Örnek:

    int 1 = 10; -> (1+2+3+...+10)^2=3025

    int 2 = 5;  -> (1+2+3+...+5)^2=225

    3025 + 225 = 3250
    return 3250
    */
    public static void main(String[] args) {

        int sayi1 = 10;
        int sayi2 = 5;
        System.out.println(getSumOfSquares(sayi1, sayi2));

    }

    private static int getSumOfSquares(int sayi1, int sayi2) {
        int sayi1Toplam = 0;
        int sayi2Toplam = 0;
        for (int i = 1; i <= sayi1; i++) {
            sayi1Toplam += i;
        }
        for (int j = 1; j <= sayi2; j++) {
            sayi2Toplam += j;
        }


        return ((sayi1Toplam * sayi1Toplam) + (sayi2Toplam * sayi2Toplam));
    }


}

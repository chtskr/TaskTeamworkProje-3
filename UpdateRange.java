package PROJECTS.PROJECTS03;

import java.util.Arrays;

public class UpdateRange {


    /*

    Update a method uRange

    parameters are int array and two ints

    if the int array has a number between the two int change it to -1

    for Example
    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    result should be 1,6,-1,-1,22,-1,30,-1

     */


   /*
    TASK->  UpdateRange
   URange isminde bir metod yazınız,
   Bu metod parametre olarak int Array ve 2 adet int almalı.
   Metod kendisine gönderilen Array ın içindeki elemanlardan, yine kendisine gönderilen
   sayılar  arasında olanlarına -1 değerini atayıp int array return eden  uRange method create ediniz.

   Örnek:

    int array = 1,6,12,15,22,18,30,16

    int 1 = 10

    int 2 = 20

    sonuc  1,6,-1,-1,22,-1,30,-1  olmalı.
         */

    public static void main(String[] args) {


        int arr [] = {1,6,12,15,22,18,30,16};

        int sayi1 =10;
        int sayi2 =20;

      URange (arr,sayi1,sayi2);




    }

    private static int[] URange(int[] arr, int sayi1, int sayi2) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= sayi1 && arr[i] <= sayi2) {
                arr[i] = -1;
            }

        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }


}
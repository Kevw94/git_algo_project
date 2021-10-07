package com.company;

import java.util.Random;



public class Main {

    public static float nombreOperation = 0;
//    public static int comparisonNumbers =


     public static void soartedSelection(int[] array) {
         int i; // fist for in array
         int min; // min of each array
         int j; // second for in array
         int organisation;
         for (i = 0; i < array.length - 1; i++) {
             min = i;
             nombreOperation += 1; //count
             for (j = i + 1; j < array.length; j++) {
                 if (array[j] < array[min]) {// selection
                     nombreOperation += 1; // count
                     min = j;
                     nombreOperation += 1;// count
                     organisation = array[min];
                     nombreOperation += 1;// count
                     array[min] = array[i];
                     nombreOperation += 1;// count
                     array[i] = organisation;
                     nombreOperation += 1;// count
                 }
             }

         }



     }


         public static void stats ( int min, int max, int step, int nbr){
             int i;
             nombreOperation = 0;
             for (i = 1; i <= nbr; i++) {
                int array[] = new Random().ints(min).toArray();
                 soartedSelection(array);
             }
             if (i > nbr && min < max) {
                 System.out.println(" Nombre d'opérations dans le pire des cas pour l'exemple  " + min*min*nbr + " " +  " Nombre d'opérations moyennes    "  + nbr * (min*(min-1))/2);
                 stats((min + step), max, step, nbr);
             } else {
                 System.out.println(" Nombre d'opérations dans le pire des cas pour l'exemple  " + min*min*nbr + " " +  " Nombre d'opérations moyennes   "  + nbr * (min*(min-1))/2);
             }
         }

         public static void printArray ( int array[])
         {

             for (int i = 0; i < array.length; ++i)
                 System.out.print(array[i] + " ");
             System.out.println();
         }
















    public static void main(String[] args) {
        stats(10,1000,5,10);



        int[] array = {1,4,2,7,25,20,10};
        soartedSelection(array);
        printArray(array);














        // write your code here
    }
}

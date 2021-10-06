package com.company;

import java.util.Random;



public class Main {

    public static float nombreOperation = 0;


     public static void soartedSelection(int[] array){
            int i; // fist for in array
            int attributedValues;
            int j; // second for in array
            int organisation;
            for (i = 0; i <=  array.length -1 ; i++) {
                attributedValues = i;
                nombreOperation =nombreOperation + 1;
                for (j = i + 1; j <=  array.length - 2 ; j++) {
                    if (array[j] < array[attributedValues]) {// selection
                        attributedValues = j;
                        nombreOperation =nombreOperation + 1;// count
                        organisation = array[attributedValues];
                        array[attributedValues] = array[i];
                        array[i] = organisation;
                    }




                }
            }
        }


    public static void stats (int min, int max, int step, int nbr) {
        int i;
        nombreOperation = 0;
        for (i = 1; i <= nbr ; i++){
            int T[] =new Random().ints(min).toArray();
            soartedSelection(T);
        }
        if (i>nbr && min<max){
            System.out.println(min +" "+ nombreOperation/nbr);
            stats((min+step),max,step,nbr);
        }
        else {
            System.out.println(min +" "+ nombreOperation/nbr);
        }
    }



















    public static void main(String[] args) {


        stats (10, 20,5 , 10);












        // write your code here
    }
}


package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static int nombreOperation =0;

    Random random = new Random();


public static void tri_insertion (int T[]){
    int taille = T.length;
    int x = 0;
    int j = 0;
    for (int i =1; i< taille; i++){
        x = T[i];
        j = i-1;
        while (j>=0 && T[j]> x){
            T[j+1] = T[j];
            j--;
            System.out.println(Arrays.toString(T) + "w");
            nombreOperation++;
        }
        T[j+1] =  x;
        System.out.println(Arrays.toString(T));
        nombreOperation++;
    }
}
    public static void main(String[] args) {

    int T[] =new Random().ints(10,0,10).toArray();

    tri_insertion(T);
        System.out.println(nombreOperation);
    }
}

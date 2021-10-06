package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static float nombreOperation;

    Random random = new Random();

    public static void stats (int min, int max, int step, int nbr) {
       int i = 1;
       nombreOperation =0;
        for (i = 1; i <= nbr ; i++){
            int T[] =new Random().ints(min).toArray();
            tri_insertion(T);
            }
            if (i>nbr && min<max){
                System.out.println(min +" "+ nombreOperation/nbr);
                stats((min+step),max,step,nbr);
        }
            else {
                System.out.println(min +" "+ nombreOperation/nbr);
            }
    }


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
            nombreOperation++;
        }
        T[j+1] =  x;
        nombreOperation++;
    }
}
    public static void main(String[] args) {

    //int T[] =new Random().ints(10,0,10).toArray();
    //int T[] = {1,2,3,4,5,6,7,8};
    //tri_insertion(T);
        //System.out.println(nombreOperation);
        stats(10,20,5,10);
    }
}

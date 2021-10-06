package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static float nombreOperation=0;
    public static int comparaison =0;
    public static int affectation = 0;

    //Random random = new Random();

    public static void stats (int min, int max, int step, int nbr) {
        int i;
        nombreOperation =0;
        comparaison =0;
        affectation =0;
        for (i = 1; i <= nbr ; i++){
            int T[] =new Random().ints(min).toArray();
            tri_insertion(T);
        }
        if (i>nbr && min<max){
            System.out.println(min +" "+ nombreOperation/nbr +" le nombre de comparaisons en moyenne est de "+comparaison/nbr + ", le nombre d'affectations en moyenne est de " + affectation/nbr + " et le nombre d'échanges en moyenne est de "+ (affectation/3)/nbr +".");
            stats((min+step),max,step,nbr);
        }
        else {
            System.out.println(min +" "+ nombreOperation/nbr + " le nombre de comparaisons en moyenne est de "+comparaison/nbr + ", le nombre d'affectations en moyenne est de " + affectation/nbr + " et le nombre d'échanges en moyenne est de "+ (affectation/3)/nbr +".");
        }
    }


    public static void tri_insertion (int T[]){
        int taille = T.length;
        int x = 0;
        int j = 0;
        for (int i =1; i< taille; i++){
            x = T[i];
            j = i-1;
            affectation = affectation +2;
            nombreOperation = nombreOperation +2;
            while (j>=0 && T[j]> x){
                T[j+1] = T[j];
                j--;
                affectation = affectation +2;
                comparaison++;
                nombreOperation = nombreOperation +3;
            }
            T[j+1] =  x;
            affectation++;
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

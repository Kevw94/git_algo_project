package com.company;

import java.util.Arrays;

public class Main {


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
        }
        T[j+1] =  x;
        System.out.println(Arrays.toString(T));
    }

}
    public static void main(String[] args) {
    int T[] = {6,5,3,1,2,8,7,4};
    tri_insertion(T);

    //System.out.println(Arrays.toString(T));
    }
}

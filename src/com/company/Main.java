package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.StringJoiner;


public class Main {
    public static float nombreOperation;

    Random random = new Random();

    public static void stats (int min, int max, int step, int nbr) {
        int i = 1;
        nombreOperation =0;
        for (i = 1; i <= nbr ; i++){
            int tab[] =new Random().ints(min).toArray();
            TriBulle(tab);
        }
        if (i>nbr && min<max){
            System.out.println(min +" "+ nombreOperation/nbr);
            stats((min+step),max,step,nbr);
        }
        else {
            System.out.println(min +" "+ nombreOperation/nbr);
        }
    }

    public static void TriBulle(int tab[]){

        int longueur = tab.length;
        int i =0;
        int v = i;
        int compteur = 0;
        int echange =0;

        while (i < longueur-1){

            if (tab[i]>tab[i+1]){
                nombreOperation++;

                compteur+=1;
                int tmp = tab[i];
                tab[i] = tab[i+1];
                tab[i+1] = tmp;
                echange+=3;

                while (tab[i]<tab[i+1]){
                    compteur+=1;
                    v=i;
                    i=v+1;
                    nombreOperation++;
                    if (v>0){
                        tmp = tab[v];
                        tab[v]=tab[v-1];
                        tab[v-1] = tmp;
                        v = i-1;
                        i=v-1;
                        echange +=3;
                        nombreOperation++;
                    }else{
                        nombreOperation++;
                        i+=1;
                        break;
                    }
                }

            }else{
                compteur+=1;
                i+=1;
            }
        }

    }
    public static void main(String[] args) {

        stats(10,20,5,10);

    }



    }


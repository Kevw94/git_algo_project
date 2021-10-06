package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.StringJoiner;


public class Main {
    public static float nombreOperation;

    public static float nombreOperation1;

    Random random = new Random();

    public static void statsOpti (int min, int max, int step, int nbr) {
        int i = 1;
        nombreOperation =0;
        for (i = 1; i <= nbr ; i++){
            int tab[] =new Random().ints(min).toArray();
            TriBulleOpti(tab);
        }
        if (i>nbr && min<max){
            System.out.println(min +" "+ nombreOperation/nbr);
            statsOpti((min+step),max,step,nbr);
        }
        else {
            System.out.println(min +" "+ nombreOperation/nbr);
        }
    }

    public static void stats (int min, int max, int step, int nbr) {
        int i = 1;
        nombreOperation1 =0;
        for (i = 1; i <= nbr ; i++){
            int tab[] =new Random().ints(min).toArray();
            TriBulle(tab);
        }
        if (i>nbr && min<max){
            System.out.println(min +" "+ nombreOperation1/nbr);
            stats((min+step),max,step,nbr);
        }
        else {
            System.out.println(min +" "+ nombreOperation1/nbr);
        }
    }
    public static void TriBulle(int tab[]){
        int comparaison = 0;
        int affectation = 0;
        int longueur = tab.length;

        for (int i = 0; i < longueur-1; i++) {
            for (int k = 0; k < longueur-1; k++) {
                nombreOperation1++;
                if (tab[k]>tab[k+1]){
                    nombreOperation1++;
                    comparaison+=1;
                    int tmp = tab[k];
                    tab[k] = tab[k+1];
                    tab[k+1] = tmp;
                    affectation+=3;
                }else {
                    nombreOperation1++;
                    continue;
                }
            }

        }
    }

    public static void TriBulleOpti(int tab[]){

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

        statsOpti(10,20,5,10);
        stats(10,20,5,10);

        int y[] ={2,78,9,0,94,6};
        TriBulle(y);
    }
}
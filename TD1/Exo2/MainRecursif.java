package Exo2;

import java.util.Scanner;

public class MainRecursif {

    public static void main(String[]args){

        int []t=new int[10];
        for (int i = 0; i <t.length ; i++) {
            t[i]=i;
        }
        //System.out.println(Recursif.nbOccAux2(6,t,5));
        //System.out.println(Recursif.nbOcc(6,t));
        char[]t2={'a','b','b','a'};
        char[]t3={'a','b','b','a','e'};

        System.out.println(Recursif.estPal(t2));
        System.out.println(Recursif.estPal(t3));
    }
}

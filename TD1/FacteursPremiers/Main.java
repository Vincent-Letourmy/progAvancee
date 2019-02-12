package FacteursPremiers;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        int n =36;

        ArrayList<Integer> res = FacteursPremier.decompose2(n);

        for(int i=0;i<res.size();i++){
            System.out.print(res.get(i)+" ");
        }
        System.out.println();

        System.out.println(FacteursPremier.plusPetitDiv2(n));


    }
}

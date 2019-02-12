package FacteursPremiers;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class FacteursPremier {


    static ArrayList<Integer> decompose (int x){
        int res=0;
        ArrayList<Integer> temp = new ArrayList<>();
        int i=2;
        while(i<x){
            if (x%i==0){
                res = x/i;
                temp = decompose(res);
                temp.add(i);
                return temp;
            }
            i++;
        }
        if (i==x){
            temp.add(i);
            return temp;
        }
        return temp;
    }

    static int plusPetitDiv(int x){
        ArrayList<Integer> res = decompose(x);
        int div=res.get(0);
        for (int i=1;i<res.size();i++){
            if (div > res.get(i)){
                div=res.get(i);
            }
        }
        return div;
    }

    static int plusPetitDiv2(int x){
        for (int i=2;i<x;i++){
            if (x%i==0){
                return i;
            }
        }
        return x;
    }

    static ArrayList<Integer> decompose2(int x){
        ArrayList<Integer> temp = new ArrayList<>();
        if (x==plusPetitDiv2(x)){
            temp.add(x);
            return temp;
        }
        temp = decompose2(x/plusPetitDiv2(x));
        temp.add(plusPetitDiv2(x));
        return temp;

    }
}


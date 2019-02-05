package Exo1;

public class Recursif {

    static int factorielle(int n){
        if (n==0) {
            return 1;
        }
        else{
            return n*factorielle(n-1);
        }
    }

    static boolean pair(int n){
        if(n==0){
            return true;
        }
        else{
            return (!pair(n-1));
        }
    }

    static int sommeImp(int n){
        if(n==1){
            return 1;
        }
        else{
            return n+sommeImp(n-2);
        }
    }

    static int puiss(int x,int n){
        if(n==1){
            return x;
        }
        else{
            return x*puiss(x,n-1);
        }
    }

}

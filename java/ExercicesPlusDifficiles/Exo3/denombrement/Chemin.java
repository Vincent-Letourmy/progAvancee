package Exo3.denombrement;

public class Chemin {

    static int chemin(int x,int y){
        if (x==1 || y==1){
            return 1;
        }
        else{
            return chemin(x,y-1)+chemin(x-1,y);
        }
    }

    static double cheminBis(int x){

        return (Recursif.factorielle(2*(x-1))/ Recursif.puiss(Recursif.factorielle(x-1),2));

    }

    static double cheminThibault(double n){
        if (n==0 || n==-1){
            return 1;
        }
        if(n>0){
            return -(cheminThibault(2*-(n-1))) / (-(n-1) * -(n-1) * cheminThibault(-n +2)*cheminThibault(-n +2));
        }
        else{
            return n * cheminThibault(n+1);
        }
    }
}

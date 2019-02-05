package Exo2;

public class Recursif {

    static int nbOccAux(int x,int[]t,int i){
        if (i==t.length-1){
            if(t[i]==x){
                return 1;
            }
            else{
                return 0;
            }
        }
        else if(t[i]==x){
            return 1+nbOccAux(x,t,i+1);
        }
        else{
            return nbOccAux(x,t,i+1);
        }
    }

    static int nbOcc(int x,int[]t){
        return nbOccAux(x,t,0);
    }

    static int nbOccAux2(int x,int[]t,int i){
        if (i>t.length-1){
            return 0;
        }
        else if(t[i]==x){
            return 1+nbOccAux(x,t,i+1);
        }
        else{
            return nbOccAux(x,t,i+1);
        }
    }

    static boolean estPalAux(char[]t,int i){
        if (t.length-1-2*i<=0){
            return true;
        }
        else if(t[i]!=t[t.length-1-i]){
            return false;
        }
        else {
            return estPalAux(t,i+1);
        }
    }

    static boolean estPal(char[]t){
        return estPalAux(t,0);
    }

    static boolean estCroissantAux(int[]t,int i){
        if (i>t.length-2){
            return true;
        }
        else if(t[i]>t[i+1]) {
            return false;
        }
        else{
            return (estCroissantAux(t,i+1));
        }
    }

    static boolean estCroissant(int[]t){
        return estCroissantAux(t,0);
    }





























}

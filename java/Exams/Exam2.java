package Exams;

import java.util.Arrays;

public class Exam2 {

    public static void main(String[] args) {

        int[]tabUnpeuCroissant = {8,5,6,2,5,8};
        int[]tabPasUnPeuCroissant = {6,5,7,3,2,9};
        int[]tabJeu = {3,2,2,6,1,2};
        boolean[][]plateauBille =
                {
                        {true,true,true,true,true},
                        {true,true,false,true,true},
                        {true,true,true,true,true},
                        {true,false,false,true,true},
                        {true,true,true,false,true}
                };

        System.out.println(nbTraj(plateauBille,0,2));

    }

    static boolean unPeuCroissant(int []t, int i){
        if(i == t.length-2){
            return t[i]<t[i+1];
        }
        else {
            if (t[i] < t[i + 1] + t[i + 2]) {
                return unPeuCroissant(t, i + 1);
            }
            else return false;
        }
    }
    static int longueurTrajecDebutFixe(int[]t, int i){
        if (i >= t.length) return 0;
        return 1 + longueurTrajecDebutFixe(t,i+t[i]);
    }

    static int plusLongueTrajec(int[]t, int i){
        if (i == t.length-2) return Math.max(longueurTrajecDebutFixe(t,i),longueurTrajecDebutFixe(t,i+1));
        else return Math.max(longueurTrajecDebutFixe(t,i),plusLongueTrajec(t,i+1));
    }


    static int trouveTrouG(boolean[][]t, int l, int c){
        if (c == 0 || !t[l][c-1]) return -1;
        else if (t[l+1][c-1]) return c-1;
        else return trouveTrouG(t,l,c-1);
    }

    static int trouveTrouD(boolean[][]t, int l, int c){
        if (c == t.length-1 || !t[l][c+1]) return -1;
        else if (t[l+1][c+1]) return c+1;
        else return trouveTrouD(t,l,c+1);
    }

    static int nbTraj(boolean[][]t, int l, int c){

        if (l == t.length-1) return 1;
        else {
            if (t[l+1][c]) {
                return nbTraj(t,l+1,c);
            } else {
                int g = trouveTrouG(t, l, c);
                int d = trouveTrouD(t, l, c);

                if (g == -1 && d == -1) return 0;
                else if (g == -1 && d != -1) return nbTraj(t, l + 1, d);
                else if (g != -1 && d == -1) return nbTraj(t, l + 1, g);
                else return nbTraj(t, l + 1, d) + nbTraj(t, l + 1, g);
            }
        }
    }
}
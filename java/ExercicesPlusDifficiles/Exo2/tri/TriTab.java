package Exo2.tri;

public class TriTab {

    static int drapeauBicolorAux(int[] t, int i) {

        if (i==t.length){
            return i;
        }
        else if (t[i]==0){
            return drapeauBicolorAux(t,i+1);
        }
        else if (t[i]==1){
            return drapeauBicolorAux(t,i+1)-1;
        }
        return 0;
    }

    public static void main(String[] args) {

        int[]t={1,0,1,1,1,0,0};
        System.out.println(drapeauBicolorAux(t,2));

    }
}


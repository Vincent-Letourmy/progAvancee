import java.util.Arrays;

public class Divide {

    static int puiss(int x,int n){
        if(n==1){
            return x;
        }
        else{
            return x*puiss(x,n-1);
        }
    }

    static int puissRapideAux(int x,int n){
        if(n<=1){
            return x;
        }
        int m = puissRapideAux(x,n/2);;
        if (n%2 == 0){
            return m*m;
        }
        else {
            return m*m*x;
        }
    }

    static int pivot (int[]t, int i, int j){

        int[]tRes = new int[t.length];
        int p = t[j];
        int c1 = i;
        int c2 = j;
        for (int k = i; k <= j; k++) {
            if (t[k]>p){
                tRes[c2] = t[k];
                c2--;
            }
            else{
                tRes[c1] = t[k];
                c1++;
            }
        }
        for (int k = i; k <= j; k++) {
            t[k]=tRes[k];
        }
        return c2;
    }

    static void quickSortAux(int[]t, int i,int j){

        if (i>=j);
        else {
            int p = pivot(t, i, j);
            //System.out.println(Arrays.toString(t));
            if (p - i > 1)
                quickSortAux(t, i, p - 1);
            else if (j != t.length - 1)
                quickSortAux(t, j, t.length - 1);
        }
    }

    static void quickSort(int[]t){
        quickSortAux(t,0,t.length-1);
    }

    public static void main(String[] args) {

        //System.out.println(puiss(2,5));
        //System.out.println(puissRapideAux(2,5));

        int[]t = {30,2,10,4,9,1,6,11,15,5,7};
        //int[]t = {3};

        //System.out.println(pivot(t,0,5));
        quickSort(t);
        System.out.println(Arrays.toString(t));
    }
}

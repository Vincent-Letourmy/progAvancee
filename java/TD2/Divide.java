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
        int c1 = 0;
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
        return c1;
    }

    static void quickSort(int[]t, int i,int j){



    }

    public static void main(String[] args) {

        System.out.println(puiss(2,5));
        System.out.println(puissRapideAux(2,5));

        int[]t = {2,10,4,9,1,6};
        System.out.println(pivot(t,0,5));
        System.out.println(Arrays.toString(t));
    }
}

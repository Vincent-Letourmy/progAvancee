import java.util.Arrays;

public class Correction {

    public static void quickSortAux(int [] t, int i, int j){
        //prérequis 0 <= i,j < t.length (on n'impose pas i<=j car ce prérequis pourrait etre violé qd on fait quickSortAux(t,i,p-1) si p=i
        if(j>i){
            int p = pivoot(t,i,j);
            quickSortAux(t,i,p-1);
            quickSortAux(t,p+1,j);
        }
    }

    public static int pivoot(int[]t, int i, int j){
        int piv = t[j];
        int [] t2 = new int [j-i+1];
        int e1 = 0;
        int e2 = t2.length-1;
        for(int l = i; l < j;l++){
            if(t[l]<=piv){
                t2[e1]=t[l];
                e1++;
            }
            else{
                t2[e2]=t[l];
                e2--;
            }
        }
        //le pivot doit etre en e1==e2
        t2[e1]=piv;
        for(int l = 0; l < t2.length;l++){
            t[i+l]=t2[l];
        }

        return i+e1;
    }

    public static void main(String [] args){

        int []t = {1000,1,4,2,8,9,7,2000};
        quickSortAux(t,0,t.length-1);
        System.out.println(Arrays.toString(t));
        for(int i=0;i<t.length;i++){
            System.out.print(t[i]+" ");
        }


    }
}

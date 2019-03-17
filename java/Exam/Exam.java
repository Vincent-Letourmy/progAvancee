import java.util.Arrays;

public class Exam {


    private static int multiplie(int x, int y){

        if (y == 0) return 0;
        else return x + multiplie(x,y-1);
    }

    private static int compareMots(char[]t1,char[]t2,int i){
        if (t1.length==i) return 0;
        if (t1[i] == t2[i]) return compareMots(t1,t2,i+1);
        else if (t1[i] > t2[i]) return 1;
        else return -1;
    }

    private static int TriBicolorAux(int[] t, int i) {
        if (t.length == i)
            return i;

        int p = TriBicolorAux(t,i+1);

        if (t[i] == 1) {
            t[i] = 0;
            t[p - 1] = 1;
            System.out.println(Arrays.toString(t));
            return p - 1;
        }

        else {
            return p;
        }

    }

    private static int nbMonnaie (int n ,int[]t, int pos){
        if (n < 0) return 0;
        else if (n == 0) return 1;
        else {
            int res = 0;
            for (int i = pos ; i<t.length ; i++){
                res += nbMonnaie(n-t[i],t,pos);
            }
            return res;
        }
    }

    public static void main(String[] args) {
        System.out.println(multiplie(9,9));

        char[]t1 = {'l','i','e','u'};
        char[]t2 = {'l','i','o','n'};
        char[]t3 = {'l','i','o','n'};
        System.out.println(compareMots(t2,t1,0));
        System.out.println(compareMots(t2,t3,0));
        System.out.println(compareMots(t1,t3,0));

        int[]t = {1,0,1,0,1};
        System.out.println(Arrays.toString(t));
        System.out.println(TriBicolorAux(t,0));
        System.out.println(Arrays.toString(t));

        int[]pieces = {1,2,5};
        System.out.println(nbMonnaie(4,pieces,0));
    }
}

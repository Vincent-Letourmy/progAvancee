import java.util.Arrays;

public class Cours {

    public static void main(String[] args) {

        int[] t = {1, 2, 3, 4, 5};
        int[] t2 = {};
        System.out.println(rechercheAux(t2, 4, 0));

        System.out.println(sautPuce(5));

        int[] tab = {5, 2, 4, 1, 3};
        triInserAux(tab, 0);
        System.out.println(Arrays.toString(tab));
    }

    private static boolean rechercheAux(int[] t, int x, int i) {

        if (t.length == i) return false;
        else if (t[i] == x) return true;

        else return rechercheAux(t, x, i + 1);

    }

    private static int sautPuce(int n) {
        if (n == 1) return 1;
        if (n == 0) return 1;
        return sautPuce(n - 1) + sautPuce(n - 2);
    }

   static void triInserAux(int[] t, int i) {
        if (i >= t.length) {
        } else {
            triInserAux(t, i + 1);
            insere(t, i);
        }
    }

    static void insere ( int[] tab, int i){

        int x = tab[i];
        int j = i + 1;
        boolean t = false;

        while (!t && (j < tab.length)) {
            if (tab[j] < x) {
                tab[j - 1] = tab[j];
                j++;
            }
            else {
                t = true;
            }
            tab[j - 1] = x;
        }
    }
}

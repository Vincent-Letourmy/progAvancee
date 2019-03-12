public class Hanoi {

    public static int resoudreAux(int n, int i, int j) {
        if (n > 0) {
            if (n == 1) {
                System.out.println(i + " -> " + j);
                return 1;
            } else {
                int res = 0;
                int k = 6 - i - j;
                res += resoudreAux(n - 1, i, k);
                res += resoudreAux(1, i, j);
                res += resoudreAux(n - 1, k, j);
                return res;
            }
        }
        else{
            return 0;
        }
    }

    public static int resoudre(int n){
        return resoudreAux(n,1,3);
    }

    public static double getUn(int n){
        return Math.pow(2,n)-1;
    }

    public static void main(String[] args) {
        resoudre(0);
        System.out.println(getUn(3));
    }
}

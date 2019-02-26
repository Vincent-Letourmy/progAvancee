public class Hanoi {

    public static void resoudreAux(int n, int i, int j){
        if(n==1){
            System.out.println(i+" -> "+j);
        }
        else{
            int k=6-i-j;
            resoudreAux(n-1,i,k);
            resoudreAux(1,i,j);
            resoudreAux(n-1,k,j);
        }
    }

    public static void resoudre(int n){
        resoudreAux(n,1,3);
    }

    public static void main(String[] args) {
        resoudre(3);
    }
}

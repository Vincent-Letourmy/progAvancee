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

    public static void main(String[] args) {

        System.out.println(puiss(2,5));
        System.out.println(puissRapideAux(2,5));
    }
}

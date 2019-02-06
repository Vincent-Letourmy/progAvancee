package PGCD;

public class PGCD {

    static int PGCD(int a,int b){
        int r=a-b;
        if (r<0){
            r*=-1;
        }
        if (a==b){
            return a;
        }
        else {
            return PGCD(b,r);
        }
    }


}

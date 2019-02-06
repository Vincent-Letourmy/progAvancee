package Exo3.denombrement;

public class Chemin {

    static int chemin(int x,int y){
        if (x==1 || y==1){
            return 1;
        }
        else{
            return chemin(x,y-1)+chemin(x-1,y);
        }
    }

    static int cheminBis(int x){

        return 0;
    }
}

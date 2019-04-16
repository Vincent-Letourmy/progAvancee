package Polynome;

class Polynome{
    private int coeff;
    private int deg
            ; //deg >= 0
    private Polynome suiv;
    //represente le monosme coeff∗x^{deg}
//suiv==null represente le polynome nul
    public Polynome(){
        suiv = null;
    }
    public boolean estVide(){
        return suiv==null;
    }
    public Polynome(Polynome p){
//constructeur par copie en profondeur
        if(p.estVide()){
            suiv=null;
        }
        else{
            coeff = p.coeff;
            deg = p.deg;
            suiv = new Polynome(p.suiv);
        }
    }
}
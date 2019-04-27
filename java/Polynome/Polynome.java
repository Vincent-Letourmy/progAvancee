package Polynome;

class Polynome{

    private int coeff;
    private int deg;
    private Polynome suiv;

    public Polynome(){
        suiv = null;
    }

    private boolean estVide(){
        return suiv==null;
    }

    private Polynome(Polynome p){
        if(p.estVide()){
            suiv=null;
        }
        else{
            coeff = p.coeff;
            deg = p.deg;
            suiv = new Polynome(p.suiv);
        }
    }

    /************************************************ Setters ********************************************************/

    public void setValeurs(int coeff,int deg, Polynome suiv){
        this.coeff = coeff;
        this.deg = deg;
        this.suiv = suiv;
    }

    /************************************************ ToString ********************************************************/

    @Override
    public String toString(){
        String res = "";
        if (deg!=0){
            if (coeff != 1) {
                res += coeff;
            }
            if (deg!=1) res += "(x^"+deg+")";
            else res += "x";
        }
        else res += coeff;
        if (!suiv.estVide()) res += " + " + suiv.toString();
        return res;
    }

    /************************************************ Méthodes ********************************************************/

    double eval (int x){
        if (estVide()) return 0;
        double res = coeff * Math.pow(x,deg);
        return res + suiv.eval(x);
    }

    int degre(){
        if (suiv.estVide()) return deg;
        return Math.max(deg,suiv.degre());
    }

    Polynome simplifie(){
        Polynome aux = new Polynome();
        if (estVide()) return aux;
        else {
            if (coeff!=0) {
                aux.coeff = coeff;
                aux.deg = deg;
                aux.suiv = suiv.simplifie();
            }
            else aux = suiv.simplifie();
        }
        return aux;
    }

    Polynome deriver(){
        Polynome aux = new Polynome();
        if (estVide()) return aux;
        else {
            if (deg == 0) {
                aux.coeff = 0;
                aux.deg = 0;
            } else {
                aux.coeff = coeff * deg;
                aux.deg = deg - 1;
            }
            aux.suiv = suiv.deriver();
        }
        return aux;
    }

    private boolean memedegre(int deg){
        if (suiv.estVide()) return deg == this.deg;
        return deg == this.deg || suiv.memedegre(deg);
    }

    private Polynome getMemeDegree(int deg){
        if (deg == this.deg) return this;
        else return suiv.getMemeDegree(deg);
    }

    Polynome reduire(){
        Polynome aux = new Polynome();
        if (estVide()) return aux;
        else {
            Polynome aux2;
            aux2 = suiv.reduire();
            if (!suiv.estVide() && aux2.memedegre(deg)) {
                Polynome memeDegre = aux2.getMemeDegree(deg);
                memeDegre.coeff = coeff + memeDegre.coeff;
                return aux2;
            } else {
                aux.coeff = coeff;
                aux.deg = deg;
                aux.suiv = suiv.reduire();
            }
        }
        return aux;
    }

    Polynome ajouter(Polynome p){
        Polynome aux = new Polynome();
        aux.coeff = coeff;
        aux.deg = deg;
        if (suiv.estVide()) aux.suiv = new Polynome(p);
        else aux.suiv = suiv.ajouter(p);
        return aux;
    }

    Polynome multiplierAux(Polynome p){
        Polynome aux = new Polynome();
        if (estVide()) return aux;
        else {
            aux.coeff = coeff * p.coeff;
            aux.deg = deg + p.deg;
            aux.suiv = suiv.multiplierAux(p);
        }
        return aux;
    }

    Polynome multiplier(Polynome p){
        Polynome aux = new Polynome();
        if (p.estVide()) return aux;
        else aux = multiplierAux(p).ajouter(multiplier(p.suiv));
        return aux;
    }
}
class Liste{

    private int val;
    private Liste suiv;

    public Liste(){
        suiv = null;
    }

    public boolean estVide(){
        return suiv==null;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setSuiv(Liste suiv) {
        this.suiv = suiv;
    }

    int longueur(){
        if(this.estVide())
            return 0;
        else
            return (suiv.longueur() + 1);
    }

    boolean recherche(int x){
        if (this.estVide()){
            return false;
        }
        if (this.val == x){
            return true;
        }
        else{
            return suiv.recherche(x);
        }
    }

    boolean croissant(){
        if (this.estVide()){
            return true;
        }
        if (suiv.estVide()){
                return true;
        }
        else{
            if (this.val <= suiv.val){
                return suiv.croissant();
            }
            else{
                return false;
            }
        }
    }

    public void ajoutTete(int x){
        Liste aux = new Liste();
        aux.val = val;
        aux.suiv = suiv;
        this.val = x;
        this.suiv = aux;
    }

    public void supprimeTete(){
                                        /** sur liste non vide */
        this.val = suiv.val;
        this.suiv = this.suiv.suiv;
    }

    void ajoutFin(int x){
        if (this.estVide()){
            ajoutTete(x);
        }
        else suiv.ajoutFin(x);
    }

    public String toString(){
        String res ="";
        if(this.estVide()){
            return res;
        }
        else {
            res = " " + this.val;
            return res + suiv.toString();
        }
    }
}
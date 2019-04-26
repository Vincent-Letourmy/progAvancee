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

    void concat(Liste l){
        if (this.suiv.estVide()){
            setSuiv(l);
        }
        else suiv.concat(l);
    }

    Liste copie (){
        Liste res = new Liste();
        if (this.estVide()){
            return res;
        }
        res = suiv.copie();
        Liste res2 = new Liste();
        res2.setVal(val);
        res2.setSuiv(res);
        return res2;
    }

    int get(int i){
        if (i == 0){
            return val;
        }
        else{
            return suiv.get(i - 1);
        }
    }

    Liste ajoutFin2(int x){

        if (this.estVide()){
            Liste aux = new Liste();
            aux.ajoutTete(x);
            return aux;
        }
        Liste res = suiv.ajoutFin2(x);

        Liste res2 = new Liste();
        res2.setVal(val);
        res2.setSuiv(res);
        return res2;
    }

    Liste fusion(Liste l){
        Liste courant = new Liste();
        if (estVide() && l.estVide()) return courant;
        else if (estVide()){
            courant.val = l.val;
            courant.suiv = fusion(l.suiv);
            return courant;
        }
        else if (l.estVide()){
            courant.val = val;
            courant.suiv = suiv.fusion(l);
            return courant;
        }
        else if (Math.min(val,l.val) == val){
            courant.val = val;
            courant.suiv = suiv.fusion(l);
            return courant;
        }
        else{
            courant.val = l.val;
            courant.suiv = fusion(l.suiv);
            return courant;
        }
    }

    void insereDansTriee(int x){
        if (estVide()){
            ajoutTete(x);
        }
        else{
            if (x < val) ajoutTete(x);
            else suiv.insereDansTriee(x);
        }
    }

    boolean sommeSup(int x) {
        if (suiv.estVide()) {
            return x - val < 0;
        }
        else {
            return suiv.sommeSup(x - val);
        }
    }

    public Liste fusionneOccsConsec(){
        Liste aux = new Liste();
        if (estVide()) return aux;
        else  {
            if (val == suiv.val){
                aux = suiv.fusionneOccsConsec();
                return aux;
            }
            else {
                aux.val = val;
                aux.suiv = suiv.fusionneOccsConsec();
                return aux;
            }
        }
    }

}
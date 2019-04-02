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
            return 1;
        else
            return (suiv.longueur() + 1);
    }
}
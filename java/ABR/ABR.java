package ABR;

public class ABR {
    private int valeur;
    private ABR arbreDroite;
    private ABR arbreGauche;

    /***************************************** Constructeur ****************************************/

    ABR (){
        arbreDroite = null;
        arbreGauche = null;
    }

    ABR (int valeur, ABR arbreGauche, ABR arbreDroite){
        this.valeur = valeur;
        this.arbreDroite = arbreDroite;
        this.arbreGauche = arbreGauche;
    }

    /***************************************** toString ****************************************/

    @Override
    public String toString (){
        return toStringAux("- ");
    }

    private String toStringAux (String s){
        if (this.estVide()) return "";
        else {
            return arbreDroite . toStringAux (s + "   ") + s + valeur + "\n" + arbreGauche . toStringAux (s + "   ");
        }
    }

    /***************************************** Méthodes ****************************************/

    boolean estVide(){
        return (arbreGauche == null);
    }

    boolean recherche(int x){
        if (estVide()) return false;
        else if (valeur == x) return true;
        else if (valeur < x) return arbreDroite.recherche(x);
        else return arbreGauche.recherche(x);
    }

    String toStringTrie() {
        String res = "";
        if (estVide())
            res += "";
        else{
            res += "" + arbreGauche.toStringTrie();
            res += "" + valeur + ",";
            res += "" + arbreDroite.toStringTrie();
        }
        return res;
    }

    void insert(int x){
        if (estVide()) {
            valeur = x;
            arbreDroite = new ABR();
            arbreGauche = new ABR();
        }
        else if ( x <= valeur) arbreGauche.insert(x);
        else arbreDroite.insert(x);
    }

    void insertTabInt(int[]tab){
        for (int value : tab)
            insert(value);
    }

    void insertTabString(String[]tab){
        for (String value : tab)
            insert(Integer.parseInt(value));
    }

    void suppr(int x){
        if (estVide());
        else if (x < valeur) arbreGauche.suppr(x);
        else if (x > valeur) arbreDroite.suppr(x);
        else{
            if (!arbreGauche.estVide()) {
                ABR aux = arbreGauche;
                valeur = arbreDroite.valeur;
                arbreGauche = arbreDroite.arbreGauche;
                arbreDroite = arbreDroite.arbreDroite;
                insertTabString(aux.toStringTrie().split(","));
            }
            else {
                valeur = arbreDroite.valeur;
                arbreGauche = arbreDroite.arbreGauche;
                arbreDroite = arbreDroite.arbreDroite;
            }
        }
    }
}

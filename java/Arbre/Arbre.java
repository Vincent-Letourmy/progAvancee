package Arbre;

public class Arbre {

    private int valeur;
    private Arbre arbreDroite;
    private Arbre arbreGauche;

    /***************************************** Constructeur ****************************************/

    Arbre (){
        arbreDroite = null;
        arbreGauche = null;
    }

    Arbre (int valeur, Arbre arbreDroite, Arbre arbreGauche){
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

    boolean estUneFeuille(){
        return (arbreDroite.estVide() && arbreGauche.estVide());
    }

    int nbNoeuds(){
        if (this.estVide()) return 0;
        else return 1 + arbreDroite.nbNoeuds() + arbreGauche.nbNoeuds();
    }

    int nbFeuilles(){
        if (estVide()) return 0;
        else if (arbreGauche.estVide() && arbreDroite.estVide()) return 1;
        else return arbreGauche.nbFeuilles() + arbreDroite.nbFeuilles();
    }

    boolean recherche (int x){
        if(this.estVide())return false;
        else {
            if(this.valeur == x) return true;
            else return arbreDroite.recherche(x) || arbreGauche.recherche(x);
        }
    }

    boolean pereFilsEgaux(){
        if(estVide()) return false;
        else {
            if (valeur == arbreDroite.valeur && !arbreDroite.estVide() || valeur == arbreGauche.valeur && !arbreGauche.estVide()) return true;
            else return arbreGauche.pereFilsEgaux() || arbreDroite.pereFilsEgaux();
        }
    }

    Arbre symetrise(){
        if (estVide()) return new Arbre();
        else if (estUneFeuille()){
            return new Arbre(valeur,new Arbre(),new Arbre());
        }
        else{
            Arbre aux1 = arbreDroite.symetrise();
            Arbre aux2 = arbreGauche.symetrise();
            return new Arbre(valeur, aux2, aux1);
        }
    }

    int meilleurChemin(){
        if (estVide()) return 0;
        else return 0;
    }

}

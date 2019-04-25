package Arbre;

public class MainArbre {

    public static void main(String[] args) {
        Arbre Avide = new Arbre();
        Arbre A1 = new Arbre(1, Avide,Avide);
        Arbre A11 = new Arbre(11, Avide,Avide);
        Arbre A2 = new Arbre(2, A1,A11);
        Arbre A22 = new Arbre(6,Avide,Avide);
        Arbre A23 = new Arbre(4,Avide,Avide);
        Arbre A21 = new Arbre(7,A22,A23);
        Arbre A3 = new Arbre(3,A2,A21);

        //Arbre Sym = A3.symetrise();

        System.out.println(A3);
        System.out.println(A3.chercheNoeudInterne(7));

    }
}

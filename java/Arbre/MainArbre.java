package Arbre;

public class MainArbre {

    public static void main(String[] args) {
        Arbre Avide = new Arbre();
        Arbre A1 = new Arbre(1, Avide,Avide);
        Arbre A11 = new Arbre(11, Avide,Avide);
        Arbre A2 = new Arbre(2, A1,A11);
        Arbre A3 = new Arbre(3,A2,Avide);

        //Arbre Sym = A3.symetrise();

        System.out.println(A3.pereFilsEgaux());
        //System.out.println(Sym);

    }
}

package ABR;

public class MainABR {

    public static void main(String[] args) {


        ABR aVide1 = new ABR();
        ABR aVide2 = new ABR();

        ABR arbre = new ABR(18, aVide1, aVide2);

        int[]tab = {24,38,28,6,22,7,17,21,4,12,15,1};
        arbre.insertTabInt(tab);

        System.out.println(arbre);
        arbre.suppr(12);
        System.out.println(arbre);
        System.out.println(arbre.valeurMaxABR());

    }

}

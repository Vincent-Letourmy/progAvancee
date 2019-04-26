import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Liste l1 = new Liste();
        Liste l2 = new Liste();
        Liste l3 = new Liste();
        Liste Def = new Liste();
        Liste Def2 = new Liste();

        l1.setVal(2);
        l2.setVal(5);
        l3.setVal(9);

        l1.setSuiv(l2);
        l2.setSuiv(l3);
        l3.setSuiv(Def);

        Liste lbis = new Liste();
        Liste lbis2 = new Liste();

        lbis.setVal(4);
        lbis2.setVal(7);

        lbis.setSuiv(lbis2);
        lbis2.setSuiv(Def2);

        l1.insereDansTriee(5);

        System.out.println(l1);
        System.out.println(l1.fusionneOccsConsec());

        //System.out.println(l1.longueur());
        //System.out.println(l1.recherche(3));
        //System.out.println(Def.croissant());


    }
}

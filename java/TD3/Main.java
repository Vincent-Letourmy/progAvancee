public class Main {

    public static void main(String[] args) {
        Liste l1 = new Liste();
        Liste l2 = new Liste();
        Liste l3 = new Liste();
        Liste Def = new Liste();

        l1.setVal(2);
        l2.setVal(5);
        l3.setVal(9);

        l1.setSuiv(l2);
        l2.setSuiv(l3);
        l3.setSuiv(Def);

        Liste lbis = new Liste();
        Liste lbis2 = new Liste();

        lbis.setVal(12);
        lbis2.setVal(15);

        lbis.setSuiv(lbis2);
        lbis2.setSuiv(Def);

        Liste copie = l1.ajoutFin2(65);
        l1.setVal(25);
        System.out.println(l1);
        System.out.println(copie);

        //System.out.println(l1.longueur());
        //System.out.println(l1.recherche(3));
        //System.out.println(Def.croissant());


    }
}

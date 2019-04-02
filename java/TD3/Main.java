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

        Def.ajoutTete(6);
        Def.ajoutTete(5);
        Def.ajoutTete(7);
        Def.ajoutFin(9);
        Def.ajoutTete(4);

        System.out.println(Def.longueur());
        System.out.println(Def);

        //System.out.println(l1.longueur());
        //System.out.println(l1.recherche(3));
        //System.out.println(Def.croissant());


    }
}

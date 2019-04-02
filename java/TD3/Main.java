public class Main {

    public static void main(String[] args) {
        Liste l1 = new Liste();
        Liste l2 = new Liste();
        Liste l3 = new Liste();

        l1.setVal(1);
        l2.setVal(2);
        l3.setVal(3);

        l1.setSuiv(l2);
        l2.setSuiv(l3);

        System.out.println(l1.longueur());

    }
}

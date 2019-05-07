package ABR;

public class MainABR {

    public static void main(String[] args) {


        ABR Avide = new ABR();
        ABR Avide2 = new ABR();
        ABR Avide3 = new ABR();
        ABR Avide4 = new ABR();
        ABR Avide5 = new ABR();
        ABR Avide6 = new ABR();
        ABR Avide7 = new ABR();
        ABR Avide8 = new ABR();
        ABR Avide9 = new ABR();
        ABR A1 = new ABR(1, Avide, Avide);
        ABR A22 = new ABR(66, Avide, Avide);
        ABR A23 = new ABR(44, Avide, Avide);

        /*ABR A2 = new ABR(3, Avide2, Avide3);
        ABR A11 = new ABR(9, Avide5, Avide6);
        ABR A21 = new ABR(11, A11, Avide4);*/
        ABR A3 = new ABR(18, Avide8, Avide9);

        int[]tab = {24,1,28,6,22,7,17,21,4,12,15,38};
        A3.insertTabInt(tab);

        System.out.println(A3);
        A3.suppr(24);
        System.out.println(A3);

    }

}

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
        ABR A11 = new ABR(9, Avide5, Avide6);
        ABR A2 = new ABR(3, Avide2, Avide3);
        ABR A22 = new ABR(66, Avide, Avide);
        ABR A23 = new ABR(44, Avide, Avide);
        ABR A21 = new ABR(11, A11, Avide4);
        ABR A3 = new ABR(5, A2, A21);

        System.out.println(A3);
        System.out.println(A3.recherche(9));
        System.out.println(A3.toStringTrie());
        A3.insert(5);
        System.out.println(A3);

    }
}

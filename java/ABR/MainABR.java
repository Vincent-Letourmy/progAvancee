package ABR;


public class MainABR {

    public static void main(String[] args) {


        ABR Avide = new ABR();
        ABR A1 = new ABR(1, Avide, Avide);
        ABR A11 = new ABR(9, Avide, Avide);
        ABR A2 = new ABR(3, Avide, Avide);
        ABR A22 = new ABR(66, Avide, Avide);
        ABR A23 = new ABR(44, Avide, Avide);
        ABR A21 = new ABR(11, A11, Avide);
        ABR A3 = new ABR(5, A2, A21);

        System.out.println(A3);
        System.out.println(A3.recherche(9));

    }
}

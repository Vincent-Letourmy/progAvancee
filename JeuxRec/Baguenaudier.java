public class Baguenaudier {


    public static void remplir (int n) {
        if (n > 0) {
            if (n == 1) {
                System.out.println("+ Case 1");
            } else {
                remplir(n - 1);
                vider(-2);
                remplir(1);
            }
        }
    }

    public static void vider (int n) {
        if (n > 0) {
            if (n == 1) {
                System.out.println("- Case 1");
            }
        }
    }
}

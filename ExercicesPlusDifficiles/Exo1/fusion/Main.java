package Exo1.fusion;

public class Main {

    public static void main(String[] args) {

        int[]t1={1,3,3,5,6,15,16};
        int[]t2={1,4,7,7,80};
        int[]tRes=Fusion.fusionTabTries(t1,t2);

        Fusion.afficheTab(tRes);
    }
}

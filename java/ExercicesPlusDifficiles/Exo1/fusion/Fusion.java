package Exo1.fusion;

public class Fusion {

    static int[] fusionTabTries(int[] t1, int[] t2) {
        int[] tabRes = new int[t1.length + t2.length];
        fusionTabTriesAux(t1, 0, t2, 0, tabRes, 0);
        return tabRes;
    }

    static void fusionTabTriesAux(int[] t1, int i1, int[] t2, int i2, int[] tabRes, int iRes) {
        if (iRes < tabRes.length -1) {
            {
                if (i1>t1.length-1) {
                    tabRes[iRes] = t2[i2];
                    iRes++;
                    i2++;
                }
                else if (i2>t2.length-1 || t1[i1] <= t2[i2]) {
                    tabRes[iRes] = t1[i1];
                    iRes++;
                    i1++;
                }
                else if (t2[i2] < t1[i1]) {
                    tabRes[iRes] = t2[i2];
                    iRes++;
                    i2++;
                }
                fusionTabTriesAux(t1, i1, t2, i2, tabRes, iRes);
            }
        }
        if(t1[t1.length-1]<t2[t2.length-1]){
            tabRes[tabRes.length-1]=t2[t2.length-1];
        }
        else{
            tabRes[tabRes.length-1]=t1[t1.length-1];
        }
    }

    static void afficheTab(int[]t){
        for (int i=0;i<t.length;i++){
            System.out.print(t[i]+", ");
        }
        System.out.println();
    }
}


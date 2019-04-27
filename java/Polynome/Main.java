package Polynome;

import javax.swing.*;
import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        Polynome polynome = new Polynome();
        Polynome p2 = new Polynome();
        Polynome p3 = new Polynome();
        Polynome p4 = new Polynome();
        Polynome pVide = new Polynome();

        Polynome polynomeBis = new Polynome();
        Polynome pBis2 = new Polynome();
        Polynome pBis3 = new Polynome();
        Polynome pBisVide = new Polynome();

        polynome.setValeurs(2,2,p2);
        p2.setValeurs(3,1,pVide);
        //p3.setValeurs(1,1,p4);
        //p4.setValeurs(1,2,pVide);

        polynomeBis.setValeurs(3,1,pBis2);
        pBis2.setValeurs(2,0,pBisVide);
        //pBis3.setValeurs(2,1,pBisVide);

        System.out.println(polynome);
        System.out.println(polynomeBis);

        Polynome multiplication = polynome.multiplier(polynomeBis);
        System.out.println(multiplication);



    }
}

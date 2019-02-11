package Exo3.denombrement;

import java.util.Scanner;

public class Main {

    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(Chemin.cheminThibault(n));
        //System.out.println(Chemin.chemin(n,n));

    }
}

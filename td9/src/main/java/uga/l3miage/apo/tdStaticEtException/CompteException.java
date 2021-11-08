package uga.l3miage.apo.tdStaticEtException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CompteException {
    static int appelsMethodesClasse;
           int appelsMethodesInstance;
    private int[] tab;

    public void setTable(String[] stringTab) {
        appelsMethodesClasse++;
        appelsMethodesInstance++;

        tab = new int[stringTab.length];
        for (int i = 0; i < stringTab.length; i++) {
            tab[i] = Integer.parseInt(stringTab[i]);
        }
    }

    public int readInt() {
        appelsMethodesClasse++;
        appelsMethodesInstance++;
        System.out.print("Veuillez entrer un entier: ");
        int i = 0;
        boolean inputOK = false;
        while (!inputOK) {
            try {
                Scanner scan = new Scanner(System.in);
                i = scan.nextInt();
                inputOK = true;
            } catch(InputMismatchException e) {
                System.err.println("ça n'est pas un bon format de nombre !!!");
            }
        }
        return i; 
    }

    public void setTable(int n) {
        appelsMethodesClasse++;
        appelsMethodesInstance++;

        tab = new int[n];
        for (int i = 0; i < n; i++) {
            tab[i] = readInt();
        }
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < tab.length; i++) {
            str += tab[i];
            if (i < tab.length - 1) {
                str += ", ";
            }
        }
        str += "]";
        return str;
    }
}
package org.example;

import org.example.Village;

public class MainVillage {

    public static void main (String[] argv) {
        Village v1;
        String[] nomsSchtroumpfs = {
                "Grand Schtroumpf", "Schtroumpf courant (et pas ordinaire)", "Schtroumpf ordinaire (et pas courant)", "Schtroumpf moralisateur � lunettes",
                "Schtroumpf boudeur", "Schtroumpf volant", "Schtroumpf �tonn�", "Schtroumpf acrobate", "Schtroumpf paresseux"
        };
        v1 = new Village("Le village",100,nomsSchtroumpfs);
        v1.solstice_d_ete();
        System.out.println("Le chef du village se pr�sente: " + v1.chefDuVillage().toString());
        v1.envoyer_travail();
        v1.schtroumpsfHeureux();
        v1.getTabS()[1].recolterSalsepareille();
        v1.getTabS()[3].recolterSalsepareille();
        v1.solstice_d_ete();
        v1.dinerTousEnsemble();
        v1.solstice_d_ete();
    }

}

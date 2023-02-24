package org.example;

public class MainSchtroumpf {

    public static void main (String[] argv) {
        Schtroumpf S1 = new Schtroumpf("Grognon",135);
        S1.sePresenter();
        S1.chanter();
        S1.allerTravailler();
        S1.sePresenter();
        S1.chanter();
        S1.manger(10);
        S1.sePresenter();
        S1.chanter();
        S1.anniversaire();
        S1.sePresenter();
        S1.chanter();
    }

}
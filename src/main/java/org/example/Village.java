package org.example;

public class Village {

    private String nom;
    private	Schtroumpf[] tabS;
    private int nbSch;
    public int Stock;

    public Village (String pfNomV, int pfStockSalsepareille, String[] pfNomsDesSchtroumpfs) {
        int i = 0;
        this.Stock = pfStockSalsepareille;
        this.nom = pfNomV;
        this.tabS = new Schtroumpf[100];
        while(i<pfNomsDesSchtroumpfs.length && i<100) {
            tabS[i] = creerSch(pfNomsDesSchtroumpfs[i]);
            i++;
            if(i==100) {
                System.out.println("Le village est plein");
            }
        }
        this.nbSch = i;
    }

    private Schtroumpf creerSch(String pfNomSch) {
        int age = (int)(Math.random() * ( 150));
        Schtroumpf sch = new Schtroumpf(pfNomSch,age,this);
        return sch;
    }

    public String getNom() {
        return this.nom;
    }

    public int getNbSch() {
        return this.nbSch;
    }

    public int getStockSals() {
        return this.Stock;
    }

    public Schtroumpf[] getTabS() {
        return this.tabS;
    }

    public void solstice_d_ete() {
        int i = 0;
        if(getNbSch()!=0) {
            System.out.println("Dans le village " + getNom() + " il y � " + getNbSch() + " Schtroumpfs pr�sents lors de la f�te");
            while(getTabS()[i] != null) {
                getTabS()[i].sePresenter();
                getTabS()[i].chanter();
                i++;
            }
            System.out.println("Il y avait " + nbContent() + " Schtroumpfs contents � la f�te");
        }
    }

    private int nbContent() {
        int nb = 0;
        for(int i = 0;i < this.nbSch;i++) {
            if(this.tabS[i].isContent()) {
                nb++;
            }
        }
        return nb;
    }

    public Schtroumpf chefDuVillage() {
        Schtroumpf max;
        max = new Schtroumpf("t",0);
        for(int i = 0; i < this.nbSch ; i++) {
            if(this.tabS[i].getAge()> max.getAge()) {
                max = tabS[i];
            }
        }
        return max;
    }

    public void envoyer_travail() {
        for(int i = 1 ; i < this.tabS.length;i= i +2) {
            if(tabS[i]!= null) {
                this.tabS[i].allerTravailler();
            }
        }
    }

    public void schtroumpsfHeureux () {
        for(int i = 0; i < this.tabS.length;i++) {
            if(tabS[i]!= null) {
                if(this.tabS[i].isContent()) {
                    tabS[i].chanter();
                }
            }
        }
    }

    public void dinerTousEnsemble() {
        for(int i = 0 ; i< this.nbSch;i++) {
            this.tabS[i].dinerAuVillage();
        }
    }

    public void envoyerCueillirSalsepareille() {
        for(int i = 1 ; i < this.tabS.length;i= i +2) {
            if(tabS[i]!= null) {
                this.tabS[i].recolterSalsepareille();
            }
        }
    }
}

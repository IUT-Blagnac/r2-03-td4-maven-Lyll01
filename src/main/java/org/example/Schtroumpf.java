package org.example;

public class Schtroumpf {
    private String nom;
    private int age;
    private boolean content;
    private Village v;

    public Schtroumpf(String pfNom , int pfAge,Village pfVillage){
        this.nom = pfNom;
        this.age = pfAge;
        this.content = true;
        this.v = pfVillage;
    }

    public Schtroumpf(String pfNom , int pfAge){
        this.nom = pfNom;
        this.age = pfAge;
        this.content = true;
        this.v = null;
    }

    public Schtroumpf(){
        this.nom = "";
        this.age = 0;
        this.content = true;
    }

    public String getNom() {
        return nom;
    }

    public boolean isContent() {
        return content;
    }

    public int getAge() {
        return age;
    }

    public String toString(){
        String chaine = "";
        chaine+= "Bonjour je suis " + this.getNom() + " j'ai " + this.getAge();
        if (this.isContent()){
            chaine+=" je suis content";
        }
        else {
            chaine += " je suis pas content";
        }
        return chaine;
    }

    public void sePresenter(){
        String content = "content";
        if(!this.isContent()){
            content = "pas content";
        }
        if(this.v != null) {
            System.out.println("Bonjour je suis "+ this.getNom() + " j'ai " + this.getAge() + " ans et je suis " + content + "et j'habite dans le village: " + this.v.getNom());
        }
        else {
            System.out.println("Bonjour je suis "+ this.getNom() + " j'ai " + this.getAge() + " ans et je suis " + content +"et je suis ermite");
        }
    }

    public String leChant(){
        if(this.isContent()){
            return "la, la, la Schtroumpf la, la";
        }
        return "gloups";
    }

    public void chanter(){
        String chant = "la, la, la Schtroumpf la, la";
        if(!this.isContent()){
            chant = "gloups";
        }
        System.out.println(chant);
    }

    public void anniversaire(){
        this.age += 1;
    }

    public void manger(int pfQte){
        if(pfQte > 0) {
            this.content = true;
        }
    }

    public void allerTravailler(){
        this.content = false;
    }

    public Village getVillage() {
        return this.v;
    }

    public void setVillage(Village pfV) {
        this.v = pfV;
    }

    public void recolterSalsepareille() {
        if(this.v != null) {
            this.v.Stock +=5;
            this.content = false;
        }
    }

    public void  dinerAuVillage() {
        if(this.v.Stock >= 3) {
            this.v.Stock -=3;
            if(this.content == false) {
                this.content = true;
            }
        }
        else {
            this.content = false;
        }
    }
}


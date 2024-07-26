package com.eufhapi.eufhapi.Classes;

public class GesetzlicheKrankenkasse extends Krankenkasse{
    
    //Eigenschaften
    private boolean istBKK;
    private Adresse Adresse;

    //Hinzuzufügen ist die Eigenschaft Adresse als Eigenschaft, im Konstruktor, in der toString Methode und in den Getter und Setter Methoden
    //Zusätzlich müssen die Daten in der Klasse Arztpraxis.java angepasst werden (Zeile 12 & 26)

    //Konstruktor
    public GesetzlicheKrankenkasse(String _name, boolean _istBKK,Adresse _Adresse) {
        super(_name);
        setIstBKK(_istBKK);
        setAdresse(_Adresse);
    }

    //Getter and Setter 
    public void setIstBKK(boolean _istBKK) {
        this.istBKK = _istBKK;
    }   

    public boolean getIstBKK() {
        return this.istBKK;
    }   
    

    //Getter and Setter 
    public void setAdresse (Adresse _Adresse) {
        this.Adresse = _Adresse;
    }   

    public Adresse getAdresse() {
        return this.Adresse;
    }   

    public String toString() {
        return " Krankenkassenname: " + super.getName() + " Ist Betrieblich:" + getIstBKK() +
         " Adresse: " + super.getName() + " HAllooooo"  + getAdresse ();
    }   

      
}
 
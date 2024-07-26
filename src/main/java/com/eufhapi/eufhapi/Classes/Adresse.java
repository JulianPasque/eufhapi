package com.eufhapi.eufhapi.Classes;

public class Adresse {
    //Eigenschaften
    private String strasse;
    private String hausnummer;
    private String postleitzahl;
    private String stadt;

    //Getter & Setter
    // Getter & Setter Straße 
    public void setStrasse (String _strasse)
    {           
        this.strasse = _strasse;
    }
    public String getStrasse(){
        return this.strasse;
    }
    // Getter & Setter Hausnummer
    public void setHausnummer(String _hausnummer)
    {           
        this.hausnummer = _hausnummer;
    }

    public String getHausnummer(){
        return this.hausnummer;
    }
    // Getter & Setter Postleitzahl
    public void setPostleitzahl(String _postleitzahl)
    {           
        this.postleitzahl = _postleitzahl;
    }

    public String getPostleitzahl(){
        return this.postleitzahl;
    }
     // Getter & Setter Stadt
     public void setStadt(String _stadt)
     {           
         this.stadt = _stadt;
     }
 
     public String getStadt(){
         return this.stadt;
     }
     

    // Konstruktor
    public Adresse(String _strasse, String _hausnummer, String _postleitzahl, String _stadt) 
    {
        setStrasse (_strasse) ;
        setHausnummer (_hausnummer) ;
        setPostleitzahl(_postleitzahl);
        setStadt (_stadt);
    }


    // Methode zum Anzeigen der Patientendaten
    public String toString() {
        return strasse + " " + hausnummer + ", " + getPostleitzahl() + " " + stadt;
    }
}

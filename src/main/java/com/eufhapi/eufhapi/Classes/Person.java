package com.eufhapi.eufhapi.Classes;

public class Person {
    //Eigenschaften
    private String vorname;
    private String nachname;
    private String geschlecht;
    private String alter; 
    private Adresse adresse;
    private String telefonnummer;

    //Setter and Getter
    // Setter and Getter for Vorname
    public void setVorname (String _vorname)
    {           
        this.vorname = _vorname;
    }
    public String getVorname(){
        return this.vorname;
    }
    // Setter and Getter for Nachname
    public void setNachname (String _nachname)
      {           
          this.nachname = _nachname;
      }
    public String getNachname(){
          return this.nachname;
      }
    //Setter and Getter for Geschlecht 
    public void setGeschlecht (String _geschlecht)
      {           
          this.geschlecht = _geschlecht;
      }
    public String getGeschlecht(){
          return this.geschlecht;
      }
    //Setter and Getter for Alter
    public void setAlter(String _alter)
       {           
           this.alter = _alter;
       }
    public String getAlter(){
           return this.alter;
       }

    //Setter and Getter for Adresse

    public void setAdresse (Adresse _Adresse) {
        this.adresse = _Adresse;
    }   

    public Adresse getAdresse() {
        return this.adresse;
    }  

    // Konstruktor
    public Person(String _vorname, String _nachname, String _geschlecht, String _alter, String _strasse, String _hausnummer, String _postleitzahl, String _stadt) 
    {
        setVorname (_vorname) ;
        setNachname (_nachname) ;
        setGeschlecht (_geschlecht) ;
        setAlter (_alter)  ;
        this.adresse = new Adresse(_strasse, _hausnummer, _postleitzahl, _stadt);    
    }

    // Methode zum Anzeigen der Patientendaten
    public String toString() {
        return vorname + " " +
            getNachname () + ", " +
            getGeschlecht () + " " +
            getAlter () + " " +
            adresse.getStrasse () + " " +
            adresse.getHausnummer () + ", " +
            adresse.getPostleitzahl() + " " + 
            adresse.getStadt () +" " ;
    }
}


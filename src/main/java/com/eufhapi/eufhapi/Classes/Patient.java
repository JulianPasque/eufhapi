package com.eufhapi.eufhapi.Classes;

public class Patient extends Person implements Comparable<Patient>  {
    //Eigenschaften
 
    private String symptome;
    private Krankenkasse krankenkasse;


    // Konstruktor
    public Patient(String _vorname, String _nachname, String _geschlecht, String _alter, String _strasse, String _hausnummer, String _postleitzahl, String _stadt, String _symptome) 
    {
        super(
            _vorname,
            _nachname,
            _geschlecht,
            _alter,
            _strasse,
            _hausnummer,
            _postleitzahl,
            _stadt
            );
            
        setSymptome(_symptome);
    }

    public Patient(String _vorname, String _nachname, String _geschlecht, String _alter, String _strasse, String _hausnummer, String _postleitzahl, String _stadt, String _symptome, Krankenkasse _krankenkasse) 
    {
        super(
            _vorname,
            _nachname,
            _geschlecht,
            _alter,
            _strasse,
            _hausnummer,
            _postleitzahl,
            _stadt
            );
            
        setSymptome(_symptome);
        setKrankenkasse(_krankenkasse);
    }

    public Patient(Person _Person, String _symptome) 
    {
        super(_Person.getVorname(), 
            _Person.getNachname(), 
            _Person.getGeschlecht(),
            _Person.getAlter(), 
            _Person.getAdresse().getStrasse(), 
            _Person.getAdresse().getHausnummer(), 
            _Person.getAdresse().getPostleitzahl(), 
            _Person.getAdresse().getStadt());
        setSymptome(_symptome);
    }

    //Setter and Getter for symptome 
    public void setSymptome (String _symptome)
    {           
        this.symptome = _symptome;
    }

    public String getSymptome(){
        return this.symptome;
    }

    //Setter and Getter for Krankenkasse
    public void setKrankenkasse(Krankenkasse _krankenkasse) {
        this.krankenkasse = _krankenkasse;
    }
    
    public Krankenkasse getKrankenkasse() {
        return this.krankenkasse;
    }

    //Setter and Getter for Adresse

    public void setAdresse (Adresse _Adresse) {
        super.setAdresse(_Adresse);
    }   

    public Adresse getAdresse() {
        return super.getAdresse();
    }  

    // Methode zum Anzeigen der Patientendaten
    public String toString() {

        if(krankenkasse == null)
            return getVorname() + " " +
                getNachname() + ", " +
                getGeschlecht() + " " +
                getAdresse().getStrasse() + " " +
                getAdresse().getHausnummer() + ", " +
                getAdresse().getPostleitzahl() + " " +
                getAdresse().getStadt() + 
                ", Symptome: " + getSymptome();
        else
            return getVorname() + " " +
                getNachname() + ", " +
                getGeschlecht() + " " +
                getAdresse().getStrasse() + " " +
                getAdresse().getHausnummer() + ", " +
                getAdresse().getPostleitzahl() + " " +
                getAdresse().getStadt() + 
                ", Symptome: " + getSymptome() +
                ", Krankenkasse: " + krankenkasse.getName();
    }

        // compareTo Methode
        @Override
        public int compareTo(Patient andererPatient) {
            return this.getNachname().compareTo(andererPatient.getNachname());
        }
}
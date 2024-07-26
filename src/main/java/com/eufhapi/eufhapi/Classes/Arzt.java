package com.eufhapi.eufhapi.Classes;

public class Arzt extends Person implements Comparable<Arzt> {

    //Eigenschaften
    String fachbereich;

    // Konstruktor
    public Arzt(String _vorname, String _nachname, String _geschlecht, String _alter, String _strasse, String _hausnummer, String _postleitzahl, String _stadt, String _fachbereich)
    {
        super(_vorname, _nachname, _geschlecht, _alter, _strasse, _hausnummer, _postleitzahl, _stadt);
        this.fachbereich = _fachbereich;
    }

    public Arzt(Person  _Person, String _fachbereich)
    {
        super(
            _Person.getVorname(),
            _Person.getNachname(),
            _Person.getGeschlecht(),
            _Person.getAlter(), 
            _Person.getAdresse().getStrasse(), 
            _Person.getAdresse().getHausnummer(),
            _Person.getAdresse().getPostleitzahl(), 
            _Person.getAdresse().getStadt ()
            );
        this.fachbereich = _fachbereich;
    }

    // Methode zum Anzeigen der Patientendaten

    public String getFachbereich() {
        return fachbereich;
    }

    public void setFachbereich(String fachbereich) {
        this.fachbereich = fachbereich;
    }

    public String toString() {
        return getVorname() + " " +
         getNachname() + ", " + 
         getGeschlecht() + " " + 
         getAdresse().getStrasse() + " " + 
         getAdresse().getHausnummer() + ", " + 
         getAdresse().getPostleitzahl() + " " + 
         getAdresse().getStadt ()+ " "+
         ", Fachbereich: " + getFachbereich();
    }
           // compareTo Methode
    @Override
    public int compareTo(Arzt andererArzt) {
        return this.getNachname().compareTo(andererArzt.getNachname());
    }
}



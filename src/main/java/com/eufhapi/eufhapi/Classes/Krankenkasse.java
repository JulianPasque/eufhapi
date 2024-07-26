package com.eufhapi.eufhapi.Classes;

public class Krankenkasse {
    
    //Eigenschaften
    private String name;


    //Konstruktor
    public Krankenkasse(String _name) {
        setName(_name);
    }

    //Getter and Setter
    public void setName(String _name) {
        this.name = _name;
    }
    public String getName() {
        return this.name;
    }

}

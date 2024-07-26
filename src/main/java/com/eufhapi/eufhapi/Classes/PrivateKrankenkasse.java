package com.eufhapi.eufhapi.Classes;

public class PrivateKrankenkasse extends Krankenkasse {
    
        //Eigenschaften
        private String Tarif;

        //Konstruktor
        public PrivateKrankenkasse(String _name, String _tarif) {
            super(_name);
            setTarif(_tarif);
        }
    
        //Getter and Setter 
        public void setTarif(String _tarif) {
            this.Tarif = _tarif;
        }   
    
        public String getTarif() {
            return this.Tarif;
        }   
        
        public String toString() {
            return " Krankenkassenname: " + super.getName() + " Ist Tarif:" + getTarif();
        }   





}

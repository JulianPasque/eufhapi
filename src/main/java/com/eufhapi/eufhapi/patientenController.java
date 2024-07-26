package com.eufhapi.eufhapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.eufhapi.eufhapi.Classes.Adresse;
import com.eufhapi.eufhapi.Classes.GesetzlicheKrankenkasse;
import com.eufhapi.eufhapi.Classes.Patient;
import com.eufhapi.eufhapi.Classes.PrivateKrankenkasse;


@RestController
public class patientenController {

        ArrayList<Patient> patientenListe = new ArrayList<>();

        public patientenController()
        {

      // Manuell generierte Patientendaten

        patientenListe.add(new Patient("Anna", "Müller", "w", "20", "Hauptstraße", "12", "10115", "Berlin", "Husten",
                new GesetzlicheKrankenkasse("AOK", true, new Adresse("Hauptstraße", "12", "10115", "Berlin"))));
        patientenListe.add(new Patient("Sophie", "Schneider", "w", "20", "Gartenweg", "7", "50667", "Köln", "Fieber"));
        patientenListe.add(new Patient("Max", "Schmidt", "w", "20", "Bahnhofstraße", "34", "80331", "München",
                "Kopfschmerzen", new PrivateKrankenkasse("DAK", "Tarif 1")));
        patientenListe
                .add(new Patient("Lukas", "Fischer", "m", "20", "Schulstraße", "9", "20095", "Hamburg", "Erkältung"));
        patientenListe
                .add(new Patient("Laura", "Weber", "w", "20", "Bahnhofstraße", "3", "68159", "Mannheim", "Husten"));
        patientenListe
                .add(new Patient("Felix", "Meyer", "m", "20", "Kirchweg", "21", "04109", "Leipzig", "Rückenschmerzen"));
                patientenListe
                .add(new Patient("Felix", "Meyer", "m", "20", "Kirchweg", "21", "04109", "Leipzig", "Rückenschmerzen"));

        patientenListe.add(new Patient("Hannah", "Wagner", "w", "20", "Ringstraße", "8", "10178", "Berlin", "Grippe"));
        patientenListe.add(
                new Patient("Paul", "Becker", "m", "20", "Schlossstraße", "5", "80333", "München", "Magenbeschwerden"));
        patientenListe.add(new Patient("Julia", "Hofmann", "w", "20", "Waldstraße", "16", "50672", "Köln", "Übelkeit"));
        patientenListe
                .add(new Patient("Tim", "Schulz", "m", "20", "Heidestraße", "4", "20099", "Hamburg", "Kopfschmerzen"));
        patientenListe
                .add(new Patient("Lena", "Richter", "w", "20", "Marktstraße", "22", "68161", "Mannheim", "Schwindel"));
        patientenListe.add(new Patient("Nico", "Klein", "m", "20", "Hauptstraße", "15", "04103", "Leipzig", "Husten"));
        patientenListe.add(new Patient("Mia", "Wolf", "w", "20", "Brückenstraße", "10", "10179", "Berlin", "Halsweh"));
        patientenListe.add(
                new Patient("Jonas", "Neumann", "m", "20", "Schulstraße", "18", "80335", "München", "Kniebeschwerden"));

        patientenListe.add(new Patient("Emilia", "Schwarz", "w", "20", "Bergstraße", "12", "50674", "Köln", "Fieber",
                new GesetzlicheKrankenkasse("Barmer GEK", false, new Adresse("Bergstraße", "12", "50674", "Köln"))));
        patientenListe
                .add(new Patient("Leon", "Zimmermann", "m", "20", "Fliederweg", "9", "20097", "Hamburg", "Erkältung"));
        patientenListe.add(
                new Patient("Sarah", "Braun", "w", "20", "Lindenstraße", "14", "68163", "Mannheim", "Kopfschmerzen"));
        patientenListe
                .add(new Patient("Milan", "Krüger", "m", "20", "Rosenweg", "7", "04105", "Leipzig", "Rückenschmerzen"));
        patientenListe.add(new Patient("Ella", "Hofmann", "w", "20", "Kastanienweg", "8", "10117", "Berlin", "Grippe"));
        patientenListe.add(new Patient("Julian", "Hartmann", "m", "20", "Schulstraße", "5", "80337", "München",
                "Magenbeschwerden"));
        patientenListe.add(new Patient("Lilly", "Lange", "w", "20", "Hauptstraße", "20", "50676", "Köln", "Übelkeit"));
        patientenListe.add(
                new Patient("David", "Weiß", "m", "20", "Bahnhofstraße", "6", "20099", "Hamburg", "Kopfschmerzen"));

        patientenListe.add(new Patient("Lea", "Krause", "w", "20", "Mühlenweg", "3", "68165", "Mannheim", "Schwindel"));
        patientenListe.add(new Patient("Mats", "Meier", "m", "20", "Kirchstraße", "13", "04109", "Leipzig", "Husten"));
        patientenListe.add(new Patient("Emily", "Schmitt", "w", "20", "Feldstraße", "4", "10119", "Berlin", "Halsweh"));
        patientenListe.add(
                new Patient("Henry", "Kuhn", "m", "20", "Gartenstraße", "11", "80339", "München", "Kniebeschwerden"));
        patientenListe.add(new Patient("Lina", "Koch", "w", "20", "Weinbergstraße", "17", "50670", "Köln", "Fieber"));
        patientenListe.add(new Patient("Theo", "Bauer", "m", "20", "Birkenweg", "19", "20095", "Hamburg", "Erkältung"));
        patientenListe.add(
                new Patient("Clara", "Richter", "w", "20", "Ahornweg", "21", "68167", "Mannheim", "Kopfschmerzen"));
        patientenListe
                .add(new Patient("Ben", "Schulze", "m", "20", "Tulpenweg", "2", "04107", "Leipzig", "Rückenschmerzen"));

}

        /*
         * Get - Laden von Informationen
         * Post - Speichern von Informationen
         * Delete - Löschen von Informationen
         * Patch - Aktualisieren von Informationen
         */

        @GetMapping("/Patienten")
        public List<Patient> GetAllPatienten(@RequestParam(required = false)String nachname, @RequestParam(required= false) String vorname,@RequestParam(required = false)String symptome) {
                if (vorname != null && nachname !=null) {
                        List<Patient> patienten = new ArrayList<>();
                        for (Patient patient : patientenListe) {
                                if (patient.getVorname().equals(vorname) && patient.getNachname().equals(nachname)) {
                                        patienten.add(patient);
                                }
                        }
                        return patienten;
                }
                if (nachname != null) {
                        List<Patient> patienten = new ArrayList<>();
                        for (Patient patient : patientenListe) {
                                if (patient.getNachname().equals(nachname)) {
                                        patienten.add(patient);
                                }
                        }
                        return patienten;
                }
                if (vorname != null) {
                        List<Patient> patienten = new ArrayList<>();
                        for (Patient patient : patientenListe) {
                                if (patient.getVorname().equals(vorname)) {
                                        patienten.add(patient);
                                }
                        }
                        return patienten;
                }
                if (symptome != null) {
                        List<Patient> patienten = new ArrayList<>();
                        for (Patient patient : patientenListe) {
                                if (patient.getSymptome().equals(symptome)) {
                                        patienten.add(patient);
                                }
                        }
                        return patienten;
                }

                else
                        return patientenListe;
        }

        @PostMapping("/Patienten")
        public void AddPatient(@RequestParam String vorname, @RequestParam String nachname, @RequestParam String geschlecht,
                        @RequestParam String alter, @RequestParam String strasse, @RequestParam String hausnummer,
                        @RequestParam String postleitzahl, @RequestParam String stadt, @RequestParam String symptome,
                        @RequestParam(required = false) String krankenkasse, @RequestParam(required = false) String tarif) {

                if (krankenkasse != null) {
                        patientenListe.add(new Patient(vorname, nachname, geschlecht, alter, strasse, hausnummer, postleitzahl,
                                        stadt, symptome, new PrivateKrankenkasse(krankenkasse, tarif)));
                } else {
                        patientenListe.add(new Patient(vorname, nachname, geschlecht, alter, strasse, hausnummer, postleitzahl,
                                        stadt, symptome));
                }
        }

        @DeleteMapping("/Patienten/{id}")
        public void DeletePatient(@PathVariable int id) {
                if (id < 0 || id >= patientenListe.size()) {
                        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient nicht gefunden");
                }
                patientenListe.remove(id);
        }
        
       @PatchMapping("/Patienten/{id}")
        public void UpdatePatient(@PathVariable int id, @RequestParam(required = false) String vorname, @RequestParam(required = false) String nachname, @RequestParam(required = false) String geschlecht,
                        @RequestParam(required = false) String alter, @RequestParam(required = false) String strasse, @RequestParam(required = false) String hausnummer,
                        @RequestParam(required = false) String postleitzahl, @RequestParam(required = false) String stadt, @RequestParam(required = false) String symptome,
                        @RequestParam(required = false) String krankenkasse, @RequestParam(required = false) String tarif) {
                if (id < 0 || id >= patientenListe.size()) {
                        throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Patient nicht gefunden");
                }
                Patient patient = patientenListe.get(id);
                if (vorname != null) {
                        patient.setVorname(vorname);
                }
                if (nachname != null) {
                        patient.setNachname(nachname);
                }
                if (geschlecht != null) {
                        patient.setGeschlecht(geschlecht);
                }
                if (alter != null) {
                        patient.setAlter(alter);
                }
                if (strasse != null) {
                        patient.getAdresse().setStrasse(strasse);
                }
                if (hausnummer != null) {
                        patient.getAdresse().setHausnummer(hausnummer);
                }
                if (postleitzahl != null) {
                        patient.getAdresse().setPostleitzahl(postleitzahl);
                }
                if (stadt != null) {
                        patient.getAdresse().setStadt(stadt);
                }
                if (symptome != null) {
                        patient.setSymptome(symptome);
                }
                if (krankenkasse != null) {
                        patient.setKrankenkasse(new PrivateKrankenkasse(krankenkasse, tarif));
                }
        } 
}




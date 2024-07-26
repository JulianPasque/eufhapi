package com.eufhapi.eufhapi;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eufhapi.eufhapi.Classes.Arzt;
@RestController
public class aerzteController {

    ArrayList<Arzt> aerzteListe = new ArrayList<>();

    public aerzteController()
    {
        aerzteListe.add(new Arzt("Anna", "Müller", "w", "20", "Hauptstraße", "12", "10115", "Berlin", "Husten"));
        aerzteListe.add(new Arzt("Sophie", "Schneider", "w", "20", "Gartenweg", "7", "50667", "Köln", "Fieber"));
        aerzteListe.add(new Arzt("Max", "Schmidt", "w", "20", "Bahnhofstraße", "34", "80331", "München", "Kopfschmerzen"));
        aerzteListe.add(new Arzt("Lukas", "Fischer", "m", "20", "Schulstraße", "9", "20095", "Hamburg", "Erkältung"));
        aerzteListe.add(new Arzt("Laura", "Weber", "w", "20", "Bahnhofstraße", "3", "68159", "Mannheim", "Husten"));
        aerzteListe.add(new Arzt("Felix", "Meyer", "m", "20", "Kirchweg", "21", "04109", "Leipzig", "Rückenschmerzen"));
 
}

    /*
     * Get - Laden von Informationen
     * Post - Speichern von Informationen
     * Delete - Löschen von Informationen
     * Patch - Aktualisieren von Informationen
     */

    @GetMapping("/aerzte")
    public List<Arzt> GetAllaerzte() {
       
                    return aerzteListe;
    }

}
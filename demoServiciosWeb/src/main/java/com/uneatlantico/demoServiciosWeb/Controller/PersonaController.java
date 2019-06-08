package com.uneatlantico.demoServiciosWeb.Controller;

import com.uneatlantico.demoServiciosWeb.Modelos.Persona;
import com.uneatlantico.demoServiciosWeb.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PersonaController {

        @Autowired
        PersonaRepository personaRepository;

        @GetMapping("/persona")
        private List<Persona> getAll() {
            return personaRepository.findAll();
        }

        @GetMapping("/persona/{id}")
        private Persona getPersona(@PathVariable("id") int id) {
            return personaRepository.findById(id);
        }

        @DeleteMapping("/persona/{id}")
        private void delete(@PathVariable("id") int id) {
            personaRepository.deleteById(id);
        }

        @PostMapping("/persona")
        private int save(@RequestBody Persona persona) {
            personaRepository.save(persona);
            return persona.getId();
        }
}

package com.uneatlantico.demoServiciosWeb.Repository;

import com.uneatlantico.demoServiciosWeb.Modelos.Persona;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonaRepository extends JpaRepository<Persona,Integer> {
    Persona findById(int id);
}

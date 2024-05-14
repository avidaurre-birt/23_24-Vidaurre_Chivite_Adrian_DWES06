package birt.dwes.apirest.controller;

import birt.dwes.apirest.entity.Carrera;
import birt.dwes.apirest.servicio.ServicioCarrera;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api/spring/carreras")
public class CarreraController {

    @Autowired
    private ServicioCarrera servicioCarrera;

    @GetMapping("/{id}")
    public Carrera getCarreraById(@PathVariable int id) {
        return servicioCarrera.getCarreraById(id);
    }
}
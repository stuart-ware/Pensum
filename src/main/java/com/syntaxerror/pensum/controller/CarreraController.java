package com.syntaxerror.pensum.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.syntaxerror.pensum.models.Carrera;
import com.syntaxerror.pensum.repository.CarreraRepository;

@Controller
public class CarreraController {

    @Autowired
    private CarreraRepository repository;

    // public CarreraController(CarreraRepository repository) {
    //     this.repository = repository;
    // }

    @Bean
    public CommandLineRunner initData() {
        // Se agregaran las carreras al iniciar la aplicacion
        // Al agregar nuevos borra el archivo .db y reinicia esta aplicacion
        return args -> {
            if (repository.count() == 0) {
                repository.save(new Carrera("Ingeniería de Software", "Ingeniería"));
                repository.save(new Carrera("Ingeniería Civil", "Ingeniería"));
                repository.save(new Carrera("Licenciatura en Contabilidad", "Negocios"));
                repository.save(new Carrera("Licenciatura en Mercadeo", "Negocios"));
                repository.save(new Carrera("Licenciatura en Artes Plásticas", "Artes"));
                repository.save(new Carrera("Licenciatura en Informatica", "Ciencias"));
            }
        };

    }

    @GetMapping("/")
    public String index(Model model, @RequestParam(name="escuela", required=false) String escuela) {
        // Get que trae las carreras de la base de datos
        try {
            if (escuela != null && !escuela.isEmpty()) {
            model.addAttribute("carreras", repository.findByEscuela(escuela));
            } else {
            model.addAttribute("carreras", repository.findAll());
            }
        } catch (Exception e) {
            IO.println("Ocurrió un error al accesar a la base de datos." + e.getMessage());
        }
        
        return "index";
    } 
}

package com.example.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.business.LibroBusiness;
import com.example.domain.Libro;

@RestController
@RequestMapping("/libro")
@CrossOrigin(origins = "http://localhost:4200")
public class LibroRestController {

    @Autowired
    private LibroBusiness libroBusiness;

    @GetMapping("/listar")
    public List<Libro> listar(){
        return libroBusiness.listar();
    }
}

package com.example.mapper;

import org.springframework.stereotype.Component;

import com.example.domain.Libro;
import com.example.dto.LibroDTO;

@Component
public class LibroMapper {

    public Libro toDomain(LibroDTO libroDTO){
        Libro libro = new Libro();

        libro.setIdLibro(libroDTO.getIdLibro());
        libro.setTitulo(libroDTO.getTitulo());
        libro.setAutor(libroDTO.getAutor());

        return libro;
    }
}

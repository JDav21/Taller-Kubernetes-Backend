package com.example.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.data.LibroData;
import com.example.domain.Libro;

@Service
public class LibroBusiness {

    @Autowired
    private LibroData libroData;

    public List<Libro> listar(){

        return (List<Libro>) libroData.findAll();
    }
}
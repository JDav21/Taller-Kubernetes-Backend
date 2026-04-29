package com.example.data;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Libro;

@Repository
public class LibroData {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly = true)
    public List<Libro> findAll(){
        String sql = "SELECT idlibro, titulo, autor FROM libro";

        return jdbcTemplate.query(sql, (rs, rowNum) -> {
            Libro libro = new Libro();
            libro.setIdLibro(rs.getInt("idlibro"));
            libro.setTitulo(rs.getString("titulo"));
            libro.setAutor(rs.getString("autor"));
            return libro;
        });
    }
}

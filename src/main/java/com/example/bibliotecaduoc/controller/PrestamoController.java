package com.example.bibliotecaduoc.controller;

import com.example.bibliotecaduoc.model.Prestamo;
import com.example.bibliotecaduoc.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/solicitudes")
public class PrestamoController {

    @Autowired
    private PrestamoService prestamoService;

    @GetMapping
    public List<Prestamo> listarPrestamos() {
        return prestamoService.getPrestamos();
    }

    @PostMapping
    public Prestamo agregarPrestamo(Prestamo prestamo) {
        return prestamoService.savePrestamo(prestamo);
    }

    @GetMapping
    public Prestamo buscarPrestamo(int id){
        return prestamoService.getPrestamoId(id);
    }

    @DeleteMapping
    public String eliminarPrestamo(int id) {
        return prestamoService.deletePrestamo(id);
    }

    @GetMapping
    public int totalPrestamos() {
        return prestamoService.totalPrestamos();
    }
}
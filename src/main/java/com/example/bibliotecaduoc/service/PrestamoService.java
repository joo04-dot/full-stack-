package com.example.bibliotecaduoc.service;

import com.example.bibliotecaduoc.model.Prestamo;
import com.example.bibliotecaduoc.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrestamoService {

    @Autowired
    private PrestamoRepository prestamoRepository;

    public List<Prestamo> getPrestamos() {
        return prestamoRepository.obtenerPrestamos();
    }

    public Prestamo savePrestamo(Prestamo prestamo) {
        return prestamoRepository.guardar(prestamo);
    }

    public Prestamo getPrestamoId(int id) {
        return prestamoRepository.buscarPorId(id);
    }

    public String deletePrestamo(int id) {
        prestamoRepository.eliminar(id);
        return "Préstamo eliminado";
    }

    public int totalPrestamos() {
        return prestamoRepository.totalPrestamos();
    }
}
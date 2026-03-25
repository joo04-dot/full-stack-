package com.example.bibliotecaduoc.repository;

import com.example.bibliotecaduoc.model.Prestamo;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class PrestamoRepository {

    private List<Prestamo> listaPrestamos = new ArrayList<>();
    private int contadorId = 1;

    public List<Prestamo> obtenerPrestamos() {
        return listaPrestamos;
    }

    public Prestamo buscarPorId(int id) {
        for (Prestamo p : listaPrestamos) {
            if (p.getId_prestamo() == id) {
                return p;
            }
        }
        return null;
    }

    public Prestamo guardar(Prestamo prestamo) {
        prestamo.setId_prestamo(contadorId++);
        listaPrestamos.add(prestamo);
        return prestamo;
    }

    public void eliminar(int id) {
        listaPrestamos.removeIf(p -> p.getId_prestamo() == id);
    }

    public int totalPrestamos() {
        return listaPrestamos.size();
    }
}
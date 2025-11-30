
package com.economi.repositorio;

import com.economi.modelo.Transaccion;
import org.springframework.data.repository.CrudRepository;

public interface TransaccionRepository extends CrudRepository<Transaccion, Integer> {
    // Buscar transacciones por usuario
    Iterable<Transaccion> findByIdUsuario(Integer idUsuario);

    // Buscar transacciones por categoría
    Iterable<Transaccion> findByIdCategoria(Integer idCategoria);

    // Buscar transacciones por tipo (gasto/ingreso)
    Iterable<Transaccion> findByTipo(String tipo);
}

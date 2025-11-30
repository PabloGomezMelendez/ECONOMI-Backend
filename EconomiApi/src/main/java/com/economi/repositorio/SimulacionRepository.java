
package com.economi.repositorio;

import com.economi.modelo.Simulacion;
import org.springframework.data.repository.CrudRepository;

public interface SimulacionRepository extends CrudRepository<Simulacion, Integer> {
    // Buscar simulaciones por usuario
    Iterable<Simulacion> findByUserId(Integer userId);

    // Buscar simulaciones por tipo (inversión o ahorro)
    Iterable<Simulacion> findByTipo(String tipo);
}

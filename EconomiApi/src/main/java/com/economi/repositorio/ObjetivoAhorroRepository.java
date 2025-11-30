
package com.economi.repositorio;

import com.economi.modelo.ObjetivoAhorro;
import org.springframework.data.repository.CrudRepository;

public interface ObjetivoAhorroRepository extends CrudRepository<ObjetivoAhorro, Integer> {
    // Buscar objetivos por usuario
    Iterable<ObjetivoAhorro> findByUserId(Integer userId);

    // Buscar objetivos por estado (pendiente/completado)
    Iterable<ObjetivoAhorro> findByEstado(String estado);
}

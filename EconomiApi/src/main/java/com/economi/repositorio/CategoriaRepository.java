
package com.economi.repositorio;

import com.economi.modelo.Categoria;
import org.springframework.data.repository.CrudRepository;

public interface CategoriaRepository extends CrudRepository<Categoria, Integer> {
    // Método adicional para buscar por tipo
    Iterable<Categoria> findByTipo(String tipo);
}

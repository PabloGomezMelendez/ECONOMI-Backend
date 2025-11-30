
package com.economi.repositorio;

import org.springframework.data.repository.CrudRepository;

import com.economi.modelo.Usuario;

public interface UsuarioRepository extends CrudRepository<Usuario, Integer> {
    // Puedes añadir métodos personalizados si lo necesitas
    Usuario findByEmail(String email);
}

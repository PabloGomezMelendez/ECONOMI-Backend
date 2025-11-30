package com.economi.servicio;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.economi.modelo.Usuario;
import com.economi.repositorio.UsuarioRepository;

@Service
public class UsuarioService {

    private final UsuarioRepository usuarioRepository;

    public UsuarioService(UsuarioRepository usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    // Crear usuario
    public Usuario crearUsuario(Usuario usuario) {
        usuario.setRegistrationDate(LocalDateTime.now());
        return usuarioRepository.save(usuario);
    }

    // Obtener todos los usuarios
    public Iterable<Usuario> obtenerTodos() {
        return usuarioRepository.findAll();
    }

    // Obtener usuario por ID
    public Optional<Usuario> obtenerPorId(Integer id) {
        return usuarioRepository.findById(id);
    }

    // Actualizar usuario
    public Optional<Usuario> actualizarUsuario(Integer id, Usuario datosActualizados) {
        return usuarioRepository.findById(id).map(usuarioExistente -> {
            usuarioExistente.setName(datosActualizados.getName());
            usuarioExistente.setEmail(datosActualizados.getEmail());
            usuarioExistente.setPassword(datosActualizados.getPassword());
            return usuarioRepository.save(usuarioExistente);
        });
    }

    // Eliminar usuario
    public boolean eliminarUsuario(Integer id) {
        if (usuarioRepository.existsById(id)) {
            usuarioRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

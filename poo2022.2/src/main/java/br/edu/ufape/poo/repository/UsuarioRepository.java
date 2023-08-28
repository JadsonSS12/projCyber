package br.edu.ufape.poo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.mensageiro.negocio.basica.Usuario;

@Repository

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	
}
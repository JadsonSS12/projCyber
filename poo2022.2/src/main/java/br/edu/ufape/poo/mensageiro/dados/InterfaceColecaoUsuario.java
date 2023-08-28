package br.edu.ufape.poo.mensageiro.dados;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.mensageiro.negocio.basica.Usuario;

@Repository
public interface InterfaceColecaoUsuario 
	extends JpaRepository<Usuario, Long>{
	
	
	public Usuario findByEmail(String email);

	public Optional<Usuario> findByNome(String nome);

}
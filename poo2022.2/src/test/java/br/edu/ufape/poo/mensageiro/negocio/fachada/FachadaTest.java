package br.edu.ufape.poo.mensageiro.negocio.fachada;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import br.edu.ufape.poo.mensageiro.negocio.basica.Usuario;
import br.edu.ufape.poo.mensageiro.negocio.cadastro.exception.UsuarioDuplicadoException;
import br.edu.ufape.poo.mensageiro.negocio.cadastro.exception.UsuarioNaoExisteException;
import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
class FachadaTest {
	@Autowired
	private Fachada fachada;
	
	@BeforeEach
	public void init() throws UsuarioDuplicadoException {
		Usuario u = new Usuario("Igor", 1.7f, "maquinaJogos", "igor@gmail.com");
		Usuario u2 = new Usuario("Karkarov", 17.7f, "maquinaEdição", "Karkarov@gmail.com");
		
		fachada.salvarUsuario(u);
		fachada.salvarUsuario(u2);
	
	}
	
	

}
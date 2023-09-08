package br.edu.ufape.poo.mensageiro.negocio.cadastro;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import br.edu.ufape.poo.mensageiro.negocio.basica.Usuario;
import br.edu.ufape.poo.mensageiro.negocio.cadastro.exception.UsuarioDuplicadoException;

@SpringBootTest
class CadastroUsuarioTest {
	@Autowired
	private InterfaceCadastroUsuario cadastroUsuario;

	@Test
	void testarCadastroEmailDuplicado() {
		String email = "igor@gmail.com";	
		Usuario u1 = new Usuario("Igor", 212.5f, email, "12345678");
		Usuario u2 = new Usuario("Medeiros",214.4f, email, "987654321");
		
		UsuarioDuplicadoException exception = 
				assertThrows(UsuarioDuplicadoException.class, 
			() -> {
				cadastroUsuario.salvarUsuario(u1);
				cadastroUsuario.salvarUsuario(u2);
				  }			
		);
		assertEquals(exception.getEmail(), email);
		assertTrue(exception.getMessage().contains("mesmo email"));
	}
}
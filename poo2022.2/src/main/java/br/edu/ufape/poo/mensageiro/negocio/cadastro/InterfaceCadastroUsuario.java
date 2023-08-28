package br.edu.ufape.poo.mensageiro.negocio.cadastro;

import java.util.List;

import br.edu.ufape.poo.mensageiro.negocio.basica.*;
import br.edu.ufape.poo.mensageiro.negocio.cadastro.exception.*;


public interface InterfaceCadastroUsuario {

	Usuario procurarUsuarioEmail(String email) throws UsuarioNaoExisteException;

	Usuario salvarUsuario(Usuario entity) throws UsuarioDuplicadoException;

	List<Usuario> listarUsuarios();

	boolean verificarExistenciaUsuarioId(Long id);

	Usuario localizarUsuarioId(Long id);

	void removerUsuarioEmail(String email);

}
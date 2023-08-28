package br.edu.ufape.poo.mensageiro.negocio.cadastro;


import java.util.List;


import br.edu.ufape.poo.mensageiro.negocio.basica.Mensagem;
import br.edu.ufape.poo.mensageiro.negocio.cadastro.exception.*;
import br.edu.ufape.poo.mensageiro.dados.InterfaceColecaoMensagem;

public interface InterfaceCadastroMensagem {


	List<Mensagem> listarTodasMensagens();


	List<Mensagem> findAll();

	List<Mensagem> findByRemetente_id(Long id);

	List<Mensagem> listarMensagensRemente(Long id);

	Mensagem salvarMensagem(Mensagem entity);

	void apagarMensagem(Mensagem entity);




}
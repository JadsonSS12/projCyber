package br.edu.ufape.poo.mensageiro.negocio.cadastro.exception;

public class ProdutoNaoEncontradoException extends Exception{

	   public ProdutoNaoEncontradoException() {
	        super("Produto já existe na base de dados.");
	        
	    }

	    public ProdutoNaoEncontradoException(String mensagem) {
	        super(mensagem);
	    }
	}


package br.edu.ufape.poo.mensageiro.negocio.cadastro.exception;

public class AutoMensagemException extends Exception{
	private static final long serialVersionUID = 1L;
	public Long userId;
	
	public AutoMensagemException(long i) {
		super("Não é permitido enviar uma mensagem para si mesmo.");
		this.userId = i;
	}

	public Long getUserId() {
		return this.userId;
	}
}
package br.edu.ufape.poo.mensageiro.negocio.cadastro.exception;

public class MaquinaNaoEncontradaException extends Exception {

    public MaquinaNaoEncontradaException() {
        super("Máquina não encontrada.");
    }

    public MaquinaNaoEncontradaException(String mensagem) {
        super(mensagem);
    }
}
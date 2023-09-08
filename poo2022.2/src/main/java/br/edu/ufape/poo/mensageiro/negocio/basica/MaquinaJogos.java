package br.edu.ufape.poo.mensageiro.negocio.basica;

import br.edu.ufape.poo.mensageiro.negocio.basica.*;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class MaquinaJogos extends Maquina{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long Id;
    private float precoHora;
    private String jogo;


public float getPrecoHora() {
    return precoHora;
}

public void setPrecoHora(float precoHora) {
    this.precoHora = precoHora;
}

public String getJogo() {
    return jogo;
}

public void setJogo(String jogo) {
    this.jogo = jogo;
}


}
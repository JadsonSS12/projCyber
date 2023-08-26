package br.edu.ufape.poo.mensageiro.negocio.basica;

import br.edu.ufape.poo.mensageiro.negocio.basica.*;

public interface UsuarioInterface {
    public abstract void adicionarTempo();
    public abstract void pedirLanche();
    public abstract void consultar();
    public abstract void trocarMaquina();
    public abstract void encerrarSessao(MaquinaJogos tal);
    //a interface será override em Usuario;
    //adicionarTempo também terá override em Maquina;


}

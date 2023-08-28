package br.edu.ufape.poo.mensageiro.negocio.cadastro;


import java.util.List;


import br.edu.ufape.poo.mensageiro.negocio.basica.*;
import br.edu.ufape.poo.mensageiro.negocio.cadastro.exception.*;

public interface InterfaceCadastroMaquina {

    Maquina procurarMaquinaPorId(Long id) throws MaquinaNaoEncontradaException;

    Maquina cadastrarMaquina(Maquina maquina);

    List<Maquina> listarMaquinas();

    boolean verificarExistenciaMaquinaId(Long id);

    void removerMaquina(Long id) throws MaquinaNaoEncontradaException;
}

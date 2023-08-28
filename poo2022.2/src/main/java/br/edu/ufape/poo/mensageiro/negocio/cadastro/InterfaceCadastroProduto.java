package br.edu.ufape.poo.mensageiro.negocio.cadastro;

import java.util.List;

import br.edu.ufape.poo.mensageiro.negocio.basica.*;
import br.edu.ufape.poo.mensageiro.negocio.cadastro.exception.*;


public interface InterfaceCadastroProduto {

    Produto procurarProdutoPorId(Long id) throws ProdutoNaoEncontradoException;

    Produto cadastrarProduto(Produto produto) throws ProdutoDuplicadoException, ProdutoNaoEncontradoException;

    List<Produto> listarProdutos();

    boolean verificarExistenciaProdutoId(Long id);

    void removerProduto(Long id) throws ProdutoNaoEncontradoException;
}

package br.edu.ufape.poo.mensageiro.negocio.cadastro;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.mensageiro.dados.*;
import br.edu.ufape.poo.mensageiro.negocio.basica.*;
import br.edu.ufape.poo.mensageiro.negocio.cadastro.exception.*;


@Service
public class CadastroProduto implements InterfaceCadastroProduto {
    @Autowired
    private InterfaceColecaoProduto colecaoProduto;

    public Produto procurarProdutoPorId(Long id) throws ProdutoNaoEncontradoException {
        return colecaoProduto.findById(id)
            .orElseThrow(() -> new ProdutoNaoEncontradoException("Produto com ID " + id + " não encontrado"));
    }

    public Produto cadastrarProduto(Produto produto) throws ProdutoDuplicadoException, ProdutoNaoEncontradoException {
    	if (produto.getQuantidadeEstoque() <= 0) {
            throw new ProdutoNaoEncontradoException("Produto Nao Encontrado");
        }
        if (colecaoProduto.existsByNome(produto.getNome())) {
            throw new ProdutoDuplicadoException("Produto com nome '" + produto.getNome() + "' já existe");
        }
        return colecaoProduto.save(produto);
    }

    public List<Produto> listarProdutos() {
        return colecaoProduto.findAll();
    }

    public boolean verificarExistenciaProdutoId(Long id) {
        return colecaoProduto.existsById(id);
    }

    public void removerProduto(Long id) throws ProdutoNaoEncontradoException {
        if (!verificarExistenciaProdutoId(id)) {
            throw new ProdutoNaoEncontradoException("Produto com ID " + id + " não encontrado");
        }
        colecaoProduto.deleteById(id);
    }
}

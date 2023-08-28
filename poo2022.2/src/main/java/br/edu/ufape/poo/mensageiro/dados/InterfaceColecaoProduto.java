package br.edu.ufape.poo.mensageiro.dados;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.ufape.poo.mensageiro.negocio.basica.*;

@Repository
public interface InterfaceColecaoProduto extends JpaRepository<Produto, Long> {

    boolean existsByNome(String nome);
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufape.poo.mensageiro.negocio.basica;
import br.edu.ufape.poo.mensageiro.negocio.basica.UsuarioInterface;

    /**
 *
 * @author Usuário
 */
public class Usuario implements UsuarioInterface {
    private String nome;
    private int Id;
    private float debito;
    private String maquina;
    
    public void efetuarCadastro(String nome){
        this.nome = nome;
        this.Id = this.getId();
        this.debito = this.getDebito();
        this.maquina = this.getMaquina();
    }
    
    public void escolherMaquina(String maquina, int tempo){
        
    }
    
    public void avaliacaoMaquina(){
        
    }
    
    public void avaliacaoLanche(){
        
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return Id;
    }

    public void setId(int ID) {
        this.Id = ID;
    }

    public float getDebito() {
        return debito;
    }

    public void setDebito(float debito) {
        this.debito = debito;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

	@Override
	public void adicionarTempo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pedirLanche() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void consultar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void trocarMaquina() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void encerrarSessao(MaquinaJogos tal) {
		// TODO Auto-generated method stub
		
	}

  
    
}
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
    private long Id;
    private float debito;
    private String maquina;
    private String Email;
    
    public Usuario(String nome, float debito, String maquina, String Email){
        this.nome = nome;
        this.Id = this.getId();
        this.debito = this.getDebito();
        this.maquina = this.getMaquina();
        this.Email = Email;
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

    public long getId() {
        return Id;
    }

    public void setId(long id2) {
        this.Id = id2;
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

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

  
    
}
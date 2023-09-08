
	package br.edu.ufape.poo.mensageiro.negocio.basica;

	import java.util.Date;

	import jakarta.persistence.Entity;
	import jakarta.persistence.GeneratedValue;
	import jakarta.persistence.GenerationType;
	import jakarta.persistence.Id;
	import jakarta.persistence.Inheritance;
	import jakarta.persistence.InheritanceType;
	import jakarta.persistence.ManyToOne;

	@Entity
	@Inheritance(strategy = InheritanceType.JOINED)
	public class Mensagem {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private long id;
		private String texto;
		private Date dataHora;
		
		@ManyToOne
		private Usuario remetente;
		@ManyToOne
		private Usuario destinatario;

		public Usuario getDestinatario() {
			return destinatario;
		}

		public void setDestinatario(Usuario destinatario) {
			this.destinatario = destinatario;
		};
		
		public Usuario getRemetente() {
			return remetente;
		}
		public void setRemetente(Usuario remetente) {
			this.remetente = remetente;
		}
		public long getId() {
			return id;
		}
		public void setId(long id) {
			this.id = id;
		}
		public String getTexto() {
			return texto;
		}
		public void setTexto(String texto) {
			this.texto = texto;
		}
		public Date getDataHora() {
			return dataHora;
		}
		public void setDataHora(Date dataHora) {
			this.dataHora = dataHora;
		}
		public Mensagem() {
			super();
		}
		
		

	}


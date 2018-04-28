package model;

public class Professor {
	
	private String nome;
	private String datanasc;
	private String nomemae;
	private int titulacao;
	private int idprofessor;

	public Professor(String nome, String datanasc, String nomemae, int titulacao, int idprofessor) {
		super();
		this.nome = nome;
		this.datanasc = datanasc;
		this.nomemae = nomemae;
		this.titulacao = titulacao;
		this.idprofessor = idprofessor;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDatanasc() {
		return datanasc;
	}
	public void setDatanasc(String datanasc) {
		this.datanasc = datanasc;
	}
	public String getNomemae() {
		return nomemae;
	}
	public void setNomemae(String nomemae) {
		this.nomemae = nomemae;
	}
	public int getTitulacao() {
		return titulacao;
	}
	public void setTitulacao(int titulacao) {
		this.titulacao = titulacao;
	}
	public int getIdprofessor() {
		return idprofessor;
	}
	public void setIdprofessor(int idprofessor) {
		this.idprofessor = idprofessor;
	}

}

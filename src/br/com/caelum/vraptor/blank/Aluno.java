package br.com.caelum.vraptor.blank;

public class Aluno {
	private String nome;
	private Integer anoDeIngresso;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Integer getAnoDeIngresso() {
		return anoDeIngresso;
	}
	public void setAnoDeIngresso(Integer anoDeIngresso) {
		this.anoDeIngresso = anoDeIngresso;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", anoDeIngresso=" + anoDeIngresso + "]";
	}
}

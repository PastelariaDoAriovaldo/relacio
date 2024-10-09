package relacao.assosiacao;

public class aluno {
	private String nome;
	private universidade universidade;
	public aluno(String nome, relacao.assosiacao.universidade universidade) {
		this.nome = nome;
		this.universidade = universidade;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public universidade getUniversidade() {
		return universidade;
	}
	public void setUniversidade(universidade universidade) {
		this.universidade = universidade;
	}
	
	
	
}
package relacao.assosiacao;

public class Main {
	public static void main(String[] args) {
		
		Universidade universidade = new Universidade("USP");
		
		Aluno aluno = new Aluno("João", universidade);
		
		System.out.println("Aluno: " + aluno.getNome() + "\nUniversidade: " + universidade.getNome());
	}

}

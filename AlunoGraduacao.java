public class alunoGraduacao implements IUsuario {
	
	String nome;
	String codigo;

	public alunoGraduacao (String nome, String codigo) {
		this.nome = nome;
		this.codigo = codigo;
	}

	public void setNome (String nome) {
		this.nome = nome;
	}

	public String getNome () {
		return nome;
	}

	public String getCodigo () {
		return codigo;
	}

	public void emprestimo (String nomeLivro) {
		solicitarEmprestimo = emprestimoAlunoGraduacao;
		solicitarEmprestimo.emprestar(nomeLivro);
	}

}
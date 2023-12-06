public class RegistroLivros {

	private static RegistroLivros instancia;
	private ArrayList<Livro> livrosDisponiveis;
	private ArrayList<Livro> livrosAlugados;

	private RegistroLivros() {
		livrosDisponiveis = new ArrayList<Livro>();
		livrosAlugados = new ArrayList<Livro>();
	};

	public static RegistroLivros getInstancia() {
		if (instancia == null) {
			instancia = new RegistroLivros();
		}
		return instancia;
	}

	public void adicionarLivroDisponivel(Livro livro) {
		livrosDisponiveis.add(livro);
	}

	public void adicionarLivroAlugado(Livro livro) {
		livrosAlugados.add(livro);
		livrosDisponiveis.remove(livro);
	}
	public static void setInstancia(RegistroLivros instancia) {
		RegistroLivros.instancia = instancia;
	}

	public ArrayList<Livro> getLivrosDisponiveis() {
		return livrosDisponiveis;
	}


	public ArrayList<Livro> getLivrosAlugados() {
		return livrosAlugados;
	}
	

	public static RegistroLivros obterInstancia() {
		if (instancia == null) {
			instancia = new RegistroLivros();
		}
		return instancia;
	}

	public Livro buscarLivrosDisponiveisPorCodigo(String codigoLivro) {
		for (Livro livro : livrosDisponiveis) {
			if (livro.getNome().equals(codigoLivro)) {
				return livro;
			}
		}
		return null;
	}

	public void removerLivroDisponivel(Livro livro) {
		livrosDisponiveis.remove(livro);
	}

	public void removerLivroAlugado(Livro livro) {
		livrosAlugados.remove(livro);
	}
	

}
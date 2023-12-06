public class emprestimoAlunoGraduacao implements IEmprestimo {
	//	private String nomeLivro;
	
	public void emprestar (String codigoLivro) {
		RegistroLivros registroLivros = RegistroLivros.getInstancia();
		Livro livro = buscarLivroDisponivelPorCodigo(codigoLivro);
		if (livro) {
			registroLivros.removerLivroDisponivel(livro);
		}
		else print("O livro que você está buscando não está na biblioteca");
	}
}
public class RegistroLivros {

	private static RegistroLivros instancia;
	private ArrayList<Livro> livrosDisponiveis;
	private ArrayList<Livro> livrosAlugados;

	private RegistroLivros() {};

	public static RegistroLivros obterInstancia() {
		if (instancia == null) {
			instancia = new RegistroLivros();
		}
		return instancia;
	}
	

}
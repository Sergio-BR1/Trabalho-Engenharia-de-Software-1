import java.util.ArrayList;

public class Livro {
	private String titulo;
	private String codigo;
	private ArrayList<String> autores = new ArrayList<String>();
	private String edicao;
	private int ano;
	
	public Livro (String nome, String codigo, ArrayList<String> autores, String edicao, int ano) {
		this.nome = nome;
		this.autores = autores;
		this.edicao = edicao;
		this.ano = ano;
}
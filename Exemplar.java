public class Exemplar {
	private String codigoLivro;
	private String codigoExemplar;
	private string status;

	public Exemplar(String codigoLivro, String codigoExemplar, String status) {
		this.codigoLivro = codigoLivro;
		this.codigoExemplar = codigoExemplar;
		this.status = status;
	}

	public String getCodigoLivro() {
		return codigoLivro;
	}

	public void setCodigoLivro(String codigoLivro) {	
		this.codigoLivro = codigoLivro;
	}

	public String getCodigoExemplar() {
		return codigoExemplar;
	}

	public void setCodigoExemplar(String codigoExemplar) {
		this.codigoExemplar = codigoExemplar; 
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
			this.status = status;
	}

	}
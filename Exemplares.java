import java.util.ArrayList;
public class Exemplares {
	private static Exemplares instancia;
	private ArrayList<Exemplar> exemplares;
	private Exemplares() {
		exemplares = new ArrayList<Exemplar>(10);
	}
	public static Exemplares getInstancia() {
		if (instancia == null) {
			instancia = new Exemplares();
		}
		return instancia;
	}
}
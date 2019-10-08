
import Condicion;


public class CondicionCompuestaOr{
	private Condicion c;
	private Condicion c1;
	public CondicionCompuestaOr(Condicion c, Condicion c1){
		this.c = c;
		this.c1 = c1;
	}
	public boolean seCumple() {
		return this.c.seCumple() || this.c1.seCumple();
	}

}

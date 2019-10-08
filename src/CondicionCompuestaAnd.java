public class CondicionCompuestaAnd extends Condicion{
	private Condicion c;
	private Condicion c1;
	public CondicionCompuestaAnd(Condicion c, Condicion c1){
		this.c = c;
		this.c1 = c1;
	}
	public boolean seCumple() {
		return this.c.seCumple() && this.c1.seCumple();
	}

}

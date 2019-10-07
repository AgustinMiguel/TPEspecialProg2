
public class CpromedioPesoSuperiorA extends Condicion {
	private Establecimiento establecimiento;
	private int peso;
	public CpromedioPesoSuperiorA(Establecimiento e, int p){
		establecimiento = e;
		peso = p;
	}
	
	public boolean seCumple() {
		return establecimiento.promedioPeso() > peso;
	}

}

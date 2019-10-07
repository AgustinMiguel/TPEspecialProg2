
public class CpromedioEdadSuperiorA {
	private Establecimiento establecimiento;
	private int edad;
	public CpromedioEdadSuperiorA(Establecimiento e, int e1){
		establecimiento = e;
		edad = e1;
	}
	
	public boolean seCumple() {
		return establecimiento.promedioEdad() > edad;
	}

}

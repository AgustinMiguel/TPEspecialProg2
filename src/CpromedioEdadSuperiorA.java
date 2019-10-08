


public class CpromedioEdadSuperiorA extends CondicionPorGrupo {
	private int edad;
	public CpromedioEdadSuperiorA(int e1){
		edad = e1;
	}
	
	public boolean seCumple(Establecimiento establecimiento) {
		return establecimiento.promedioEdad() > edad;
	}

}

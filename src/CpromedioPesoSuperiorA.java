


public class CpromedioPesoSuperiorA extends CondicionPorGrupo {
	private int peso;
	public CpromedioPesoSuperiorA(int p){
		peso = p;
	}
	
	public boolean seCumple(Establecimiento establecimiento) {
		return establecimiento.promedioPeso() > peso;
	}

}

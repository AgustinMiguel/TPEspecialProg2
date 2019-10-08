public class CedadSuperiorA extends CondicionPorVaca{
	private int edad;
	public CedadSuperiorA( int e){
		edad = e;
	}
	public boolean seCumple(Animal vaca) {
		return vaca.getEdad() > edad;
	}
	

}

public class CedadSuperiorA extends CondicionPorVaca{
	private int edad;
	public CedadSuperiorA( int e){
		edad = e;
	}
	public boolean seCumple(Animal animal) {
		return animal.getEdad() > edad;
	}
	

}

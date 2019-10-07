public class CedadSuperiorA extends Condicion{
	private Animal animal;
	private int edad;
	public CedadSuperiorA(Animal a, int e){
		animal = a;
		edad = e;
	}
	@Override
	public boolean seCumple() {
		return animal.getEdad() > edad;
	}
	

}

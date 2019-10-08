

public class CondicionRazaIgualA {
	private Animal animal;
	private String raza;
	public CondicionRazaIgualA(Animal a, String r){
		animal = a;
		raza = r;
	}
	
	public boolean seCumple() {
		return animal.getRaza().equals(raza);
	}

}

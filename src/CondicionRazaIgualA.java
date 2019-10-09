

public class CondicionRazaIgualA extends CondicionPorVaca{
	private String raza;
	public CondicionRazaIgualA(String r){
		raza = r;
	}
	
	public boolean seCumple(Animal animal) {
		return animal.getRaza().equals(raza);
	}

}

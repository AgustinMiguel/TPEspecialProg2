import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<ElementoSistemaGanadero> establecimientos = new ArrayList<ElementoSistemaGanadero>();
		Animal v = new Animal(0, 0, false, 0, 'm', 20, "raza");
		Animal v1 = new Animal(0, 20, false, 0, 'm', 30, "raza");
		Animal v2 = new Animal(0, 20, false, 0, 'm', 30, "raza");
		establecimientos.add(v);
		Establecimiento e1 = new Establecimiento( "asd");
		e1.add(v);
		e1.add(v2);
		Establecimiento e = new Establecimiento( "asd");
		e.add(v1);
		e.add(e1);
		Condicion c = new CpesoSuperiorA(v, 1);
		Condicion c1 = new CpromedioEdadSuperiorA(e1, 1);
		Condicion c2 = new CondicionCompuestaAnd(c, c1);
		System.out.println(e.cantidadAnimales());
		System.out.println(e.edadTotal());
		System.out.println(e.pesoTotal());
		System.out.println(e.promedioEdad());
		System.out.println(e.promedioPeso());
		System.out.println(c.seCumple());
		System.out.println(c1.seCumple());
		System.out.println(c2.seCumple());
	
	}

}

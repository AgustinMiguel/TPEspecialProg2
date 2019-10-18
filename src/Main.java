import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				Animal v = new Animal(0, false, 0, 'm', 20, "raza");
		Animal v1 = new Animal(2, true, 0, 'f', 10, "raza");
		Animal v2 = new Animal(20, false, 0, 'm', 30, "raza");
		CondicionPorVaca hijos = new CcantHijos(0);
		CondicionPorVaca edad = new CedadSuperiorA(15);
		CondicionPorGrupo pEdad = new CpromedioEdadSuperiorA(99);
		Camion c = new Camion(2, edad);
		Establecimiento e1 = new Establecimiento( "asd");
		e1.add(v);
		e1.add(v1);
		e1.add(v2);
		c.cargarCamion(e1);
		
		
	
//		Establecimiento e = new Establecimiento( "asd");
		//c.cargarCamion(e1); //rompe
		

		
//		e.add(v1);
//		e.add(e1);
		
	}

}

import java.util.ArrayList;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Etiqueta et = new Etiqueta("Vaquillona");
		
		Animal v = new Animal(0, false, 0, 'm', 20, "raza");
		Animal v1 = new Animal(2, true, 0, 'f', 50, "raza");
		Animal v2 = new Animal(20, false, 0, 'm', 30, "raza");
		CondicionPorVaca hijos = new CcantHijos(0);
		CondicionPorVaca edad = new CedadSuperiorA(15);
		et.addEtiqueta(hijos);
		et.addEtiqueta(edad);
		System.out.println(et.cumple(v));
		Establecimiento e1 = new Establecimiento( "asd");
		e1.add(v);
		e1.add(v2);
//		Establecimiento e = new Establecimiento( "asd");
		Camion c = new Camion(500, edad);
		c.cargarCamion(e1);

		
//		e.add(v1);
//		e.add(e1);
		
	}

}

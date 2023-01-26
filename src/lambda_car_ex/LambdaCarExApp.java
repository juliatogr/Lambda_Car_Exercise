package lambda_car_ex;

import java.util.ArrayList;

/*1.-Coches de más de 100 cv de potencia:
2.-Coches de una marca y modelo:
3.-Media de los caballos de todos los coches:
4.-Cantidad de coches de una marca en concreto:
5.-Todos los coches diferentes de una marca:
6.-Primer coche de una marca:
7.-Último coche de una marca:
*/
public class LambdaCarExApp {
	public static void main(String[] args) {
		
		ArrayList<Coche> coches = new ArrayList<>();
		
		coches.add(new Coche("Nissan", "Qashqai", 1332, 140));
		coches.add(new Coche("Ford", "Fiesta", 1000, 75));
		coches.add(new Coche("Seat", "Ibiza", 1400, 110));
		coches.add(new Coche("Audi", "A3", 1000, 110));
		coches.add(new Coche("Ford", "Focus", 1200, 120));
		coches.add(new Coche("Peugeot", "208", 1200, 75));
		coches.add(new Coche("Nissan", "Qashqai", 1500, 160));
		coches.add(new Coche("Mini", "Clubman", 1500, 102));
		
		System.out.println("\n1.-Coches de más de 100 cv de potencia:\n");
		
		LambdaUtils.printCoches(LambdaUtils.getCochesMas100(coches));
		
		System.out.println("\n2.-Coches de una marca y modelo:\n");
		
		LambdaUtils.printCoches(LambdaUtils.getCochesMarcaModelo(coches, "Nissan", "Qashqai"));
		
		System.out.println("\n3.-Media de los caballos de todos los coches:\n");
		
		System.out.println(LambdaUtils.getMediaPotencia(coches));
		
		System.out.println("\n4.-Cantidad de coches de una marca en concreto:\n");
		
		System.out.println(LambdaUtils.getCantidadMarca(coches, "Ford"));
		
		System.out.println("\n5.-Todos los coches diferentes de una marca:\n");
		
		LambdaUtils.printCoches(LambdaUtils.getDiferentesMarca(coches, "Audi"));
		
		System.out.println("\n6.-Primer coche de una marca:\n");
		
		System.out.println(LambdaUtils.getPrimeroMarca(coches, "Nissan"));
		
		System.out.println("\n7.-Último coche de una marca:\n");
		
		System.out.println(LambdaUtils.getUltimoMarca(coches, "Nissan"));
	}
}

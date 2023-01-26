package lambda_car_ex;

import java.util.ArrayList;
import java.util.Optional;
import java.util.OptionalDouble;

public class LambdaUtils {

	
	public static ArrayList<Coche> getCochesMas100(ArrayList<Coche> coches) {
		
		ArrayList<Coche> cochesMas100 = new ArrayList<>();
		
		coches.stream()
			.filter(c -> c.getPotencia() > 100)
			.forEach(c->cochesMas100.add(c));
		
		return cochesMas100;
		
	}
	
	
	public static ArrayList<Coche> getCochesMarcaModelo(ArrayList<Coche> coches, String marca, String modelo) {
		
		ArrayList<Coche> cochesMarcaModelo = new ArrayList<>();
		
		coches.stream()
			.filter(c -> c.getMarca().equalsIgnoreCase(marca))
			.filter(c -> c.getModelo().equalsIgnoreCase(modelo))
			.forEach(c->cochesMarcaModelo.add(c));
		
		return cochesMarcaModelo;
		
	}
	
	public static ArrayList<Coche> getDiferentesMarca(ArrayList<Coche> coches, String marca) {
		
		ArrayList<Coche> cochesDiferentesMarca= new ArrayList<>();
		
		coches.stream()
			.filter(c -> !c.getMarca().equalsIgnoreCase(marca))
			.forEach(c->cochesDiferentesMarca.add(c));
		
		return cochesDiferentesMarca;
		
	}
	
	public static Coche getPrimeroMarca(ArrayList<Coche> coches, String marca) {
		
		Optional<Coche> primeroMarca= coches.stream()
			.filter(c -> c.getMarca().equalsIgnoreCase(marca)).findFirst();
		
		return primeroMarca.isPresent() ? primeroMarca.get() : null;
		
	}
	
	public static Coche getUltimoMarca(ArrayList<Coche> coches, String marca) {
		
		Optional<Coche> primeroMarca= coches.stream()
			.filter(c -> c.getMarca().equalsIgnoreCase(marca)).reduce((first, second)->second);
		
		return primeroMarca.isPresent() ? primeroMarca.get() : null;
		
	}
	
	
	public static double getMediaPotencia(ArrayList<Coche> coches) {
		
		OptionalDouble media = coches.stream().mapToInt(c -> c.getPotencia()).average();
		
		return media.isPresent()? media.getAsDouble() : 0;
		
	}
	
	public static int getCantidadMarca(ArrayList<Coche> coches, String marca) {
		
		int cantidad = coches.stream().filter(c-> c.getMarca().equalsIgnoreCase(marca)).mapToInt(c -> 1).sum();
		
		return cantidad;
		
	}
	
	public static void printCoches(ArrayList<Coche> coches) {
		coches.forEach(c -> System.out.println(" -  " + c));
	}
	
	
}

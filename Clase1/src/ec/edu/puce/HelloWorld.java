package ec.edu.puce;

public class HelloWorld {
	
	public static void main(String[] args) {
		System.out.println("Hello world");
		IO.println("Alternativa a partir de la versión 25");
		
		int edad = 25;
		boolean mayorEdad = true;
		String nombre = "Mateo";
		
		System.out.println(edad);
		System.out.println(nombre);
		IO.println("La edad es: " + edad + " y su nombre es " + nombre);
		System.out.printf("La edad es: %d y su nombre es %s %n", edad, nombre);
		
		if (edad > 18) {
			IO.println("Mayor de edad");
			} else {
				IO.println("Menor de edad");
			}
						
	}

}

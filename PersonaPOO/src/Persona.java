
public class Persona {
	
	//Definir que atributos tendrá la clase
	String name = ""; //Cadena para el nombre. Inicializar en blanco
	int age = 0; //Entero para la edad. Inicializar en ceros
	
	
	//".this" es una variable de referencia en Java que hace referencia
	//al objeto actual
	
	public String saludar() { //Método para el saludo. Lo llamamos "saludar"
		return "Hola, soy " + this.name; //Imprimimos el nombre
	}
	
	public String miEdad () { //Método para la edad. Lo llamamos "miEdad"
		return "Mi edad es " + this.age + " años"; //Imprimimos la edad
	}
	}

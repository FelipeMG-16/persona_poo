
public class Persona {
	
	//Definir que atributos tendr� la clase
	String name = ""; //Cadena para el nombre. Inicializar en blanco
	int age = 0; //Entero para la edad. Inicializar en ceros
	
	
	//".this" es una variable de referencia en Java que hace referencia
	//al objeto actual
	
	public String saludar() { //M�todo para el saludo. Lo llamamos "saludar"
		return "Hola, soy " + this.name; //Imprimimos el nombre
	}
	
	public String miEdad () { //M�todo para la edad. Lo llamamos "miEdad"
		return "Mi edad es " + this.age + " a�os"; //Imprimimos la edad
	}
	}


public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Persona felipe = new Persona(); //Creamos una nueva persona
		felipe.name = "Felipe Maqueda"; //Agregamos un nombre
		felipe.age = 29; //Agregamos una edad
		System.out.println(felipe.saludar()); //Imprimimos el m�todo "saludar"
		System.out.println(felipe.miEdad()); //Imprimimos el m�todo "miEdad"
		
		
		Persona rogelio = new Persona(); //Creamos una nueva persona
		rogelio.name = "Rogelio"; //Agregamos un nombre
		rogelio.age = 23; //Agregamos una edad
		System.out.println(rogelio.saludar()); //Imprimimos el m�todo "saludar"
		System.out.println(rogelio.miEdad()); //Imprimimos el m�todo "miEdad"
	}
}

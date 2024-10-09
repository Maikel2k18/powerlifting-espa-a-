package Prognosis;

import java.util.Scanner;

public class jueces extends Persona {
	//scanner valido 
	Scanner scanner = new Scanner(System.in);
	int numero;
	
	//variables
	private boolean valido = true; 
	
	//constructor 
	public jueces(String nombre) {
		super(nombre);
	}
	//metodos 
	
	public boolean juzgarMovimiento() {
		int opcion; // variable apoyo para recursividad 
		
		//3 jueces 
		for (int i = 0; i<3;  i++) {
			System.out.println("Presione 1 si cree que el movimiento es valido o presione 0 si cree que es nulo : ");
			numero = numero + scanner.nextInt();
		}	
		//movimiento valido o nulo 
		if(numero == 2 || numero == 3) {
		System.out.println("el movimiento es valido ");
		}else if(numero == 0 || numero == 1 ) {
			valido = false ;
			System.out.println("el movimiento es nulo");
		}else {
			System.out.println("los numeros introducidos no son compatibles,\n Desea volver a juzgar, 1 = SI , 2 = NO");
			opcion  = scanner.nextInt();
			if (opcion == 1 ) {
				juzgarMovimiento();
			}else if (opcion ==  2 ) {
				System.out.println("el movimiento no se juzgara");
			}else {
				System.out.println("error");
			}
			
			
		}
		
		return valido;
	}
}

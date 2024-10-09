package Prognosis;



public class Persona {
	// pa q coño quiere persona un nombre
	
		protected String nombre;
		public Persona(String nombre) {
			this.nombre = nombre;
		}
		@Override
		public String toString() {
			return "nombre = " + nombre ;
		}
	
}

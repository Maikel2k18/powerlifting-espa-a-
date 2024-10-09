package Prognosis;

public class Participantes extends Persona {
	
	//variantes 
	private float bodyweight;
	private int numeroDeLote;
	private float mejorSqHistorica;
	private float mejorBpHistorica;
	private float mejorDlHistorica;
	private float mejorTotal;
	private float sentadillaCompeticion ;
	private float bancaCompeticion ;
	private float pesoMuertoCompeticion ;
	private float totalCompeticion ;
	private float intento ;
	private float subtotal;
	
	//constructor
	public Participantes(String nombre, float bodyweight, int numeroDeLote, float mejorSqHistorica,
			float mejorBpHistorica, float mejorDlHistorica, float mejorTotal,
			float sentadillaCompeticion, float bancaCompeticion, float pesoMuertoCompeticion, float totalCompeticion,
			float intento, float subtotal) {
		super(nombre);
		this.bodyweight = bodyweight;
		this.numeroDeLote = numeroDeLote;
		this.mejorSqHistorica = mejorSqHistorica;
		this.mejorBpHistorica = mejorBpHistorica;
		this.mejorDlHistorica = mejorDlHistorica;
		this.mejorTotal = mejorTotal;
		this.sentadillaCompeticion = sentadillaCompeticion;
		this.bancaCompeticion = bancaCompeticion;
		this.pesoMuertoCompeticion = pesoMuertoCompeticion;
		this.totalCompeticion = totalCompeticion;
		this.intento = intento;
		this.subtotal = subtotal;
	}

	@Override
	public String toString() {
		return "Participante " + super.nombre + " bodyweight=" + bodyweight + ", numeroDeLote=" + numeroDeLote + ", mejorSqHistorica="
				+ mejorSqHistorica + ", mejorBpHistorica=" + mejorBpHistorica + ", mejorDlHistorica=" + mejorDlHistorica
				+ ", mejorTotal=" + mejorTotal + ", sentadillaCompeticion="
				+ sentadillaCompeticion + ", bancaCompeticion=" + bancaCompeticion + ", pesoMuertoCompeticion="
				+ pesoMuertoCompeticion + ", totalCompeticion=" + totalCompeticion + ", intento=" + intento
				+ ", subtotal=" + subtotal ;
	}
	
	
}

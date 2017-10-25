package co.edu.logica;

public class TelefonoBasico implements TelefonoAbstracto {
	private int minutosOperador;
	
	public TelefonoBasico(int minutos) {
		minutosOperador=minutos;
	}

	
	public String enviar(int tiempoMin) {
		minutosOperador=minutosOperador-tiempoMin;
		return "Llamada realizada con minutos de operador";
	}

	
	public String recibir(int tiempoMin) {
		minutosOperador=minutosOperador+tiempoMin;
		return "Minutos de operador recargados ";
	}
	
	public String  mirarEstado(){
		return ("Minutos disponibles: " + minutosOperador);
	}

}

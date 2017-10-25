package co.edu.logica;

public class TelefonoBasico implements TelefonoAbstracto {
	private int minutosOperador;
	
	public TelefonoBasico(int minutos) {
		minutosOperador=minutos;
	}

	
	public String enviar(int tiempoMin) {
		minutosOperador=minutosOperador-tiempoMin;
		return "Se puede gastar minutos de operador";
	}

	
	public String recibir(int tiempoMin) {
		minutosOperador=minutosOperador+tiempoMin;
		return "Se puede recargar minutos de operador";
	}
	
	public String  mirarEstado(){
		return ("Minutos disponibles: " + minutosOperador);
	}

}

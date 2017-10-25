package co.edu.logica;

public class TelefonoConWiFi extends DecoradorTelefono {
	
	double bateriaCelular;
	
	public TelefonoConWiFi(TelefonoAbstracto telefono) {
		super(telefono);
		bateriaCelular=100;
	}
	
	public String enviar(int tiempoNavegacion) {
		bateriaCelular=bateriaCelular-tiempoNavegacion*0.04;
		return "Se puede enviar mensajes por wifi";
	}

	
	public String recibir(int tiempoNavegacion) {
		bateriaCelular=bateriaCelular-tiempoNavegacion*0.02;
		return "Se puede recibir mensajes por wifi";
	}

	public String mirarEstado() {
		return ("El estado de la batería es:" + bateriaCelular + telefono.mirarEstado());
	}

	
}

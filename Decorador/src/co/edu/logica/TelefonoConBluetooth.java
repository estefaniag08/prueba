package co.edu.logica;

public class TelefonoConBluetooth extends DecoradorTelefono {
	public double bateriaTelefono;
	public TelefonoConBluetooth(TelefonoAbstracto telefono) {
		super(telefono);
		bateriaTelefono=100;
		}
	
	public String enviar(int tiempoNavegacion) {
		bateriaTelefono=bateriaTelefono-tiempoNavegacion*0.03;
		return "Se puede enviar archivos por bluetooth";
		
	}

	public String recibir(int tiempoNavegacion) {
		bateriaTelefono=bateriaTelefono-tiempoNavegacion*0.02;
		return "Se puede recibir archivos por bluetooth";	
	}

	public String mirarEstado() {
		return ("El estado de la batería es:" + bateriaTelefono + telefono.mirarEstado());	
	}


}

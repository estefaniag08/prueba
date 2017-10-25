package co.edu.logica;

public class TelefonoConDatos extends DecoradorTelefono {
	double cantidadDatos;
	public TelefonoConDatos(TelefonoAbstracto telefono) {
		super(telefono);
		cantidadDatos=100;
	}

	public String enviar(int tiempoNavegacion) {
		cantidadDatos=cantidadDatos-tiempoNavegacion*0.05;
		return "Mensaje enviado por medio de datos";
	}

	public String recibir(int tiempoNavegacion) {
		cantidadDatos=cantidadDatos-tiempoNavegacion*0.02;
		return "Mensaje recibido por medio de datos";
	}

	public String mirarEstado() {
		return ("La cantidad de datos actual es de:" + cantidadDatos + telefono.mirarEstado() );
	}

}

package co.edu.logica;

public abstract class DecoradorTelefono implements TelefonoAbstracto {
	
	protected TelefonoAbstracto telefono=null;
	
	public DecoradorTelefono(TelefonoAbstracto telefono) {
		this.telefono = telefono;
	}
	
	public abstract String enviar(int opcion);
	public abstract String recibir(int opcion);
	public  abstract String mirarEstado();
	
	public String enviarB(int opcion){
		return telefono.enviar(opcion);
	}
	public String recibirB(int opcion){
		return telefono.recibir(opcion);
	}
}

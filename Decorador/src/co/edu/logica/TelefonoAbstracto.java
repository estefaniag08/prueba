package co.edu.logica;

public interface TelefonoAbstracto {
	
	public abstract String enviar(int opcion);
	public abstract String recibir(int opcion);
	public abstract String mirarEstado();
}

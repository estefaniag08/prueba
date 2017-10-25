package co.edu.logica;

public class GestorTelefono {
	private DecoradorTelefono nuevoTelefono=null;
	
	public DecoradorTelefono telefono(int opcion, TelefonoBasico telB){
		switch(opcion){
		case 1:
			nuevoTelefono = new TelefonoConBluetooth(telB);
			break;
		case 2:
			nuevoTelefono = new TelefonoConWiFi(telB);
			break;
		case 3:
			nuevoTelefono = new TelefonoConDatos(telB);
			break;
		default:
			break;
		}
		return nuevoTelefono;
	}
	
	public String realizarAccion(int opcion, int tiempo){
		if(opcion==1){
			return nuevoTelefono.enviarB(tiempo);
		} else{
			return nuevoTelefono.enviar(tiempo);
		}	
	}
}

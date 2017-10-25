package co.edu.logica;

public class Cliente {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		int opcion;
		int tiempoMinutos;
		GestorInformacion datos= new GestorInformacion();
		GestorTelefono gestionTelefono = new GestorTelefono();
		DecoradorTelefono telefono;
		TelefonoBasico telefonoB= new TelefonoBasico(100);
		
		datos.muestraTexto("Que tel�fono desea?");
		datos.muestraTexto("1. Telefono B�sico + Bluetooth");
		datos.muestraTexto("2. Telefono B�sico + Wi-Fi");
		datos.muestraTexto("3. Telefono B�sico + Datos M�viles");
		opcion= datos.leerInt();
		
		telefono= gestionTelefono.telefono(opcion, telefonoB);
		
		datos.muestraTexto("Que accion desea realizar con el telefono?");
		datos.muestraTexto("1. Llamar");
		datos.muestraTexto("2. Funcionalidad a�adida");
		opcion= datos.leerInt();
		
		datos.muestraTexto("Cu�nto tiempo desea usar el servicio?");
		tiempoMinutos= datos.leerInt();
		
		datos.muestraTexto("Accion realizada: " + gestionTelefono.realizarAccion(opcion, tiempoMinutos));
		datos.muestraTexto("Estadisticas: " + telefono.mirarEstado());	
	}

}

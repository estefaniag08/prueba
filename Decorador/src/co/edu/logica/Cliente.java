package co.edu.logica;

public class Cliente {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		
		int opcion;
		int tiempoMinutos;
		GestorInformacion datos= new GestorInformacion();
		GestorTelefono gestionTelefono = new GestorTelefono();
		DecoradorTelefono telefono;
		TelefonoBasico telefonoB= new TelefonoBasico(100);
		
		datos.muestraTexto("Que teléfono desea?");
		datos.muestraTexto("1. Telefono Básico + Bluetooth");
		datos.muestraTexto("2. Telefono Básico + Wi-Fi");
		datos.muestraTexto("3. Telefono Básico + Datos Móviles");
		opcion= datos.leerInt();
		
		telefono= gestionTelefono.telefono(opcion, telefonoB);
		
		datos.muestraTexto("Que accion desea realizar con el telefono?");
		datos.muestraTexto("1. Llamar");
		datos.muestraTexto("2. Funcionalidad añadida");
		opcion= datos.leerInt();
		
		datos.muestraTexto("Cuánto tiempo desea usar el servicio?");
		tiempoMinutos= datos.leerInt();
		
		datos.muestraTexto("Accion realizada: " + gestionTelefono.realizarAccion(opcion, tiempoMinutos));
		datos.muestraTexto("Estadisticas: " + telefono.mirarEstado());	
	}

}

package videojuego.ingesoft.utp;

public class Jefe extends Enemigo{
	
	public int cambioDeFase(int etapa) {
		etapa = getExperiencia() + etapa;
		return etapa;
	}

}

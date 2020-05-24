package videojuego.ingesoft.utp;

public class Esbirro1 extends Esbirro{
	
	public int ataqueADistancia(Jugador jugador, int daño) {
		jugador.atacar(daño, jugador);
		this.experiencia ++;
		return experiencia;
	}
}

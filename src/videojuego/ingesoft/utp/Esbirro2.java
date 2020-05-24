package videojuego.ingesoft.utp;

public class Esbirro2 extends Enemigo{
	
	public int ataqueAMele(Jugador jugador, int daño) {
		jugador.atacar(daño, jugador);
		this.experiencia++;
		return experiencia;
	}

}

//clase Tanque hereda de clase Personaje
public class Tanque extends Personaje 
{
	//declaro la variable escudo activado
	private boolean escudo_activado;
	
	//creo el metodo escudo_activado retornando la variable establecida anteriormente
	boolean escudo_activado()
	{
		return escudo_activado;
	}
	// declaro que Tanque tendra como parametros vida y ataque (se heredan de la clase Personaje 
	Tanque(int vida, int ataque, boolean escudo_activado) 
	{
		//por medio del super se mandan a llamar las variables vida y ataque establecidas en la clase Personaje
		super(vida, ataque);
	}
	
	//creo el metodo poder especial que se hereda de la clase Personaje y la sobrescribe
	void poderEspecial()
	{
		//el poder especial asigna escudo_activado como true 
		escudo_activado = true;
	}
}

//clase Arquero hereda de clase Personaje
public class Arquero extends Personaje
{
	// declaro variable flechas
	private int flechas;
	
	int flechas()
	{
		return flechas;
	}
	
	// declaro que Arquero tendra como parametros vida y ataque (se heredan de la clase Personaje 
	Arquero(int vida, int ataque) 
	{
		//por medio del super se mandan a llamar las variables vida y ataque establecidas en la clase Personaje
		super(vida, ataque);
	}
	
	//creo el metodo poder especial que se hereda de la clase Personaje
	void poderEspecial()
	{
		flechas = flechas+5;
	}
	
}

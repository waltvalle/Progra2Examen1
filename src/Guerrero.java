//clase Guerrero hereda de clase Personaje
public class Guerrero extends Personaje
{
	
	// declaro que Guerrero tendra como parametros vida y ataque (se heredan de la clase Personaje 
	Guerrero(int vida, int ataque) 
	{
		//por medio del super se mandan a llamar las variables vida y ataque establecidas en la clase Personaje
		super(vida, ataque);
	}
	
	//creo el metodo poder especial que se hereda de la clase Personaje y la sobrescribe 
	void poderEspecial()
	{
		//esto es lo que hace la el metodo poderEspecial de Guerrero
		vida = vida/2;
		ataque = ataque*2;
	}

}

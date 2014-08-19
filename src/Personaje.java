
// Utilice como guia mi propia tarea : https://github.com/waltvalle/Progra2Tarea3/tree/master/src
public class Personaje 
{
	//creo las variables vida y ataque
	protected int vida;
	protected int ataque;
	static int personajes_creados = 0;
	
	
	//defino vida y ataque como parametros de Personaje y cada vez que se manda a llamar este metodo se suma 1 a la cuenta de personajes creados
	Personaje(int vida, int ataque){
		this.vida = vida;
		this.ataque = ataque;
		personajes_creados = personajes_creados + 1;
	}

	//establezco el get de vida retornando lo que tenga la variable vida
	int getVida()
	{
		return vida;
	}
	
	//establezco el get de ataque retornando lo que tenga la variable ataque
	int getAtaque()
	{
		return ataque;
	}
	
	//ahora el set de vida declarando que la variable vida se igualara a la variable establecida como parametro
	void setVida(int vida)
	{
		this.vida = vida;
	}
	
	//ahora el set de vida declarando que la variable ataque se igualara a la variable establecida como parametro
	void setAtaque(int ataque)
	{
		this.ataque = ataque;
	}
	
	//creo el metodo poderEspecial
	void poderEspecial(){
		
	}

}

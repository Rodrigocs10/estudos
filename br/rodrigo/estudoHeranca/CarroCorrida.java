package br.rodrigo.estudoHeranca;

/** Carro de corrida*/
public class CarroCorrida{

	public CarroCorrida(float velocidade){
		this.velocidade = velocidade;
}

	private float velocidade;

	public float getVelocidade(){
		return this.velocidade;
}
	public void setVelocidade(float velocidade){
		this.velocidade = velocidade;
}

}

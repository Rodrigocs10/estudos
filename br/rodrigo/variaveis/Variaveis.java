package br.rodrigo.variaveis;

/** Estudo de declaração de variáveis. Objetivo de fixar
a informação de que a variável pode começar com _ e $*/
public class Variaveis{

public Variaveis(){
 this.$valor = 12.01f;
}

// Copiou idéia do PHP? :)
private float $valor;

private int _quantidade;

public float $altura;
public int _chamadas;
public String  _valores;





public float get$Valor	(){
	return this.$valor;
}
public void set$Valor(float $valor){
	this.set$Valor(this.$valor = $valor);
}

public int get_Quantidade(){
	return this._quantidade;
}
public void set_Quantidade(int _quantidade){
	this._quantidade = _quantidade;
}


/*
	Char é na verdade um tipo inteiro. Então qualque tipo de inteiro pode armazenar um char.
	Mas para nao dar problema tem que armazenar com tamanho a partir de int que é: int, long, float, double
*/
public int getChar(){

	int x = 'a';
	return x;
}

}

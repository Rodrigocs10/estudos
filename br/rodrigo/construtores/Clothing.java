package br.rodrigo.construtores; 

public class Clothing{
	Clothing(){
		System.out.println("Construtor sem argumentos que deve ser declarado ou declardo implicitamente pelo java");
	} // Este construtor é obrigatório declarar. Senão dá erro em TShirt porque Tshirt o chama com super()
	Clothing(String s){}
}

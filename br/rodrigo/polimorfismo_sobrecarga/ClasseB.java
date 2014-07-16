package br.rodrigo.polimorfismo_sobrecarga;



public class ClasseB extends ClasseA implements InterfaceB{

	public void andar(){
		System.out.println("Andando com implementação de Classe B...");
	}

	public void correr(){
		super.correr();
		System.out.println("Correndo com implementação de Classe B...");
	}

	/* Aqui está sobrecarregando e não obrescrevendo */
	private void correr(int metros){
		System.out.println("Correndo por " + metros + " metros...");
	}

	public void correr(int metros, String direcao){
		this.correr(100);
		System.out.println("\tNa direção " + direcao);
	}

	/* Exceção lançada na nobrescrita do método, pode ser uma subclasse do método sobrescrito */
	public void dividirNumero(int a, int b) throws ArithmeticException{
			System.out.println(a/b);
	}
	
}

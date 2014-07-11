package br.rodrigo.classes;

/** deve ter o nome do arquivo */
public class Public{

public Public(){
	this.valor = 12.5f;
	NomeDiferenteArquivo n = new NomeDiferenteArquivo();
	System.out.println(n.nome);
	MaisDeUma m = new MaisDeUma();
	System.out.println(m.nome);
	
	DiferenteDoArquivo d = new DiferenteDoArquivo();

}

private float valor;

public float getValor(){
	return this.valor;
}
public void setValor(float valor){
	this.valor = valor;
}

}

/** Classe que nome pode ser diferente do arquivo porque não é publica .
  --- Observação. Sem modificador significa que a classe tem acesso package. Apenas classes dentro do pacote podem acessá-la
*/ 
class NomeDiferenteArquivo{

	public 	NomeDiferenteArquivo(){
		this.nome = "Nome diferente do arquivo";
}

public String nome;

}

/** Pode haver mais de uma classe não pública em um arquivo .java. Mas só pode havar um public */
final class MaisDeUma{
	public MaisDeUma(){
		nome = "Mais de uma";
}
	public String nome;
}

/** private Class ClassePrivada{
        ^
br/rodrigo/classes/Public.java:49: class, interface, or enum expected

 - - ---	Não existe classe privada - --- -- -
*/
/*private Class ClassePrivada{
	public ClassePrivada(){
	System.out.println("Classe privada");
	}
}*/

/**
	Classe que tenta extender classe final. Não podemos extender de classe final
*/
//class MaisDeDuas extends MaisDeUma{}
/*
cannot inherit from final br.rodrigo.classes.MaisDeUma
class MaisDeDuas extends MaisDeUma{} */

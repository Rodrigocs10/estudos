package br.rodrigo.declarandoArrays;

/* Várias formas de declarar Arrays */
public class Arrays{

	// Apenas variável foi declarada. Objeto não foi instanciado
	// E como é uma variável de instância, ela é inicializada
	// com null
	public int[] quantidades;

	/* Objeto criado, mas elementos do array não iniciados
		explicitamente.		
	*/
	public int[] valores = new int[10];

	/* Causa erro de compilação:  array dimension missing
		É obrigatório declarar a dimensão de um array
	*/
	//public int[] somas = new int[];

	/* Anonymous Array
		Observação: Permitido comando de inicialização de variávei
		mesmo fora de um bloco
	*/
	public String[] processos = new String[] {"Processo A", "Processo B"};
	
	/* Declarando, construindo e inicializando em uma linha
	*/
	public float[] salarios = {12.3f, 15.2f, 15.6f};
	public float[][] salariosPessoas = {{10f,2f}, {1f, 12.3f}};
	
	public String[] nomes = new String[10];
	{
		nomes[0] = "Rodrigo";
		nomes[1] = "Bruna";
	}


}

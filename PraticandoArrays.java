public class PraticandoArrays{

	public static void main(String args[]){
		// Iniciar um array de inteiros de 3 formas diferentes
		//int[] a = new int[]; // erro. Array dimension missing
		int [] b = new int[10];
		b[0] = 1;
		b[1] = 2;
		System.out.println(b[0]);

		double[][] c = {{1}, {'2'}, {3}};
		System.out.println();
		for(double[] aux:c){
			for(double aux2: aux){
				System.out.println(aux2);
			}
		}

		long[] valores = {40000, 40000, 30000, 10000};
		for(long l: valores){
			System.out.println(l);
		}

		// Iniciar um array de strings de 3 formas diferentes
		String[] stra;
		stra = new String[10];
		stra[0] = "Teste";
		stra[1] = " de";
		stra[2] = " apresentação";
		stra[3] = " !";
		System.out.println(stra[0] + stra[1] + stra[2]);

		String[] strb = {"Teste", " de", " apresentação", " !"};
		System.out.println(strb[0] + strb[1] + strb[2]);
		
		String strc[] = new String[]{"teste", " teste2", " teste3"}		;
		for(String aux: strc){
			System.out.println(aux);
		}
	
		// Associar arrays a tipos didferentes de inteitos
		long[] l1;
		char[] c1;
		
		// Associas arrays a tipos diferentes de ponto flutuante
		float[] f1;
		double[] d1;
		//d1 = f1; erro de compilação 
		
		
			
	}
}

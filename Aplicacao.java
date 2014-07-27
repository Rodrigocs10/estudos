//import br.rodrigo.Dispositivo;
//import br.rodrigo.processos.Produtor;
//import br.rodrigo.estudoHeranca.CarroCorrida;
//import br.rodrigo.estudoHeranca.CarroCorridaEspecializado;
//import br.rodrigo.variaveis.Variaveis;
//import br.rodrigo.classes.Public;
//import br.rodrigo.interfaces.Corsa;
//import br.rodrigo.interfaces.CorsaSedan;
//import br.rodrigo.fixacao.ClasseB;
//import br.rodrigo.fixacao.outroPacote.ClasseC;
//import br.rodrigo.variaveis.Variaveis;
//import br.rodrigo.polimorfismo_sobrecarga.ClasseA;
//import br.rodrigo.polimorfismo_sobrecarga.ClasseB;
//import br.rodrigo.cores.Cores;
//import br.rodrigo.tiposRetorno.TipoA;
//import br.rodrigo.tiposRetorno.TipoB;
import br.rodrigo.declarandoArrays.Arrays;

public class Aplicacao{
	public static void main(String args[]){

		Arrays array = new Arrays();
		System.out.println(array.quantidades);

		/* Escrevendo valores de membro array
			Como os elementos individuais de cada posição
			não foram declaradas, serão todos iniciados com
			valor padrão. int -> 0
		*/
		for(int x:array.valores){
			System.out.println("Valor: " + x);
		}

		/* Escrevedo arry inicializado como Anonymous Array
		*/
		for(String s:array.processos){
			System.out.println(s);
		}
		
		/* Salários*/
		for(float s:array.salarios){
			System.out.println(s);
		}
	
		/* Escrevendo array bidimensional */
		for(float[] salarios: array.salariosPessoas){
			for(float pessoa:salarios){
				System.out.println("Salário " + pessoa);
			}
		}
		
		for(String s: array.nomes){
			if(s != null){
				System.out.println(s);
			}
		}
	}
}	


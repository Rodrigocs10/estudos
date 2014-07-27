package br.rodrigo.wrappers;

public class Wrappers{
	public void treinarConstrutores(){
		float f = new Float("1.2f");		
		Float f2 = new Float(1.5f);
		float f3 = new Float("1.2f");

		System.out.println(f + f2 + f3);

		int i1 = new Integer(1);
		int i2 = new Integer("2");
		Integer i3 = new Integer(3);

		System.out.println(i1 + i2 + i3);

		// Convertendo binario para inteiro
		System.out.println(Integer.valueOf("1010110", 2));

		// String é trucando para caber em um float
		float f4 = Float.valueOf("12.332323434343423423423423f");
		System.out.print(f4);
		System.out.println(" // Valor truncado");

		char c1 = new Character('a');
		//char c2 = new Character(95); // Não existem este construtuor em Character
		// alternativa:
		char c2 = 95;
		Character c3 = new Character('b');
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		Boolean b1 = new Boolean(true);
		Boolean b2 = new Boolean("false");
		Boolean b3 = new Boolean("qualquercoisa"); // qualquer coisa que não seja "true" é false no construtor com string

		System.out.println("Boolean " + b1);
		System.out.println("Boolean " + b2);
		System.out.println("Boolean " + b3);

	}

	public void treinarValueOf(){	
		System.out.println(Integer.valueOf("23"));

		/* Dá erro em tempo de compilação. NumberFormatException */
		System.out.println(Integer.valueOf("2"));
		
		/* Não dá certo. Por que?? . Provavelmente é porque um hexadecimal não cabe
			em um tipo Integer*/
		//System.out.println(Integer.valueOf("0x342", 16));
		System.out.println(Integer.valueOf("02343", 8));
		
		System.out.println(Character.valueOf('B'));
		System.out.println(Byte.valueOf("011", 2));

		// Não existe esta assinatura para tipo Double e nem float
		//System.out.println(Double.valueOf("03434", 8));
		//1System.out.println(Float.valueOf("03434", 8));
	}

	/* Métodos usados para converter de wrapper para valor primitivo */
	public void treinarxxxValue(){
		int x = 10;
		Integer y = 5;
		String str = "palavra";

		/* Este método é usado para converter de wrapper para
			primitive. Então da forma abaixo o autoboxing não funciona
			pois não faria sentido */
		//System.out.println(x.byteValue());
		
		System.out.println(y.byteValue());
		System.out.println(y.doubleValue());
		System.out.println(y.floatValue());
	
	}

	/* Método estático usado para converter de uma representação string
		do tipo para seu tipo wrapper */
	public void treinarParseXxx(){
		Integer x = 12;
		Integer y = 15;
		Double d = 12.4;		
		
		// Não existe este asinatura
		//System.out.println(x.parseInt(x));
		
		// Funciona como um método estático sendo chamado em um objet
		System.out.println(d.parseDouble("110"));

		// Mas o mais lógico é chamar usando o nome da classe
		System.out.println(Double.parseDouble("12.1"));

		// Não existe esta assinatura:
		//System.out.println(Double.parseDouble(02232, 8));
	}

	public void treinarToString(){
		Integer x = 10;
		Integer y = 2;
		Double z = 23.0;
		Long l = 23l;

		System.out.println(Integer.toString(x));
		System.out.println(Integer.toHexString(x));
		// Sai em formato estrainho. O que quer dizer ??
		System.out.println(Double.toHexString(z));
		System.out.println(Long.toHexString(l));

	}















}

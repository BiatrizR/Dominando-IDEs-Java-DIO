package dio.me;

/*import da classe gato*/ 

import dio.me.model.Gato;

public class PrimeiroPrograma {

	public static void main(String[] args) {
		
		Gato gato = new Gato();
		Livros livros = new Livros();
		
		 System.out.println(gato);
		 System.out.println(livros);
		
		/*int a = 3;
		  int b = 4;
	 System.out.println("Hello World! " + (a + b));*/

	}

}


class Livros {
	private String autor;
	private String titulo;
	private String npsgs;
}

package be.com.alura.ExercicioThread02;

public class RespostaMain {

	public static void main(String[] args) {

		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {

				System.out.println("Hello world");

			}
		});

		thread.start();

		/**
		 * OPINIAO DO INSTRUTOR:
		 * 
		 * 
		 * Devemos ter cuidado com as classes anônimas pois podem dificultar a leitura.
		 * 
		 * Além disso, como o compilador realmente gera uma classe, essa classe, de
		 * fato, existe quando é executada. Isso pode ser mais difícil de se entender
		 * quando recebemos uma exceção ou depuramos o código pois a classe não está
		 * presente no nosso código fonte.
		 * 
		 */

	}

}

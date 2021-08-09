package br.com.alura.Exerciciothreads;

public class RespostaRunnable {
	
	public static void main(String[] main) {
		
		Runnable tarefa = new ImprimaString();
		
		Thread threadTarefa = new Thread(tarefa, "Imprindo uma resposta");
		threadTarefa.start();
		
		
		
		
	}

}

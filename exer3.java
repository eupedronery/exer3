package SO;

public class exer3 extends Thread{
	private int vlr_num;
	private int[] vetor;
	
	public exer3(int[] vetor, int valor) {
		this.vlr_num = valor;
		this.vetor = vetor;
	}
	
	public void run() {
		double elapsed_time;
		
		if( (vlr_num % 2) == 0 ) {
			double start_time = System.nanoTime();
			for(int i = 0; i < vetor.length; i++);
				elapsed_time = (System.nanoTime() - start_time) / Math.pow(10, 9);
				System.out.printf("Número Par - Tempo: %f segundos.\n", elapsed_time);
		}
		
		else {
			double start_time = System.nanoTime();
			for(int i : vetor);
				elapsed_time = (System.nanoTime() - start_time) / Math.pow(10, 9);
				System.out.printf("Número Ímpar - Tempo: %f segundos.\n", elapsed_time);
		}
	}
}

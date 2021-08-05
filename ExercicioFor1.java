package ExerciciosListaForWhileDoWhile;

public class ExercicioFor1 {

	public static void main(String[] args) throws InterruptedException {
		
		
		for(int i=1000; i < 2000; i++) {
			if (i%11==5) {
				System.out.println(i);
				Thread.sleep(250);
			}
		}

	}

}

package view;
import controller.FatorialControle;

public class Principal {

	public static void main(String arqs[]) {
		FatorialControle FC = new FatorialControle();
		
		int N = 5;
		System.out.println("O valor do fatorial de "+N+" é: "+FC.Fat(N));
	}

}

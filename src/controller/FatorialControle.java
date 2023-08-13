package controller;

public class FatorialControle {
	
	public FatorialControle() {
		super();
	}

	public int Fat(int N) {
		//Condição de parada-> Quando N é 1, pois o fatorial de 1 é 1
		if (N<2)
		{
			return 1;
		}
		else
		{
			/*A função é chamada através da multiplicação do valor de N pelo fatorial calculado até o momento,
			com o indicador do fatorial a ser calculado N subtraindo 1 a cada chamada*/
			int fatorial = N * Fat((N-1));
			return fatorial;
		}
	}

}

package controller;

public class FatorialControle {
	
	public FatorialControle() {
		super();
	}

	public int Fat(int N) {
		//Condi��o de parada-> Quando N � 1, pois o fatorial de 1 � 1
		if (N<2)
		{
			return 1;
		}
		else
		{
			/*A fun��o � chamada atrav�s da multiplica��o do valor de N pelo fatorial calculado at� o momento,
			com o indicador do fatorial a ser calculado N subtraindo 1 a cada chamada*/
			int fatorial = N * Fat((N-1));
			return fatorial;
		}
	}

}

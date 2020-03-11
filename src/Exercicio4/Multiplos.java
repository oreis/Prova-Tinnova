package Exercicio4;

public class Multiplos {

    private static int somaMultiploTres;
	public static void main(String[] args) {
        int numeroTres = 3;
        int numeroCinco = 5;
        setSomaMultiploTres(0);
        int resultado = 0;

        for(int i = 0; i < 10; i++) {
            if((i%numeroTres == 0)||(i%numeroCinco == 0))
                resultado += i;     

            if((i%numeroTres == 0)&&(i%numeroCinco == 0))
                resultado += i;
        }
        
        System.out.println("A soma dos multiplos de 3 e 5 abaixo de 10, é: " +resultado);
    }

	public static int getSomaMultiploTres() {
		return somaMultiploTres;
	}

	public static void setSomaMultiploTres(int somaMultiploTres) {
		Multiplos.somaMultiploTres = somaMultiploTres;
	}
}
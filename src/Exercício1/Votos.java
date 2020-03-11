package Exercício1;

public class Votos {

    private static Double validos = (double) 800;

    private static Double brancos = 150.0;

    private static Double nulos = 50.0;
    
    private static Double total = 1000.0;

    public static void main(String[] args) {
        
        System.out.println("votos validos: "+String.valueOf(percentualVotosValidos())+" % ");
        System.out.println("votos em brancos: "+String.valueOf(percentualVotosBrancos())+" % "); 
        System.out.println("votos nulos: "+String.valueOf(percentualVotosNulos())+" % ");
         
    }

    private static int percentualVotosNulos() {
		
    	return (int) Math.round((nulos / total) * 100);
	}

	private static int percentualVotosBrancos() {
		
		return (int) Math.round((brancos / total) * 100);
	}

	private static int percentualVotosValidos() {
        
		return (int) Math.round((validos / total) * 100);

    }    

}

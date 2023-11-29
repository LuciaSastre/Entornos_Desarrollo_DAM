package Ud2;

/*
 * Escriba las tablas de multiplicar del 0 al 10 
 */
public class exPaul {

	public static void main(String[] args) {
		
		for (int i = 0; i < 11; i++) {
			for (int j = 0; j < 11; j++) {
				System.out.println(i + "x" + j + "=" + i * j);
			}
		}

	}
}

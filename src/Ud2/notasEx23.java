package Ud2;
/*
 *  23. Que solicite la media de X números, se dejarán de solicitar números hasta que se introduzca el cero.
 */
import java.util.Scanner;

public class notasEx23 {

	public static void main(String[] args) {
		
		// Inicializamos el acumulador
		double acum = 0;
		// Inicializamos contador
		double cont = 0;
		// Usamos un booleano
		boolean salir = false;
		//ponemos la condición
		while (!salir)   
		{
			
			Scanner sc = new Scanner (System.in);
			System.out.println("Mete un número: ");
			double numero = sc.nextDouble();
			if( numero != 0) {
				acum = acum + numero;
				cont++;
			}
			else {
				salir = true;
			}
		}

		if (cont == 0) {
			System.out.println("FIN DEL PROGRAMA");
		}
		else {
			double media = acum / cont;
			System.out.println(" La nota media es igual: " + media);
		}
		
		
		
		
	}

}

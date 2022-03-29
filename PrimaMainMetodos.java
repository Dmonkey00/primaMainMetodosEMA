import java.util.Scanner;

/**
 * <h1>Problema de las primas</h1>
 * Este programa, mediante la introducción manual de 
 * los parámetros nombre, número de empleado 
 * y si el empleado es o no es directivo según 
 * se pidan, genera automáticamente el tipo de prima
 * que le corresponde a cada uno, pudiéndose generar para 
 * varios en sucesión.
 * 
 * @version 1.0
 * @since <a href="https://en.wikipedia.org/wiki/Portal:Current_events/2022_March_29">29/03/2022</a>
 * @author <big><h1><strong><em><a style="color:magenta;" href="https://www.youtube.com/watch?v=dQw4w9WgXcQ">Elena</a></em></strong></h1></big>
 */

public class PrimaMainMetodos {
	
/**
 * Variable estática para la entrada de datos por teclado.
 */
	static Scanner  teclado=new Scanner(System.in);
/**
 * Muestra en pantalla los datos del empleado y la prima que le 
 * corresponde, y pregunta si se quiere calcular una prima nueva.
 * 
 * @param args Los argumentos del programa.
 */
	public static void main(String[] args) {

		int numEmple;
		String nomEmple;
		int meses;
		char esDirectivo;
		char respuesta;
		

		do {
			System.out.println("\nDATOS  EMPLEADO/A");
			numEmple=leerNumEmple();
			nomEmple=leerNomEmple();
			meses=leerMeses();
			esDirectivo=leerEsDirectivo();
			System.out.println("\n\tLe corresponde la prima "+hallarPrima(esDirectivo, meses));
			
			
			System.out.println("\nÂ¿CALCULAR MAS PRIMAS? (S/N): ");
			respuesta=teclado.nextLine().toUpperCase().charAt(0);
		}while(respuesta=='S');		
	}

/**
 * Calcula la prima del empleado, teniendo en cuenta los meses que lleva
 * en la empresa y si es o no es directivo.
 * @param esDirectivo mediante + o - se indica si es directivo.
 * @param meses los meses que el empleado lleva contratado.
 * @return "P1" La prima numero 1
 * <p/>"P2" La prima numero 2
 * <p/>"P3" La prima numero 3
 * <p/>"P4" La prima numero 4
 */
	public static String hallarPrima(char esDirectivo, int meses) {
		if(esDirectivo=='+') // ES DIRECTIVO
			if(meses>=12)
				return "P1";
			else
				return "P3";
		else 	// NO ES DIRECTIVO
			if(meses>=12)
				return "P2";
			else
				return "P4";
	}
	
/**
 * Pide que se introduzca el número de empleado, que debe estar entre 100 y 999,
 * y lo guarda.
 *
 * @return numEmple el número del empleado.
 */
	public static int leerNumEmple() {		
		int numEmple;
		do{
			System.out.println("NÃšMERO [100-999]: ");
			numEmple = teclado.nextInt();
		}while(numEmple<100 || numEmple>999);		
		teclado.nextLine();
		return numEmple;
	}
	
/**
 * Pide que se introduzca el nombre del empleado, que debe tener como máximo 10 
 * caracteres, y lo guarda.
 * 
 * @return nomEmple el nombre del empleado.
 */
	public static String leerNomEmple() {
		String nomEmple;
		do {
			System.out.println("NOMBRE (max 10 caracteres): ");
			nomEmple = teclado.nextLine();
		}while(nomEmple.length()>10);		
		return nomEmple;
	}
	
/**
 * Pide que se introduzca el número de meses que el empleado lleva contratado, 
 * y lo guarda.
 * 
 * @return meses el numero de meses.
 */
	public static int leerMeses() {
		int meses;
		do {
			System.out.println("MESES DE TRABAJO: ");
			meses = teclado.nextInt();
		}while(meses<0);
		teclado.nextLine();
		return meses;
	}
	
/**
 * Pregunta al usuario si el empleado es o no directivo. Se debe responder 
 * con + o - únicamente. Guarda la respuesta.
 * 
 * @return esDirectivo la respuesta a la pregunta de si es directivo o no.
 */
	public static char leerEsDirectivo() {
		char esDirectivo;
		do {
			System.out.println("Â¿ES DIRECTIVO? (+/-): ");
			esDirectivo = teclado.nextLine().charAt(0);
		}while(esDirectivo!='+' && esDirectivo!='-');
		return esDirectivo;
	}
}

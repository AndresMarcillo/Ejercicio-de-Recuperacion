package ec.edu.ister.modelo;
import java.io.*;

/**
 *
 * @author Andres
 */
class DiaAnyo{ //Iniciamos una clase llamada DiaAnyo
    private int mes; //Declaramos el atributo mes del tipo private
    private int dia; //Declaramos el atributo dia del tipo private
	 
    public DiaAnyo(int d, int m){ //Inicializamos el constructor
        dia=d; //Agregamos los valores de la variable d a la variable dia
        mes=m; //Agregamos los valores de la variable m a la variable mes
    } // Fin del constructor
    public boolean igual(DiaAnyo d){ //Este metodo del tipo boolean muestra en pantalla el mes y el dia
        if((dia == d.dia) && (mes == d.mes)) //En este if se compara si las variables ingresadas son inguales 
            return true;//Devuelve un valor verdadero si la condicion se cumple
        else
            return false;//Devuelve un valor falso si la condicion no se cumple
	} //Fin del metodo igual
    public void visualizar(){ //Este metodo nos permite visualizar en consola los datos de las variables
	System.out.println("mes= " + mes + " , dia= " + dia);
    } // Fin del metodo visualizar
} // Fin de la clase DiaAnyo

public class Cumple{ //Esta es la clase principal ya que contiene el main
	public static void main(String[] ar) throws IOException{ //El main permite inicializar el programa
		DiaAnyo hoy; //Declaramos una variable del tipo DiaAnyo con el nombre hoy
		DiaAnyo cumpleanyos; //Declaramos una variable del tipo DiaAnyo con el nombre cumpleanyos
		int d,m; //declaramos dos variables del tipo entero
		BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in)); //Mediante la clase BufferedReader podemos ingresar datos por consola y lo almacenamos en una variable llamada entrada
		System.out.print("Introduzca fecha de hoy, dia: "); //Ingresamos el dia de hoy
		d=Integer.parseInt(entrada.readLine()); //Almacenamos el valor a ingresar en la variable d mediante un casting
		System.out.print("Introduzca el numero del mes: "); //Ingresamos el mes en que estamos
		m=Integer.parseInt(entrada.readLine()); //Almacenamos el valor a ingresar en la variable m mediante un casting
		
		hoy = new DiaAnyo(d,m); // Hacemos un llamado a la variable hoy
		
		System.out.print("Introduzca la fecha de nacimiento, dia: "); // Introducimos la fecha de nacimiento 
		d=Integer.parseInt(entrada.readLine());
		System.out.print("Introduzca el numero del mes: "); // Introducimos el mes
		m=Integer.parseInt(entrada.readLine());
		
                cumpleanyos = new DiaAnyo(d,m); // Hacemos un llamado a la variable cumpleanyos 
		
		System.out.print(" La fecha de hoy es: "); 
		hoy.visualizar(); // Vamos a visualizar los datos contenidos en la variable hoy mediante el metodo visualizar
		System.out.print(" Su fecha de nacimiento es: ");
		cumpleanyos.visualizar(); // Vamos a visualizar los datos contenidos en la variable hoy mediante el metodo visualizar
		
		if(hoy.igual(cumpleanyos)) //Hacemos una comparacion si la fecha ingresada es igual a la fecha del cumpleaños
			System.out.println(" Feliz Cumpleaños ! "); //Si es igual se despliega un mensaje de feliz cumpleaños
		else
			System.out.print(" Feliz dia ! "); // SIe es falso se desplegara un mensaje de Feliz dia
	} //Fin del metodo principal
} //Fin de la clase

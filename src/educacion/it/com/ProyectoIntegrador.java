package educacion.it.com;

import java.util.Random;
import java.util.Scanner;

public class ProyectoIntegrador {

	public static void main(String[] args) {
		
		/*
		
		Scanner tecladoGus = new Scanner(System.in);

		String userIngresado;
		String accesoUser;
		String passwordIngresada;
		String accesoPassword;
		int token;
		int intentosRest = 0;
		
		Random nroRd = new Random();
		int aleatorio = nroRd.nextInt(1000000);
		
		do {
		
		System.out.println("Bienvenido al Sistema su clave token para iniciar sesion es: " + aleatorio);
		System.out.println("Ingrese nombre de Usuario: ");
		userIngresado = tecladoGus.next();
		System.out.println("Ingrese la contraseña: ");
		passwordIngresada = tecladoGus.next();
		System.out.println("Ingrese la clave Token: ");
		token = tecladoGus.nextInt();
		accesoUser = "administrador";
		accesoPassword = "administrador.1234";
		
		intentosRest++;
		
		}while(intentosRest < 3);
		
		if (userIngresado.equalsIgnoreCase(accesoUser) && passwordIngresada.equals(accesoPassword)
				&& aleatorio == token) {
			System.out.println("Bienvenido al Sistema");
		} 
		else {
			System.out.println("Credenciales Incorrectas");
		}	
		
		*/
	
		Scanner tecladoGus = new Scanner(System.in);

		String userIngresado;
		String accesoUser;
		String passwordIngresada;
		String accesoPassword;
		int token;
		int intentosRest = 3;

		Random nroRd = new Random();
		int aleatorio = nroRd.nextInt(1000000);

		do {

			System.out.println("Bienvenido al Sistema su clave token para iniciar sesion es: " + aleatorio);
			System.out.println("Ingrese nombre de Usuario: ");
			userIngresado = tecladoGus.next();
			System.out.println("Ingrese la contraseña: ");
			passwordIngresada = tecladoGus.next();
			System.out.println("Ingrese la clave Token: ");
			token = tecladoGus.nextInt();
			accesoUser = "administrador";
			accesoPassword = "administrador.1234";

			if (userIngresado.equalsIgnoreCase(accesoUser) && passwordIngresada.equals(accesoPassword)
					&& aleatorio == token) {
				System.out.println("Bienvenido al Sistema");
				break;
			} else {
				intentosRest--;
				System.out.println("Credenciales Incorrectas. Intentos restantes: " + intentosRest);
				if (intentosRest > 0) {

					System.out.println("Desea intentar nuevamente? (S/N)");
					String opcion  = tecladoGus.next();

					if (!opcion.equalsIgnoreCase("s")) {
						break;
					}

				} else {
					System.out.println("Agotaste los intentos. Por favor, comunícate con el servicio de soporte.");
					break;
				}

			}

		} while (true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	}



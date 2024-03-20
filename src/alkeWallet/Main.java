package alkeWallet;

import clases.Cuenta;
/**
 * @author leandroAraya
 */
public class Main {

	public static void main(String[] args) {
		// vamos a crear el objeto billetera 1
		// se generara un objeto que se llame billetera 1// Leandro que va a ser del tipo cuenta
		Cuenta Leandro = new Cuenta(123,"Leandro",234,"Quintero");
		// metodo constructor nos dara una instancia inicial (estado inicial)del objeto creado
		
		Cuenta Jorge=new Cuenta(12345,"jorge",100000,"Viña del mar");
				//los datos de leandro, presenta error porque son private los atributos en Cuenta.java
		System.out.println("Los datos de Leandro son: ");
		System.out.println("el numero de cuenta de leandro es "+Leandro.getNumeroCuenta());
		System.out.println("La saldo de leandro es "+Leandro.getSaldoCuenta());
		System.out.println("La ciudad de leandro es "+Leandro.getCiudad());

		
		
		
	
		
		
		
	}
	
}

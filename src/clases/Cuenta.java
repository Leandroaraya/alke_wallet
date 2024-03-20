package clases;

import alkeWallet.Main;

/**
 * Estructura de la clase cuenta
 * se define la clase cuenta con sus respectivos parametros
 */
public class Cuenta {
	/**
	 * Tiene3 datos que son:
	 * int numeroCuenta
	 * String titular
	 * double saldoCuenta
	 */
		private int numeroCuenta;  // se hace public para poder mostrarla en el Main por consola al imprimir
		private String titular;
		private double saldoCuenta;
		private String ciudad;
		
		//creamos los constructores
		//constructor vacio o por defecto
				public Cuenta() {
					
				}
				//este es un constructor parametrizado
				/**
				 * 
				 * @param numeroCuenta
				 * @param titular
				 * @param saldoCuenta
				 */
				public Cuenta(int numeroCuenta,String titular,double saldoCuenta,String ciudad) {
					this.numeroCuenta=numeroCuenta;
					this.titular=titular;
					this.saldoCuenta=saldoCuenta;
					this.ciudad=ciudad;
				}
				public void ingresarDinero(double montoIngresado) {
					this.saldoCuenta=this.saldoCuenta+montoIngresado;
				}
				public int getNumeroCuenta() {
					return numeroCuenta;
				}
				public void setNumeroCuenta(int numeroCuenta) {
					this.numeroCuenta = numeroCuenta;
				}
				public String getTitular() {
					return titular;
				}
				public void setTitular(String titular) {
					this.titular = titular;
				}
				public double getSaldoCuenta() {
					return saldoCuenta;
				}
				public void setSaldoCuenta(double saldoCuenta) {
					this.saldoCuenta = saldoCuenta;
				}
				public String getCiudad() {
					return ciudad;
				}
				public void setCiudad(String ciudad) {
					this.ciudad = ciudad;
				}

				
}

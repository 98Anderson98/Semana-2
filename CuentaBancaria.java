package Semana2;
import java.util.Scanner;
public class CuentaBancaria {
	  private String titular;
	  private double saldo;
	  private String moneda;

	  public CuentaBancaria(String titular, double saldo, String moneda) {
	    this.titular = titular;
	    this.saldo = saldo;
	    this.moneda = moneda;
	  }

	  public double obtenerSaldo() {
	    return this.saldo;
	  }

	  public void modificarSaldo(double nuevoSaldo) {
	    if (nuevoSaldo >= 0) {
	      this.saldo = nuevoSaldo;
	    } else {
	      System.out.println("No se puede establecer un saldo negativo.");
	    }
	  }

	  public static void main(String[] args) {
		  CuentaBancaria cuenta = new CuentaBancaria("Juan Pérez", 1000, "USD");
	        System.out.println("Saldo inicial: " + cuenta.obtenerSaldo());
	        Scanner scanner = new Scanner(System.in);
	        while (true) {
	            System.out.println("Ingrese el monto que desea agregar o restar (0 para salir): ");
	            double monto = scanner.nextDouble();
	            if (monto == 0) {
	                break;
	            }
	            cuenta.modificarSaldo(monto);
	            System.out.println("Saldo actual: " + cuenta.obtenerSaldo());
	        }
	        System.out.println("Saldo final: " + cuenta.obtenerSaldo());
	    }
	  }


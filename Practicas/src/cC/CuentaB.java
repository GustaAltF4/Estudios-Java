package cC;

import java.util.Scanner;

public class CuentaB {

	private int numeroCuenta;
	private long DNIcliente;
	private double saldoACTUAL;

	public CuentaB() {
	}

	public CuentaB(int numeroCuenta, long dNIcliente, double saldoACTUAL2) {
		this.numeroCuenta = numeroCuenta;
		DNIcliente = dNIcliente;
		this.saldoACTUAL = saldoACTUAL2;
	}

	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public long getDNIcliente() {
		return DNIcliente;
	}

	public void setDNIcliente(long dNIcliente) {
		DNIcliente = dNIcliente;
	}

	public double getSaldoACTUAL() {
		return saldoACTUAL;
	}

	public void setSaldoACTUAL(long saldoACTUAL) {
		this.saldoACTUAL = saldoACTUAL;
	}

	@Override
	public String toString() {
		return "CuentaB [numeroCuenta=" + numeroCuenta + ", DNIcliente=" + DNIcliente + ", saldoACTUAL=" + saldoACTUAL
				+ "]";
	}

	public static CuentaB crearC() {
		Scanner leer = new Scanner(System.in);
		System.out.println("ingrese su niumer de cuenta");
		int NumeroCuenta = leer.nextInt();
		System.out.println("ingrese su DNI");
		long DNIcliente = leer.nextLong();
		System.out.println("ingrese su saldo actual");
		double SaldoACTUAL = leer.nextDouble();
		leer.close();
		return new CuentaB(NumeroCuenta, DNIcliente, SaldoACTUAL);

	}

	public void ingresar(double ingreso) {
		saldoACTUAL += ingreso;
		System.out.println("se a ingresado $" + ingreso + ". Saldo Actual= $" + saldoACTUAL);

	}

	public void retirar(double retiro) {

		if (retiro <= saldoACTUAL) {
			saldoACTUAL -= retiro;
			System.out.println("se a retirado $" + retiro + ". Saldo Actual= $" + saldoACTUAL);

		} else {
			saldoACTUAL = 0;
			System.out.println("no hay suficiente saldo para retirar. SAldo Actual $" + saldoACTUAL);
		}

	}

	public void extraccionRapida() {
		double limiteExtraccion = saldoACTUAL * 0.2;
		if (limiteExtraccion > 0) {
			saldoACTUAL -= limiteExtraccion;
		}
	}

	public void consultarSaldo() {
		System.out.println("saldo Actual= $" + saldoACTUAL);
	}

	public void consultarDatos() {
		System.out.println("Número de cuenta: " + numeroCuenta);
		System.out.println("DNI del cliente: " + DNIcliente);
		System.out.println("Saldo actual: " + saldoACTUAL);
	}

	public static void main(String[] args) {
		CuentaB cuenta1 = crearC();
		cuenta1.ingresar(2000);
		cuenta1.retirar(500);
		cuenta1.extraccionRapida();

		cuenta1.consultarSaldo();
		cuenta1.consultarDatos();

	}

}

package tareacd4;

import java.util.Scanner;

import banco.CtaCorriente;

public class Main {

    public static void main(String[] args) {
        operativa_cuenta();
    }

	private static void operativa_cuenta() {
		CtaCorriente miCuenta;
        double saldoCuenta;

        miCuenta = new CtaCorriente("Koldo García Ábalos","0001-2345-07-1234567890",5000,0);
        saldoCuenta = miCuenta.saldo;
        System.out.println("El saldo inicial es de "+ saldoCuenta +" euros");

        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea retirar?");
            double importe = entrada.nextDouble();
            miCuenta.retirar(importe);
            System.out.println("El saldo actual de su cuenta es "+miCuenta.saldo+" euros");
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            Scanner entrada = new Scanner(System.in);
            System.out.println("¿Cuánto desea ingresar en su cuenta?");
            double importe = entrada.nextDouble();
            miCuenta.ingresar(importe);
            System.out.println("El saldo actual de su cuenta es "+miCuenta.saldo+" euros");
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
	}
}
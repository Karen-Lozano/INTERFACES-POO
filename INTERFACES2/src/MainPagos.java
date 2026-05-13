import java.util.Scanner;

public class MainPagos {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el monto para pago en efectivo:");
        double efectivo = sc.nextDouble();

        System.out.print("Ingrese el monto para pago con tarjeta:");
        double tarjeta = sc.nextDouble();

        System.out.print("Ingrese el monto para transferencia:");
        double transferenciaMonto = sc.nextDouble();

        // Crear objetos
        PagoEfectivo pago1 = new PagoEfectivo();

        PagoTarjeta pago2 = new PagoTarjeta();

        Transferecia pago3 = new Transferecia();

        // Procesar pagos
        pago1.procesarPago(efectivo);

        System.out.println();

        pago2.procesarPago(tarjeta);

        System.out.println();

        pago3.procesarPago(transferenciaMonto);

        sc.close();
    }
}
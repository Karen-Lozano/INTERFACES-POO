public class PagoTarjeta implements Pagable{
    @Override
    public void procesarPago(double monto){
        if (monto>0){
            System.out.println("Comision del 5%.");
            double monto5=monto*0.05;
            double total=monto+monto5;

            System.out.println("Pago con tarjeta realizado.");
            System.out.println("Monto inicial: "+monto);
            System.out.println("Comision: "+monto5);
            System.out.println("Total a pagar: "+total);
        }else{
            System.out.println("Pago invalido.");
        }

    }
}

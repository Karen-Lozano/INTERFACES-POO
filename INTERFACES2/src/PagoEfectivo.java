public class PagoEfectivo implements Pagable{
    @Override
    public void procesarPago(double monto){
        if (monto>0) {
            System.out.println("Pago en efectivo correcto.");
            System.out.println("Monto pagado: " + monto);
        }else {
            System.out.println("Monto invalido.");
        }
        }
    }


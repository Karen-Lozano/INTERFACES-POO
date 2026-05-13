public class Transferecia implements Pagable{
    @Override
    public void procesarPago(double monto){
        if (monto>0){
            System.out.println("Comision del 3%.");
            double monto3=monto*0.03;
            double total=monto+monto3;
            System.out.println("Transferencia realizada correctamente.");
            System.out.println("Monto inicial: "+monto);
            System.out.println("Comision: "+monto3);
            System.out.println("Pago final: "+total);

        }else{
            System.out.println("Pago invalido.");
        }
    }
}

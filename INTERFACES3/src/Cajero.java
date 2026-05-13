public class Cajero implements Auntenticable, Gestionable {
    @Override
    public boolean iniciarSesion(String usuario, String clave){
        return usuario.equals("cajero")&& clave.equals("123");
    }

    @Override
    public void gestionarDatos(){
        System.out.println("El cajero esta gestionando los pagos.");
    }
}

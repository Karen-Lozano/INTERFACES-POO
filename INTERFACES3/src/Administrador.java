public class Administrador implements Auntenticable,Gestionable,Reportable{
    @Override
    public boolean iniciarSesion(String usuario, String clave){
        return usuario.equals("admin")&& clave.equals("admin123");
    }
    @Override
    public void generarReporte(){
        System.out.println("El administrador esta generando el reporte.");
    }
    @Override
    public void gestionarDatos(){
        System.out.println("El administrador esta gestionando los datos.");
    }
}

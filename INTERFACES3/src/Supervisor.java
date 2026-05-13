public class Supervisor implements Auntenticable, Reportable{
    @Override
    public boolean iniciarSesion(String usuario, String clave){
        return usuario.equals("supervisor")&& clave.equals("super123");
    }

    @Override
    public void generarReporte(){
        System.out.println("El supervisor esta generando reporte de empleados.");

    }
}

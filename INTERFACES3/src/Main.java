import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("====SISTEMA BANCARIO====");
        System.out.println("1. Cajero");
        System.out.println("2. Administrador");
        System.out.println("3. Supervisor");

        System.out.println("Seleccione un rol: ");
        int opcion=sc.nextInt();

        sc.nextLine();

        System.out.println("Ingrese el usuario: ");
        String usuario=sc.nextLine();
        System.out.println("Ingrese la clave: ");
        String clave=sc.nextLine();

        switch (opcion){
            case 1:
                Cajero cajero =new Cajero();
                if (cajero.iniciarSesion(usuario,clave)){
                    System.out.println("Inicio de sesion correcto.");
                    cajero.gestionarDatos();
                }else {
                    System.out.println("Datos incorrectos");
                }
                break;
            case 2:
                Administrador admin=new Administrador();
                if (admin.iniciarSesion(usuario,clave)){
                    System.out.println("Inicio de sesion correcto");
                    admin.gestionarDatos();
                    admin.generarReporte();
                }else{
                    System.out.println("Datos incorrectos");
                }
                break;
            case 3:
                Supervisor superv=new Supervisor();
                if (superv.iniciarSesion(usuario,clave)){
                    System.out.println("Inicio de sesion correcto.");
                    superv.generarReporte();
                }else{
                    System.out.println("Datos incorrectos.");
                }
                break;
            default:
                System.out.println("Opcion invalida");


        }
        sc.close();
    }
}
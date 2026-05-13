import java.util.Scanner;

public class MainAcademico {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        System.out.print("Ingrese el numero de documento: ");
        String numero=sc.nextLine();

        System.out.print("Ingrese el nombre de la carrera: ");
        String carrera=sc.nextLine();

        System.out.print("Ingrese el perido academico: ");
        String periodo=sc.nextLine();

        Certificado certificado=new Certificado(numero);
        ActaNotas acta=new ActaNotas(carrera);
        HorarioAcademico anio=new HorarioAcademico(periodo);

        certificado.imprimir();
        acta.imprimir();
        anio.imprimir();

        sc.close();

    }
}
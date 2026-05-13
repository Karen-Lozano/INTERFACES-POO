public class ActaNotas implements Imprimible{
    private String nombreCarrera;

    public ActaNotas(String carrera){
        this.nombreCarrera=carrera;
    }

    @Override
    public void imprimir(){
        System.out.println("Acta nombre de la carrera: "+nombreCarrera);
    }
}

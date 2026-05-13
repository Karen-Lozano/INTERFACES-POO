public class HorarioAcademico implements Imprimible{
    private String horarioperiodoAcademico;

    public HorarioAcademico(String periodoAcademico){
        this.horarioperiodoAcademico=periodoAcademico;
    }

    @Override
    public void imprimir(){
        System.out.println("Periodo academico: "+horarioperiodoAcademico);
    }
}

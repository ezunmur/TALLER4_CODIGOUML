package modelos;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String id;
    private String nombre;
    private boolean estadoDisponible;
    private Profesor responsable;
    private List<Estudiante> estudiantesInscritos = new ArrayList<>();
    private List<Estudiante> estudiantesEnEsperaDeInscripcion = new ArrayList<>();
    private List<Foro> foros = new ArrayList<>();
    private List<ActividadSumativa> actividadesSumativas = new ArrayList<>();

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public boolean isEstadoDisponible() { return estadoDisponible; }
    public void setEstadoDisponible(boolean estadoDisponible) { this.estadoDisponible = estadoDisponible; }
    public Profesor getResponsable() { return responsable; }
    public void setResponsable(Profesor responsable) { this.responsable = responsable; }
    public List<Estudiante> getEstudiantesInscritos() { return estudiantesInscritos; }
    public void setEstudiantesInscritos(List<Estudiante> estudiantesInscritos) { this.estudiantesInscritos = estudiantesInscritos; }
    public List<Estudiante> getEstudiantesEnEsperaDeInscripcion() { return estudiantesEnEsperaDeInscripcion; }
    public void setEstudiantesEnEsperaDeInscripcion(List<Estudiante> estudiantesEnEsperaDeInscripcion) { this.estudiantesEnEsperaDeInscripcion = estudiantesEnEsperaDeInscripcion; }
    public List<Foro> getForos() { return foros; }
    public void setForos(List<Foro> foros) { this.foros = foros; }
    public List<ActividadSumativa> getActividadesSumativas() { return actividadesSumativas; }
    public void setActividadesSumativas(List<ActividadSumativa> actividadesSumativas) { this.actividadesSumativas = actividadesSumativas; }
}
package modelos;

import java.util.ArrayList;
import java.util.List;

public class SoporteTecnico {
    private List<Incidente> incidentesAtendidos = new ArrayList<>();

    public void brindarAsistencia(Usuario usuario) {}
    public void resolverProblemaTecnico(Usuario usuario) {}
    public void derivarProblemaDeGestion(Administrador administrador) {}

    public List<Incidente> getIncidentesAtendidos() { return incidentesAtendidos; }
    public void setIncidentesAtendidos(List<Incidente> incidentesAtendidos) { this.incidentesAtendidos = incidentesAtendidos; }
}
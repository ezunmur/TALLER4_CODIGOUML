package modelos;

import java.util.ArrayList;
import java.util.List;

public class PersonalAcademico extends Usuario {
    private List<Incidente> incidentes = new ArrayList<>();

    public void reportarError(String email, String contenido) {}
    public void solicitarAsesoramientoDelSistema(String email, String contenido) {}
    public void comentarEnForo(Foro foro, String comentario) {}

    public List<Incidente> getIncidentes() { return incidentes; }
    public void setIncidentes(List<Incidente> incidentes) { this.incidentes = incidentes; }
}
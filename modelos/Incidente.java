package modelos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Incidente {
    protected int id;
    protected LocalDateTime fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List<String> log_actualizaciones = new ArrayList<>();
    protected LocalDateTime fecha_cerrado;
    protected String tipo;
    private SoporteTecnico atendidoPor;
    private PersonalAcademico beneficiario;

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public LocalDateTime getFecha_reportado() { return fecha_reportado; }
    public void setFecha_reportado(LocalDateTime fecha_reportado) { this.fecha_reportado = fecha_reportado; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public String getTitulo() { return titulo; }
    public void setTitulo(String titulo) { this.titulo = titulo; }
    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }
    public List<String> getLog_actualizaciones() { return log_actualizaciones; }
    public void setLog_actualizaciones(List<String> log_actualizaciones) { this.log_actualizaciones = log_actualizaciones; }
    public LocalDateTime getFecha_cerrado() { return fecha_cerrado; }
    public void setFecha_cerrado(LocalDateTime fecha_cerrado) { this.fecha_cerrado = fecha_cerrado; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public SoporteTecnico getAtendidoPor() { return atendidoPor; }
    public void setAtendidoPor(SoporteTecnico atendidoPor) { this.atendidoPor = atendidoPor; }
    public PersonalAcademico getBeneficiario() { return beneficiario; }
    public void setBeneficiario(PersonalAcademico beneficiario) { this.beneficiario = beneficiario; }
}
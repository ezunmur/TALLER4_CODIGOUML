package modelos;

public class Foro {
    protected String id;
    protected String tematica;
    protected int numeroDeComentarios;

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    public String getTematica() { return tematica; }
    public void setTematica(String tematica) { this.tematica = tematica; }
    public int getNumeroDeComentarios() { return numeroDeComentarios; }
    public void setNumeroDeComentarios(int numeroDeComentarios) { this.numeroDeComentarios = numeroDeComentarios; }
}
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapoo1;

/**
 *
 * @author diego
 */
public class Avac01 {
    private int codefilme;
    private String usuario;
    private int nota;
    private String comentarios;

    public Avac01(int codefilme, String usuario, int nota, String comentarios) {
        this.codefilme = codefilme;
        this.usuario = usuario;
        this.nota = nota;
        this.comentarios = comentarios;
    }

    public int getCodefilme() {
        return codefilme;
    }

    public void setCodefilme(int codefilme) {
        this.codefilme = codefilme;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getComentarios() {
        return comentarios;
    }

    public void setComentarios(String comentarios) {
        this.comentarios = comentarios;
    }
    
    
}

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
public class Filme01 {
    private int codefilme;
    private String nomefilme;
    private String genero;
    private String sinopse;

    public Filme01(int codefilme, String nomefilme, String genero, String sinopse) {
        this.codefilme = codefilme;
        this.nomefilme = nomefilme;
        this.genero = genero;
        this.sinopse = sinopse;
    }

    public int getCodefilme() {
        return codefilme;
    }

    public void setCodefilme(int codefilme) {
        this.codefilme = codefilme;
    }

    public String getNomefilme() {
        return nomefilme;
    }

    public void setNomefilme(String nomefilme) {
        this.nomefilme = nomefilme;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    
    
}

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
public class Tecvideo {
    private Filme01 [] filme02;

    public Tecvideo(Filme01[] filme02) {
        this.filme02 = filme02;
    }

    public Filme01[] getFilme02() {
        return filme02;
    }

    public void setFilme02(Filme01[] filme02) {
        this.filme02 = filme02;
    }
    public int pesquisa_filme (String pesquisa){
        int pesquisa_filme=0, sinopse=0, sinopsevetor=-1;
        for(int i=0; i<filme02.length;i++){
            pesquisa_filme = filme02[i].getNomefilme().indexOf(pesquisa);
            sinopse = filme02[i].getSinopse().indexOf(pesquisa);
            if(pesquisa_filme>=0|| sinopse >=0){
                sinopsevetor= i;
                break;
            }
        }
        return sinopsevetor;    
    } 
    public String [] pegafilmes(){
        int tamfilme = filme02.length;
        String[] nome = new String [tamfilme];
        for(int i=0; i<tamfilme;i++){
            nome[i]= filme02[i].getNomefilme();
            
        }
        return nome;
    }
}

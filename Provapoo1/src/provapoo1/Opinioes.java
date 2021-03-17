/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provapoo1;
import java.util.Collections;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author diego
 */
public class Opinioes {
  private Avac01[] avaliacao;

    public Opinioes(Avac01[] avaliacao) {
        this.avaliacao = avaliacao;
    }

    private List<Avac01> procurarporID(int elementoporid){
        List<Avac01> listavaliação = new ArrayList<>();
        int identID = elementoporid;
        for (Avac01 avaliação : avaliacao){
            if(avaliação.getCodefilme()== identID)
            {
                listavaliação.add(avaliação);
            }
        }
        return listavaliação;
    }

    public double mediafilme(int elementoporid){
        double media =0;
        int identID = elementoporid, total =0;
        for (Avac01 avaliação : avaliacao){
            if(avaliação.getCodefilme()== identID){
                media += avaliação.getNota();
                total++;
            }
        }
        return media / total;

    }
    public Avac01 maiornota(int elementoporid){
       List listavaliação = procurarporID(elementoporid);
        Collections.sort(listavaliação, (Avac01 a, Avac01 b) -> {
            if(a.getNota()  > b.getNota()) return 1;
            else if (a.getNota() < b.getNota()) return -1;
            return 0;
        });

           return ((Avac01) listavaliação.get(listavaliação.size()-1));

    }
      public Avac01 piornota(int elementoporid){
          List listavaliação = procurarporID(elementoporid);

          Collections.sort(listavaliação,(Avac01 a, Avac01 b) -> {
              if(a.getNota()> b.getNota()) return -1;
              else if ( a.getNota()< b.getNota()) return 1;
              return 0;
          });
          return ((Avac01) listavaliação.get( listavaliação.size()-1));
      }

    public Avac01[] getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(Avac01[] avaliacao) {
        this.avaliacao = avaliacao;
    }


    
  
}

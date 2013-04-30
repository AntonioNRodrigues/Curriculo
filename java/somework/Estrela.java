/*  
 * Classe que gera duas estrelas do jogo do euromilhoes.
 * As duas estrelas são geradas aliatoriamente entre 1 e 10.
 */
package somework;
import java.util.SortedSet;
import java.util.TreeSet;

/**
 * @author Antonio Rodrigues
 * @version: 2.0
 */
public class Estrela {
    
    static final int QTDESTRELAS=2;//quantidade de estrelas geradas
    private int numEstrela;
    private SortedSet sortedT= new TreeSet();

   //construtor sem parametros
    public Estrela() {
        setNumEstrela(0);
    }
    

    //construtor com um parametro.
    public Estrela(int numEstrela) {
        this.numEstrela = numEstrela;
    }
    
    public int getNumEstrela() {
        return numEstrela;
    }
    
   /* metodo que preenche o TreeSet com a quantidade de estrelas 
    * definido no atributo QTESTRELAS. 
    * Gera as estrelas aliatoriamente entre 1 e 10.
    */
    public void setNumEstrela(int numEstrela) {
        while(sortedT.size()!=QTDESTRELAS){
            numEstrela=(int)(1+Math.random()*10);
            sortedT.add(numEstrela);
        }
        this.numEstrela = numEstrela;
    }

    public SortedSet getSortedT() {
        return sortedT;
    }

    public void setSortedT(SortedSet sortedT) {
        this.sortedT = sortedT;
    }    
}

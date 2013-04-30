/*
 * Classe que gera cinco numeros do jogo do euromilhoes.
 * Os numeros são geradas aliatoriamente entre 1 e 52.
 */
package somework;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Antonio Rodrigues
 * version: 2.0
 */
public class Numero {
    static final int QTDNUMEROS=5;//quantidade de numeros geradas
    private int numNumero;
    private Set set=new TreeSet();
    
    public Numero(){
        setNumNumero(0);
    }
    
    public Numero(int numNumero){
        this.numNumero=numNumero;
    }
    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }
      
   /* Metodo que preenche o TreeSet com a quantidade de estrelas 
    * definido no atributo QTDNUMEROS. 
    * Gera os numeros aliatoriamente entre 1 e 52.
    */
    public void setNumNumero(int numNumero){
        while(set.size()!=QTDNUMEROS){
            numNumero=((int)(1+Math.random()*52));
            set.add(numNumero);
            }
            this.numNumero=numNumero;
    }  
    
    public int getNumNumero(){
        return numNumero;
    }
}



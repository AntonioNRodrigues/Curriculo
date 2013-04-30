/*
 * Classe que organiza os objectos do tipo Experience e coloca-os numa Lista
 */
package model.classe.experiences;

import java.util.ArrayList;
import java.util.List;

/*
 * @author Antonio Rodrigues
 */
public class WorkExperience {
    private List <Experience> exp;
    private int index;

    public List<Experience> getExp() {
        return exp;
    }

    public void setExp(List<Experience> exp) {
        this.exp = exp;
    }

    public WorkExperience(){
        exp= new ArrayList<Experience>();
    }
   public WorkExperience(Experience experience){
        exp= new ArrayList<Experience>();
    }
   
   /*
    * metodo que recebe 4 argumentos e passa-os para a classe Experience. 
    * Instancia esse classe criando uma objecto desse tipo e adiciona-o à 
    * Lista exp, que só recebe objectos desse tipo.  
    */
   public void addExperience(String d, String j,String jA, String p){
       exp.add(new Experience(d,j,jA,p));
   }
   public Experience getExperience(int index){
       return exp.get(index);
   }
   public int getNumOfExperience(){
       return exp.size();
   }

    @Override
    public String toString() {
        return "WorkExperience{" + "exp=" + exp + ", index=" + index + '}';
    }
   
   

}
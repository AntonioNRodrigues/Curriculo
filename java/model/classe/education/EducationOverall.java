/*
 * classe que organiza os objectos do tipo Education e coloca-os numa Lista
 */
package model.classe.education;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Antonio Rodrigues
 */
public class EducationOverall {
    private List <Education> educ;
    private int index;

    public EducationOverall (){
        educ= new ArrayList<Education>();
    }
    
    public EducationOverall(Education education) {
        educ= new ArrayList<Education>();
    }
    
    /*método que recebe 4 argumentos e passa-os para a classe Education. 
    * Instancia esse classe criando uma objecto desse tipo e adiciona-o à 
    * Lista educ, que só recebe objectos desse tipo.  
    */
    public void addEducation(String d, String t,String pS, String nO){
        educ.add(new Education(d,t,pS,nO));
    }
    
    public Education getEducation(int index){
        return educ.get(index);
    }
    
    public int getNumOfEducation(){
        return educ.size();
    }
    
    public List<Education> getEduc() {
        return educ;
    }

    public void setEduc(List<Education> educ) {
        this.educ = educ;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
    
    @Override
    public String toString() {
        return "EducationOverall{" + "educ=" + educ + '}';
    }
    
}

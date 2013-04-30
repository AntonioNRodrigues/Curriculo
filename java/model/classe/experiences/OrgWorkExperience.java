/*
 * Classe que trata da separação em tres lista da Lista preenchida 
 * em WorkExperience.
 */
package model.classe.experiences;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Antonio Rodrigues
 */
public class OrgWorkExperience extends WorkExperience{
    //lista que contem Objectivos do tipo Experience mas que são referentes à experiencia em educação física.
    private List experEdFisica;
    //lista que contem Objectivos do tipo Experience mas que são referentes à experiencia em natação.
    private List experNatacao;
    //lista que contem Objectivos do tipo Experience mas que são referentes à experiencia em monitor e outras.
    private List experMonitor;
    
      //contrutor que inicializa as 3 listas.
    public OrgWorkExperience(){
        experEdFisica= new ArrayList<Experience>();
        experMonitor = new ArrayList<Experience>();
        experNatacao= new ArrayList<Experience>();
    }

    public List getExperEdFisica() {
        return experEdFisica;
    }

    public void setExperEdFisica(List experEdFisica) {
        this.experEdFisica = experEdFisica;
    }

    public List getExperNatacao() {
        return experNatacao;
    }

    public void setExperNatacao(List experNatacao) {
        this.experNatacao = experNatacao;
    }

    public List getExperMonitor() {
        return experMonitor;
    }

    public void setExperMonitor(List experMonitor) {
        this.experMonitor = experMonitor;
    }
    
    /*
     * metodo que permite selectionar os objectos Experience e colocá-los, 
     * consoante as suas caracteristicas em um de três ArrayList:  
     * experNatacao, experEdFisica, experMonitor.
     * Recebe como argumento a Lista com objectos Experience, realiza 
     * a iteração sobre essa lista e consoante as condições estipuladas 
     * divide o contéudo da lista original pelas 3 Listas.
     */
    public void org(List<Experience> exp){

            for(int i=0; i<exp.size(); i++){
           
            if(exp.get(i).getJob().equalsIgnoreCase("professor")){
                experNatacao.add(exp.get(i));
            }
            
            if(exp.get(i).getJob().startsWith("Docente", 0)){
                experEdFisica.add(exp.get(i));

            }
            if(exp.get(i).getJob().startsWith("Monitor", 0)||
                    (exp.get(i).getJob().startsWith("Animador", 0))||
                    (exp.get(i).getJob().startsWith("Treinador", 0))||
                    (exp.get(i).getJob().startsWith("Coordenador", 0))){
                
            experMonitor.add(exp.get(i));
            }
           
                
        }
    }
}

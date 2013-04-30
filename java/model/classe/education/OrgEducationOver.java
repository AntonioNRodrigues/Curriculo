/*
 * Classe que trata da separação em tres lista da Lista preenchida 
 * em EducationOverall.
 */
package model.classe.education;
import java.util.ArrayList;
import java.util.List;
/**
 * @author Antonio Rodrigues
 */
public class OrgEducationOver{
//lista que contem Objectivos do tipo Education mas que são referentes à formação Superior.
private List <Education> formSuperior;
//lista que contem Objectivos do tipo Education mas que são referentes à formação Programação.
private List <Education> formacaoProg;
//lista que contem Objectivos do tipo Education mas que são referentes à formação Deporto.
private List <Education> formacaoDesp;

    //contrutor que inicializa as 3 listas.
    public OrgEducationOver() {
        formSuperior= new ArrayList <Education>();
        formacaoDesp= new ArrayList<Education>();
        formacaoProg = new ArrayList<Education>();
    }
public List<Education> getFormSuperior() {
        return formSuperior;
    }

    public void setFormSuperior(List<Education> formSuperior) {
        this.formSuperior = formSuperior;
    }
    public List<Education> getFormacaoProg() {
        return formacaoProg;
    }

    public void setFormacaoProg(List<Education> formacaoProg) {
        this.formacaoProg = formacaoProg;
    }

    public List<Education> getFormacaoDesp() {
        return formacaoDesp;
    }

    public void setFormacaoDesp(List<Education> formacaoDesp) {
        this.formacaoDesp = formacaoDesp;
    }

    /*metodo que permite selectionar os objectos Education e colocá-los, 
     * consoante as suas caracteristicas em um de três ArrayList:  
     * formSuperior, formProg, formDesp.
     * Recebe como argumento a Lista com objectos Education, realiza 
     * a iteração sobre essa lista e consoante as condições estipuladas 
     * divide o contéudo da lista original pelas 3 Listas.
     */
    public void orgEduc(List <Education> l){
        
        for(int i=0; i<l.size(); i++){
            if(l.get(i).getTitle().startsWith("Licenciatura")||
                    l.get(i).getTitle().startsWith("Pós-graduação")){
                formSuperior.add(l.get(i));
                
            }else{
                if(l.get(i).getNameOrganisation().startsWith("Academia de Java/Rumos")||
                        l.get(i).getNameOrganisation().startsWith("Alta")||
                        l.get(i).getNameOrganisation().startsWith("Oracle")){
                formacaoProg.add(l.get(i));
                
                }
                else{
                    formacaoDesp.add(l.get(i));
                  
                }
            }
        }
        
    }
}

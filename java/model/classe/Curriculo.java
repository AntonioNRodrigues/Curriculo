/*
 * Classe que organiza as restantes PersonalInformation, 
 * WorkExperience, EducationOverall e PersonalSkillsCompetences
 */
package model.classe;
import model.classe.education.EducationOverall;
import model.classe.experiences.WorkExperience;
/**
 * @author Antonio Rodrigues
 * @version 1.5
 */
public class Curriculo {
    private PersonalInformation persInf;
    private WorkExperience workExp;
    private EducationOverall educ;
    private PersonalSkillsCompetences pesSkillComp;
    //private AddicionalInformation aInf;

    public Curriculo(){
    }
    public Curriculo(PersonalInformation persInf, WorkExperience workExp) {
        this.workExp = workExp;
        this.persInf = persInf;
    }

    public Curriculo(PersonalInformation persInf, WorkExperience workExp, EducationOverall educ) {
        this.persInf = persInf;
        this.workExp = workExp;
        this.educ = educ;
    }
    

    public Curriculo(PersonalInformation persInf, WorkExperience workExp, EducationOverall educ, PersonalSkillsCompetences pesSkillComp) {
        this.persInf = persInf;
        this.workExp = workExp;
        this.educ = educ;
        this.pesSkillComp = pesSkillComp;
    }
    

    public PersonalInformation getPersInf() {
        return persInf;
    }

    public void setPersInf(PersonalInformation persInf) {
        this.persInf = persInf;
    }
         
      public WorkExperience getWorkExp() {
        return workExp;
    }
    
    public void setWorkExp(WorkExperience workExp) {
        this.workExp = workExp;
    }

    public EducationOverall getEduc() {
        return educ;
    }

    public void setEduc(EducationOverall educ) {
        this.educ = educ;
    }

    public PersonalSkillsCompetences getPesSkillComp() {
        return pesSkillComp;
    }

    public void setPesSkillComp(PersonalSkillsCompetences pesSkillComp) {
        this.pesSkillComp = pesSkillComp;
    }
    
    
}

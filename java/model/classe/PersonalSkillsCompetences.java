/*
 * Classe que pertende organizar as personal Skills e competencias 
 * -->CLASSE NAO UTILIZADA NO NESTE SITE<--
 */
package model.classe;

/**
 * @author Antonio Rodrigues
 */
public class PersonalSkillsCompetences {
    private String firstLanguage;
    private String otherLanguages;
    private String socialSkills;
    private String organisationlSkills;
    private String computerSkills;
    private String driverLicense;

    public PersonalSkillsCompetences() {
    }

    public PersonalSkillsCompetences(String firstLanguage, String otherLanguages, 
        String socialSkills, String organisationlSkills, String computerSkills, String driverLicense) {
        this.firstLanguage = firstLanguage;
        this.otherLanguages = otherLanguages;
        this.socialSkills = socialSkills;
        this.organisationlSkills = organisationlSkills;
        this.computerSkills = computerSkills;
        this.driverLicense = driverLicense;
    }

    public String getComputerSkills() {
        return computerSkills;
    }

    public void setComputerSkills(String computerSkills) {
        this.computerSkills = computerSkills;
    }

    public String getDriverLicense() {
        return driverLicense;
    }

    public void setDriverLicense(String driverLicense) {
        this.driverLicense = driverLicense;
    }

    public String getFirstLanguage() {
        return firstLanguage;
    }

    public void setFirstLanguage(String firstLanguage) {
        this.firstLanguage = firstLanguage;
    }

    public String getOrganisationlSkills() {
        return organisationlSkills;
    }

    public void setOrganisationlSkills(String organisationlSkills) {
        this.organisationlSkills = organisationlSkills;
    }

    public String getOtherLanguages() {
        return otherLanguages;
    }

    public void setOtherLanguages(String otherLanguages) {
        this.otherLanguages = otherLanguages;
    }

    public String getSocialSkills() {
        return socialSkills;
    }

    public void setSocialSkills(String socialSkills) {
        this.socialSkills = socialSkills;
    }

    @Override
    public String toString() {
        return "PersonalSkillsCompetences{" + "firstLanguage=" + firstLanguage + ", "
                + "otherLanguages=" + otherLanguages + ", socialSkills=" + socialSkills + ", "
                + "organisationlSkills=" + organisationlSkills + ", computerSkills=" + computerSkills + ", "
                + "driverLicense=" + driverLicense + '}';
    }
    
    
}

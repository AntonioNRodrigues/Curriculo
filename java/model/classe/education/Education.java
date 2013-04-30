/*
 * Classe que cria objectos do tipo Education com 4 atributos. 
 */
package model.classe.education;

/**
 * @author Antonio Rodrigues
 */
public class Education {
    private String date;
    private String title;
    private String principalSubjects;
    private String nameOrganisation;

    public Education() {
    }

    public Education(String date, String title, String principalSubjects, String nameOrganisation) {
        setDate(date);
        this.title = title;
        this.principalSubjects = principalSubjects;
        this.nameOrganisation = nameOrganisation;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getNameOrganisation() {
        return nameOrganisation;
    }

    public void setNameOrganisation(String nameOrganisation) {
        this.nameOrganisation = nameOrganisation;
    }

    public String getPrincipalSubjects() {
        return principalSubjects;
    }

    public void setPrincipalSubjects(String principalSubjects) {
        this.principalSubjects = principalSubjects;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", Title: " + title + ", "
                + "PrincipalSubjects: " + principalSubjects + ", "
                + "NameOrganisation: " + nameOrganisation;
    }
}

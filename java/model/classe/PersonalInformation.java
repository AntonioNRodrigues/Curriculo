/*
 * Classe que cria objectos do tipo PersonalInformation com as 
 * características visíveis.
 */
package model.classe;
/**
 *
 * @author Antonio Rodrigues
 * @version: 1.0
 */
public class PersonalInformation {
    private String firstName;
    private String lastName;
    private String fullName;
    private String Mobilephone;
    private String email;
    private String nationality;
    private String birthDate;
    private String gender;
    private String endTwitter;
    private String endFacebook;
    private String endLinkedin;

    public PersonalInformation(String firstName, String lastName, String fullName, 
            String Mobilephone, String email, String nationality, String birthDate, 
            String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullName = fullName;
        this.Mobilephone= Mobilephone;
        this.email = email;
        this.nationality = nationality;
        this.birthDate = birthDate;
        this.gender = gender;
        this.endFacebook="http://www.facebook.com/antonio.rodrigues.3150";
        this.endLinkedin="http://www.linkedin.com/pub/ant%C3%B3nio-rodrigues/31/552/163";
        this.endTwitter="https://twitter.com/#!/Antonio_N_R";
    }

    public PersonalInformation() {
        setFirstName("António");
    }

    public String getMobilephone() {
        return Mobilephone;
    }

    public void setMobilephone(String Mobilephone) {
        this.Mobilephone = Mobilephone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getEndFacebook() {
        return endFacebook;
    }

    public void setEndFacebook(String endFacebook) {
        this.endFacebook = endFacebook;
    }

    public String getEndLinkedin() {
        return endLinkedin;
    }

    public void setEndLinkedin(String endLinkedin) {
        this.endLinkedin = endLinkedin;
    }

    public String getEndTwitter() {
        return endTwitter;
    }

    public void setEndTwitter(String endTwitter) {
        this.endTwitter = endTwitter;
    }

    @Override
    public String toString() {
        return "PersonalInformation { " + "firstName= " + firstName + ", lastName= " 
                + lastName + ", fullName= " + fullName + ", Mobilephone= " + Mobilephone + 
                ", email= " + email + ", nationality= " + nationality + ", birthDate= " + 
                birthDate + ", gender= " + gender + ", endTwitter= " + endTwitter + ", "
                + "endFacebook= " + endFacebook + ", endLinkedin= " + endLinkedin + '}';
    }
    
    
}

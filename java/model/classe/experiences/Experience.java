/*
 * Classe que cria objectos do tipo Experience com 4 atributos.
 */
package model.classe.experiences;

/**
 * @author Antonio Rodrigues
 */
public class Experience {
    private String date;
    private String job;
    private String jobActivite;
    private String place;

    public Experience(String date, String job, String jobActivite, String place) {
        this.date = date;
        this.job = job;
        this.jobActivite = jobActivite;
        this.place = place;
    }

    public Experience() {
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getJobActivite() {
        return jobActivite;
    }

    public void setJobActivite(String jobActivite) {
        this.jobActivite = jobActivite;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    @Override
    public String toString() {
        return "Date: " + date + ", " + "\n" 
                + "Job: " + job + ", " + "\n" 
                + "Job Activite: " + jobActivite + ", " + "\n" 
                + "Place: " + place;
    }

   
    
}

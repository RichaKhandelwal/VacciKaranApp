package richa.osahub.com.vaccikaranapp;

import java.io.Serializable;

/**
 * Created by User on 7/17/2015.
 */
public class Vaccinations implements Serializable {



    String vacciName;
    String duration;
    String details;


    public Vaccinations(String vacciName, String duration, String details) {
        this.vacciName = vacciName;
        this.duration = duration;
        this.details = details;
    }

    public String getVacciName() {
        return vacciName;
    }

    public void setVacciName(String vacciName) {
        this.vacciName = vacciName;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }


}

package richa.osahub.com.vaccikaranapp;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by LG-11-21 on 7/21/2015.
 */
public class Sfeed implements Serializable {




    String susername;
        Date sdate;
        String spost;

    public Sfeed() {

    }
    public Sfeed(String susername, Date sdate, String spost) {
        this.susername = susername;
        this.sdate = sdate;
        this.spost = spost;
    }
    public String getUsername() {
        return susername;
    }

    public void setUsername(String susername) {
        this.susername = susername;
    }

    public Date getDate() {
        return sdate;
    }

    public void setDate(Date sdate) {
        this.sdate = sdate;
    }

    public String getPost() {
        return spost;
    }

    public void setPost(String spost) {
        this.spost = spost;
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package wildlife_tracker;

import java.util.Date;

/**
 *
 * @author oisinclarke
 */
public class WildLifeSighting implements VerifyInterface, DisplayInterface {
    
    private String species;
    private String location;
    private String observer;
    private Date timestamp;
    private boolean verified;
    
    
    public WildLifeSighting(String observer, String location, String species) {
        this.observer = observer;
        this.location = location;
        this.species = species;
        this.timestamp = new Date();
        this.verified = false; // sightings are unverified until changed
    }

    public String getSpecies() {
        return species;
    }

    public String getLocation() {
        return location;
    }

    public String getObserver() {
        return observer;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public boolean isVerified() {
        return verified;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setObserver(String observer) {
        this.observer = observer;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public void setVerified(boolean verified) {
        this.verified = verified;
    }
    
    @Override
    public void verify(){
        this.verified = true;
    }
    
    @Override
    public String getSummary(){
        String status = verified ? "Verified" : "Still pending";
        return species + "found in" + location + "by" + observer + "(" + status + ")";
    }
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
    }
    
}

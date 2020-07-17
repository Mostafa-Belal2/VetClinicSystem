/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.vetclinic.common;



/**
 *
 * @author dell
 */
public class DoctorBean {

   private Integer idr;
     private ClinicBean  clinic;
     private String name;
     private String phone;
     private String photoPath;
     private String bioPath;

    public DoctorBean() {
    }

    public DoctorBean(Integer idr, ClinicBean clinic, String name, String phone, String photoPath, String bioPath) {
        this.idr = idr;
        this.clinic = clinic;
        this.name = name;
        this.phone = phone;
        this.photoPath = photoPath;
        this.bioPath = bioPath;
    }

    public Integer getIdr() {
        return idr;
    }

    public void setIdr(Integer idr) {
        this.idr = idr;
    }

    public ClinicBean getClinic() {
        return clinic;
    }

    public void setClinic(ClinicBean clinic) {
        this.clinic = clinic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public String getBioPath() {
        return bioPath;
    }

    public void setBioPath(String bioPath) {
        this.bioPath = bioPath;
    }
    
    
}

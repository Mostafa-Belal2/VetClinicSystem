/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.vetclinic.common;

import java.util.Date;

/**
 *
 * @author dell
 */
public class VisitBean {

     private Integer id;
     private ClinicBean clinic;
     private DoctorBean doctor;
     private PetBean pet;
     private Date date;

    public VisitBean(Integer id, ClinicBean clinic, DoctorBean doctor, PetBean pet, Date date) {
        this.id = id;
        this.clinic = clinic;
        this.doctor = doctor;
        this.pet = pet;
        this.date = date;
    }

    public VisitBean() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ClinicBean getClinic() {
        return clinic;
    }

    public void setClinic(ClinicBean clinic) {
        this.clinic = clinic;
    }

    public DoctorBean getDoctor() {
        return doctor;
    }

    public void setDoctor(DoctorBean doctor) {
        this.doctor = doctor;
    }

    public PetBean getPet() {
        return pet;
    }

    public void setPet(PetBean pet) {
        this.pet = pet;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    
   
}

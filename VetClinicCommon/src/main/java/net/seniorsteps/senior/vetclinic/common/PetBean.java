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
public class PetBean {
  private Integer id;
     private OwnerBean owner;
     private String name;
     private String gender;
     private Date dateOfBirth;
     private String animalKind;
     private String photoPath;
     private float weight;

    public PetBean() {
    }

    public PetBean(Integer id, OwnerBean owner, String name, String gender, Date dateOfBirth, String animalKind, String photoPath, float weight) {
        this.id = id;
        this.owner = owner;
        this.name = name;
        this.gender = gender;
        this.dateOfBirth = dateOfBirth;
        this.animalKind = animalKind;
        this.photoPath = photoPath;
        this.weight = weight;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public OwnerBean getOwner() {
        return owner;
    }

    public void setOwner(OwnerBean owner) {
        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getAnimalKind() {
        return animalKind;
    }

    public void setAnimalKind(String animalKind) {
        this.animalKind = animalKind;
    }

    public String getPhotoPath() {
        return photoPath;
    }

    public void setPhotoPath(String photoPath) {
        this.photoPath = photoPath;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }
    
    
}

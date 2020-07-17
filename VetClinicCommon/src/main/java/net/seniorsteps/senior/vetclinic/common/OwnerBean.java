/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.vetclinic.common;

import java.util.Date;
import java.util.List;

/**
 *
 * @author dell
 */
public class OwnerBean {

     private Integer id;
     private String name;
     private String email;
     private String phone;
     private String gender;
     private String address;
     private List<PetBean> ownerBean;

    public List<PetBean> getOwnerBean() {
        return ownerBean;
    }

    public void setOwnerBean(List<PetBean> ownerBean) {
        this.ownerBean = ownerBean;
    }

    
     

    public OwnerBean() {
    }

    public OwnerBean(Integer id, String name, String email, String phone, String gender, String address) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
        this.address = address;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    
    
}

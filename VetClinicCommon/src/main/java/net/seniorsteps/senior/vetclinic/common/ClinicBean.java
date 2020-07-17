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
public class ClinicBean {

  private Integer id;
     private String name;
     private String address;
     private String phone;
     private String workingDays;
     private Date openAt;
     private Date closeAt;
     private String email;
     private String url;
     private List<DoctorBean> doctorBean;

    public List<DoctorBean> getDoctorBean() {
        return doctorBean;
    }

    public void setDoctorBean(List<DoctorBean> doctorBean) {
        this.doctorBean = doctorBean;
    }
     

    public ClinicBean() {
    }

    public ClinicBean(Integer id, String name, String address, String phone, String workingDays, Date openAt, Date closeAt, String email, String url) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.workingDays = workingDays;
        this.openAt = openAt;
        this.closeAt = closeAt;
        this.email = email;
        this.url = url;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getWorkingDays() {
        return workingDays;
    }

    public void setWorkingDays(String workingDays) {
        this.workingDays = workingDays;
    }

    public Date getOpenAt() {
        return openAt;
    }

    public void setOpenAt(Date openAt) {
        this.openAt = openAt;
    }

    public Date getCloseAt() {
        return closeAt;
    }

    public void setCloseAt(Date closeAt) {
        this.closeAt = closeAt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    
}

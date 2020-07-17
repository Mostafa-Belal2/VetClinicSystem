/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.vetclinic.bll.manager;

import java.util.List;
import net.seniorsteps.senior.vetclinic.common.DoctorBean;


/**
 *
 * @author dell
 */
public interface DoctorManager {

    public List<DoctorBean> listdoctor();

    public DoctorBean finddoctorById(Integer id);

    public DoctorBean adddoctor(DoctorBean doctorBean);

    public DoctorBean updatedoctor(DoctorBean doctorBean);
    public void removedoctor(Integer id);
}

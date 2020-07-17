/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.vetclinic.bll.manager;

import java.util.List;
import net.seniorsteps.senior.vetclinic.common.ClinicBean;


/**
 *
 * @author dell
 */
public interface ClinicManager {

    public List<ClinicBean> listclinic();
    public ClinicBean ClinicDoctorByid(Integer id);

    public ClinicBean findClinicById(Integer id);
    public ClinicBean searchclinicBynumber(String number);

    public ClinicBean addClinic(ClinicBean clinicBean);

    public ClinicBean updateClinic(ClinicBean clinicBean);
    public void removeClinic(Integer id);
}

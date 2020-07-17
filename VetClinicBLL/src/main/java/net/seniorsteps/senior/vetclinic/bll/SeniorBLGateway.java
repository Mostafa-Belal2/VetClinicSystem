/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.vetclinic.bll;


import java.security.acl.Owner;
import java.util.List;
import net.seniorsteps.senior.vetclinic.bll.manager.ClinicManager;
import net.seniorsteps.senior.vetclinic.bll.manager.DoctorManager;
import net.seniorsteps.senior.vetclinic.bll.manager.OwnerManager;
import net.seniorsteps.senior.vetclinic.bll.manager.PetManager;
import net.seniorsteps.senior.vetclinic.bll.manager.VisitManager;
import net.seniorsteps.senior.vetclinic.common.ClinicBean;
import net.seniorsteps.senior.vetclinic.common.DoctorBean;
import net.seniorsteps.senior.vetclinic.common.OwnerBean;
import net.seniorsteps.senior.vetclinic.common.PetBean;
import net.seniorsteps.senior.vetclinic.common.VisitBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Senior Steps
 */
@Service
public class SeniorBLGateway {
    @Autowired
    ClinicManager cm;
    @Autowired
    DoctorManager dm;
    @Autowired
    OwnerManager om;
    @Autowired
    PetManager pm;
    @Autowired
    VisitManager vm;

    public ClinicBean searchclinicBynumber(String number) {
        return cm.searchclinicBynumber(number);
    }

    
    
    public ClinicBean ClinicDoctorByid(Integer id) {
        return cm.ClinicDoctorByid(id);
    }
    
    

    public OwnerBean OwnerPetByid(Integer id) {
        return om.OwnerPetByid(id);
    }
    

    public List<ClinicBean> listclinic() {
        return cm.listclinic();
    }

    public ClinicBean findClinicById(Integer id) {
        return cm.findClinicById(id);
    }

    public ClinicBean addClinic(ClinicBean clinicBean) {
        return cm.addClinic(clinicBean);
    }

    public ClinicBean updateClinic(ClinicBean clinicBean) {
        return cm.updateClinic(clinicBean);
    }

    public void removeClinic(Integer id) {
        cm.removeClinic(id);
    }

    public List<DoctorBean> listdoctor() {
        return dm.listdoctor();
    }

    public DoctorBean finddoctorById(Integer id) {
        return dm.finddoctorById(id);
    }

    public DoctorBean adddoctor(DoctorBean doctorBean) {
        return dm.adddoctor(doctorBean);
    }

    public DoctorBean updatedoctor(DoctorBean doctorBean) {
        return dm.updatedoctor(doctorBean);
    }

    public void removedoctor(Integer id) {
        dm.removedoctor(id);
    }

    public List<OwnerBean> listowner() {
        return om.listowner();
    }

    public OwnerBean findOwnerById(Integer id) {
        return om.findOwnerById(id);
    }

    public OwnerBean addOwner(OwnerBean ownerBean) {
        return om.addOwner(ownerBean);
    }

    public OwnerBean updateOwner(OwnerBean ownerBean) {
        return om.updateOwner(ownerBean);
    }

    public void removeOwner(Integer id) {
        om.removeOwner(id);
    }

    public List<PetBean> listpet() {
        return pm.listpet();
    }

    public PetBean findPetById(Integer id) {
        return pm.findPetById(id);
    }

    public PetBean addPet(PetBean petBean) {
        return pm.addPet(petBean);
    }

    public PetBean updatePet(PetBean petBean) {
        return pm.updatePet(petBean);
    }

    public void removePet(Integer id) {
        pm.removePet(id);
    }

    public List<VisitBean> listvisit() {
        return vm.listvisit();
    }

    public VisitBean findVisitById(Integer id) {
        return vm.findVisitById(id);
    }

    public VisitBean addVisit(VisitBean visitBean) {
        return vm.addVisit(visitBean);
    }

    public VisitBean updateVisit(VisitBean visitBean) {
        return vm.updateVisit(visitBean);
    }

    public void removeVisit(Integer id) {
        vm.removeVisit(id);
    }
    
    
    
    
    
    
}

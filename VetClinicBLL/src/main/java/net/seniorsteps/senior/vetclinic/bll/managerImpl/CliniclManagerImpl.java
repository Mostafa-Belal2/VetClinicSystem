/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.vetclinic.bll.managerImpl;


import java.util.ArrayList;
import java.util.List;
import net.seniorsteps.senior.vetclinic.bll.manager.ClinicManager;
import net.seniorsteps.senior.vetclinic.bll.transformer.ClinicTransformer;
import net.seniorsteps.senior.vetclinic.common.ClinicBean;
import net.seniorsteps.senior.vetclinic.dal.entity.ClinicEntity;
import net.seniorsteps.senior.vetclinic.dal.repo.ClinicRepo;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dell
 */
@Transactional
@Service
public class CliniclManagerImpl implements ClinicManager{
    
    @Autowired
    ClinicTransformer ct;
    @Autowired
    ClinicRepo cr;
    

    @Override
    public List<ClinicBean> listclinic() {
        
       List<ClinicBean> listClinic = new ArrayList<>();
        List<ClinicEntity> users = cr.findList();
        for (ClinicEntity user : users) {
            listClinic.add(ct.fromEntityToBean(user));
        }
        return listClinic;
        
    }

    @Override
    public ClinicBean findClinicById(Integer id) {
        ClinicBean bean = ct.fromEntityToBean(cr.findById(id));
        return bean;
    }

    @Override
    public ClinicBean addClinic(ClinicBean clinicBean) {
         ClinicEntity entity = ct.fromBeanToEntity(clinicBean);
        entity = cr.add(entity);
        clinicBean = ct.fromEntityToBean(entity);
        return clinicBean;
    }

    @Override
    public ClinicBean updateClinic(ClinicBean clinicBean) {
        
         ClinicEntity entity = ct.fromBeanToEntity(clinicBean);
        entity = cr.update(entity);
        clinicBean = ct.fromEntityToBean(entity);
        return clinicBean;
    }

    @Override
    public void removeClinic(Integer id) {
          cr.remove(id);
    }

    @Override
    public ClinicBean ClinicDoctorByid(Integer id) {

 ClinicEntity foundowner = cr.findById(id);
        ClinicBean clinicBean = ct.fromEntityToBeanWithDoctor(foundowner);
        return clinicBean;

    }

    @Override
    public ClinicBean searchclinicBynumber(String number) {
      ClinicBean bean = ct.fromEntityToBean((ClinicEntity) cr.findLick(number));
        return bean;  

    }
    
    }

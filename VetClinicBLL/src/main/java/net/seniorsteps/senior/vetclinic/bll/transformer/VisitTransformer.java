/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.vetclinic.bll.transformer;


import net.seniorsteps.senior.vetclinic.common.PetBean;
import net.seniorsteps.senior.vetclinic.common.VisitBean;

import net.seniorsteps.senior.vetclinic.dal.entity.PetEntity;
import net.seniorsteps.senior.vetclinic.dal.entity.VisitEntity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

/**
 *
 * @author dell
 */
@Component
public class VisitTransformer implements CommonTransformer<VisitEntity, VisitBean> {

    
    @Autowired
    ClinicTransformer ct;
    @Autowired
    PetTransformer pt;
  
    @Autowired
    DoctorTransformer dt;
    
    
    
    @Override
    public VisitBean fromEntityToBean(VisitEntity entity) {
        VisitBean bean =new VisitBean();
        bean.setId(entity.getId());
        bean.setDate(entity.getDate());
        bean.setClinic(ct.fromEntityToBean(entity.getClinic()));
        bean.setDoctor(dt.fromEntityToBean(entity.getDoctor()));
        bean.setPet(pt.fromEntityToBean(entity.getPet()));
        return bean;
    }

    @Override
    public VisitEntity fromBeanToEntity(VisitBean bean) {
        VisitEntity entity= new VisitEntity();
        entity.setId(bean.getId());
        entity.setDate(bean.getDate());
        entity.setClinic(ct.fromBeanToEntity(bean.getClinic()));
        entity.setDoctor(dt.fromBeanToEntity(bean.getDoctor()));
        entity.setPet(pt.fromBeanToEntity(bean.getPet()));
        return entity;
    }

   


}

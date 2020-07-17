/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.vetclinic.bll.transformer;

import java.util.ArrayList;
import net.seniorsteps.senior.vetclinic.common.ClinicBean;
import net.seniorsteps.senior.vetclinic.common.DoctorBean;
import net.seniorsteps.senior.vetclinic.dal.entity.ClinicEntity;
import net.seniorsteps.senior.vetclinic.dal.entity.DoctorEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author dell
 */
@Component
public class ClinicTransformer implements CommonTransformer<ClinicEntity, ClinicBean> {
    @Autowired
    private DoctorTransformer dt;
    @Override
    public ClinicBean fromEntityToBean(ClinicEntity entity) {
        ClinicBean bean=new ClinicBean();
        bean.setAddress(entity.getAddress());
        bean.setCloseAt(entity.getCloseAt());
        bean.setOpenAt(entity.getOpenAt());
        bean.setEmail(entity.getEmail());
        bean.setId(entity.getId());
        bean.setName(entity.getName());
        bean.setUrl(entity.getUrl());
        bean.setWorkingDays(entity.getWorkingDays());
        bean.setPhone(entity.getPhone());
        return bean;
    }

    @Override
    public ClinicEntity fromBeanToEntity(ClinicBean bean) {
        ClinicEntity entity=new ClinicEntity();
        entity.setAddress(bean.getAddress());
        entity.setCloseAt(bean.getCloseAt());
        entity.setOpenAt(bean.getOpenAt());
        entity.setEmail(bean.getEmail());
        entity.setId(bean.getId());
        entity.setName(bean.getName());
        entity.setUrl(bean.getUrl());
        entity.setPhone(bean.getPhone());
        return entity;
    }
    
    
    
      public ClinicBean fromEntityToBeanWithDoctor(ClinicEntity clinicEntity) {
        ClinicBean clinicBean = fromEntityToBean(clinicEntity);
        clinicBean.setDoctorBean(new ArrayList<>());
        for (DoctorEntity doctorEntity : clinicEntity.getDoctors()) {
            DoctorBean doctorBean = dt.fromEntityToBean(doctorEntity);
            clinicBean.getDoctorBean().add(doctorBean);
        }
        return clinicBean;
    }


}

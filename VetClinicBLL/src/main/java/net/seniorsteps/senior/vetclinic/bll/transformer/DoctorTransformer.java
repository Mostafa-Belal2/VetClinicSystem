/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.vetclinic.bll.transformer;

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
public class DoctorTransformer implements CommonTransformer<DoctorEntity, DoctorBean> {
    @Autowired
    ClinicTransformer ct;

    @Override
    public DoctorBean fromEntityToBean(DoctorEntity entity) {
        DoctorBean bean=new DoctorBean();
        bean.setBioPath(entity.getBioPath());
        bean.setIdr(entity.getIdr());
        bean.setName(entity.getName());
        bean.setPhone(entity.getPhone());
        bean.setPhotoPath(entity.getPhotoPath());
        bean.setClinic(ct.fromEntityToBean(entity.getClinic()));
        return bean;

        
    }

    @Override
    public DoctorEntity fromBeanToEntity(DoctorBean bean) {
        DoctorEntity entity=new DoctorEntity();
        entity.setBioPath(bean.getBioPath());
        entity.setIdr(bean.getIdr());
        entity.setName(bean.getName());
        entity.setPhone(bean.getPhone());
        entity.setPhotoPath(bean.getPhotoPath());
        entity.setClinic(ct.fromBeanToEntity(bean.getClinic()));
        return entity;
    }

   

}

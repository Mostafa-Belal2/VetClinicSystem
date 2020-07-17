package net.seniorsteps.senior.vetclinic.bll.managerImpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.List;
import net.seniorsteps.senior.vetclinic.bll.manager.DoctorManager;
import net.seniorsteps.senior.vetclinic.bll.transformer.DoctorTransformer;
import net.seniorsteps.senior.vetclinic.common.DoctorBean;
import net.seniorsteps.senior.vetclinic.dal.entity.DoctorEntity;
import net.seniorsteps.senior.vetclinic.dal.repo.DoctorRepo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dell
 */
@Transactional
@Service
public class DoctorManagerImpl implements DoctorManager{
    @Autowired
    DoctorTransformer ct;
    
    @Autowired
    DoctorRepo cr;

    @Override
    public List<DoctorBean> listdoctor() {
        List<DoctorBean> listDoctor = new ArrayList<>();
        List<DoctorEntity> users = cr.findList();
        for (DoctorEntity user : users) {
            listDoctor.add(ct.fromEntityToBean(user));
        }
        return listDoctor;
    }

    @Override
    public DoctorBean finddoctorById(Integer id) {
        DoctorBean bean = ct.fromEntityToBean(cr.findById(id));
        return bean;
    }

    @Override
    public DoctorBean adddoctor(DoctorBean doctorBean) {
   DoctorEntity entity = ct.fromBeanToEntity(doctorBean);
        entity = cr.add(entity);
        doctorBean = ct.fromEntityToBean(entity);
        return doctorBean;
    }

    @Override
    public DoctorBean updatedoctor(DoctorBean doctorBean) {
        DoctorEntity entity = ct.fromBeanToEntity(doctorBean);
        entity = cr.update(entity);
        doctorBean = ct.fromEntityToBean(entity);
        return doctorBean;
    }
    

    @Override
    public void removedoctor(Integer id) {
  cr.remove(id);
    }
        
}
   
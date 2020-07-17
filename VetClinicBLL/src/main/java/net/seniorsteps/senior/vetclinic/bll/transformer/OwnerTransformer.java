/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.vetclinic.bll.transformer;


import java.util.ArrayList;
import net.seniorsteps.senior.vetclinic.common.OwnerBean;
import net.seniorsteps.senior.vetclinic.common.PetBean;
import net.seniorsteps.senior.vetclinic.dal.entity.DoctorEntity;
import net.seniorsteps.senior.vetclinic.dal.entity.OwnerEntity;
import net.seniorsteps.senior.vetclinic.dal.entity.PetEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 *
 * @author dell
 */
@Component
public class OwnerTransformer implements CommonTransformer<OwnerEntity, OwnerBean> {
@Autowired    
PetTransformer pt;


    @Override
    public OwnerBean fromEntityToBean(OwnerEntity entity) {
        OwnerBean bean =new OwnerBean();
        bean.setAddress(entity.getAddress());
        bean.setEmail(entity.getEmail());
        bean.setGender(entity.getGender());
        bean.setId(entity.getId());
        bean.setName(entity.getName());
        bean.setPhone(entity.getPhone());
        return bean;
    }

    @Override
    public OwnerEntity fromBeanToEntity(OwnerBean bean) {
        
        
        OwnerEntity entity =new OwnerEntity();
        entity.setAddress(bean.getAddress());
        entity.setEmail(bean.getEmail());
        entity.setGender(bean.getGender());
        entity.setId(bean.getId());
        entity.setName(bean.getName());
        entity.setPhone(bean.getPhone());
        
        return entity;
    }
    
    
      public OwnerBean fromEntityToBeanWithOwners(OwnerEntity ownerEntity) {
        OwnerBean ownerBean = fromEntityToBean(ownerEntity);
        ownerBean.setOwnerBean(new ArrayList<>());
        for (PetEntity petEntity : ownerEntity.getPets()) {
            PetBean petBean = pt.fromEntityToBean(petEntity);
            ownerBean.getOwnerBean().add(petBean);
        }
        return ownerBean;
    }


}

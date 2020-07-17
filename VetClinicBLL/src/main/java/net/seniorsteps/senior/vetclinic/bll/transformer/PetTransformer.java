/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.vetclinic.bll.transformer;


import net.seniorsteps.senior.vetclinic.common.PetBean;

import net.seniorsteps.senior.vetclinic.dal.entity.PetEntity;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Component;

/**
 *
 * @author dell
 */
@Component
public class PetTransformer implements CommonTransformer<PetEntity, PetBean> {
@Autowired    
OwnerTransformer ot;




    @Override
    public PetBean fromEntityToBean(PetEntity entity) {
        PetBean bean =new PetBean();
        bean.setAnimalKind(entity.getAnimalKind());
        bean.setDateOfBirth(entity.getDateOfBirth());
        bean.setGender(entity.getGender());
        bean.setId(entity.getId());
        bean.setName(entity.getName());
        bean.setPhotoPath(entity.getPhotoPath());
        bean.setWeight(entity.getWeight());
        bean.setOwner(ot.fromEntityToBean(entity.getOwner()));
        
        return bean;
        
    }

    @Override
    public PetEntity fromBeanToEntity(PetBean bean) {
        PetEntity entity=new PetEntity();
        entity.setAnimalKind(bean.getAnimalKind());
        entity.setDateOfBirth(bean.getDateOfBirth());
        entity.setGender(bean.getGender());
        entity.setName(bean.getName());
        entity.setPhotoPath(bean.getPhotoPath());
        entity.setWeight(bean.getWeight());
        entity.setId(bean.getId());
        entity.setOwner(ot.fromBeanToEntity(bean.getOwner()));
        return entity;
    }

   


}

package net.seniorsteps.senior.vetclinic.bll.managerImpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.List;
import net.seniorsteps.senior.vetclinic.bll.manager.PetManager;
import net.seniorsteps.senior.vetclinic.bll.transformer.PetTransformer;
import net.seniorsteps.senior.vetclinic.common.PetBean;
import net.seniorsteps.senior.vetclinic.dal.entity.PetEntity;
import net.seniorsteps.senior.vetclinic.dal.repo.PetRepo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dell
 */
@Transactional
@Service
public class PetManagerImpl implements PetManager{
    
    @Autowired
    PetTransformer ct;
    
    @Autowired
    PetRepo cr;

    @Override
    public List<PetBean> listpet() {
        List<PetBean> listPet = new ArrayList<>();
        List<PetEntity> users = cr.findList();
        for (PetEntity user : users) {
            listPet.add(ct.fromEntityToBean(user));
        }
        return listPet;
        
    }

    @Override
    public PetBean findPetById(Integer id) {
         PetBean bean = ct.fromEntityToBean(cr.findById(id));
        return bean;
    }

    @Override
    public PetBean addPet(PetBean petBean) {
         PetEntity entity = ct.fromBeanToEntity(petBean);
        entity = cr.add(entity);
        petBean = ct.fromEntityToBean(entity);
        return petBean;
    }

    @Override
    public PetBean updatePet(PetBean petBean) {
          PetEntity entity = ct.fromBeanToEntity(petBean);
        entity = cr.update(entity);
        petBean = ct.fromEntityToBean(entity);
        return petBean;
    }

    @Override
    public void removePet(Integer id) {
         cr.remove(id);
    }

   

    
    }

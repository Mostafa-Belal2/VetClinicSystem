package net.seniorsteps.senior.vetclinic.bll.managerImpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.ArrayList;
import java.util.List;
import net.seniorsteps.senior.vetclinic.bll.manager.OwnerManager;
import net.seniorsteps.senior.vetclinic.bll.transformer.OwnerTransformer;
import net.seniorsteps.senior.vetclinic.common.OwnerBean;
import net.seniorsteps.senior.vetclinic.dal.entity.OwnerEntity;
import net.seniorsteps.senior.vetclinic.dal.repo.OwnerRepo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dell
 */
@Transactional
@Service
public class OwnerManagerImpl implements OwnerManager{
    
    @Autowired
    OwnerTransformer ct;
    
    @Autowired
    OwnerRepo cr;

    @Override
    public List<OwnerBean> listowner() {
        List<OwnerBean> listOwner = new ArrayList<>();
        List<OwnerEntity> users = cr.findList();
        for (OwnerEntity user : users) {
            listOwner.add(ct.fromEntityToBean(user));
        }
        return listOwner;
        
    }

    @Override
    public OwnerBean findOwnerById(Integer id) {
         OwnerBean bean = ct.fromEntityToBean(cr.findById(id));
        return bean;
    }

    @Override
    public OwnerBean addOwner(OwnerBean ownerBean) {
         OwnerEntity entity = ct.fromBeanToEntity(ownerBean);
        entity = cr.add(entity);
        ownerBean = ct.fromEntityToBean(entity);
        return ownerBean;
    }

    @Override
    public OwnerBean updateOwner(OwnerBean ownerBean) {
          OwnerEntity entity = ct.fromBeanToEntity(ownerBean);
        entity = cr.update(entity);
        ownerBean = ct.fromEntityToBean(entity);
        return ownerBean;
    }

    @Override
    public void removeOwner(Integer id) {
         cr.remove(id);
    }

    @Override
    public OwnerBean OwnerPetByid(Integer id) {
        OwnerEntity foundowner = cr.findById(id);
        OwnerBean ownerBean = ct.fromEntityToBeanWithOwners(foundowner);
        return ownerBean;
    }


   
    
    }

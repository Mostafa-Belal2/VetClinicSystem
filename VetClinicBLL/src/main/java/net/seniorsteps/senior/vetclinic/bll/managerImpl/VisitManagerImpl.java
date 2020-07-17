package net.seniorsteps.senior.vetclinic.bll.managerImpl;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.ArrayList;
import java.util.List;
import net.seniorsteps.senior.vetclinic.bll.manager.VisitManager;
import net.seniorsteps.senior.vetclinic.bll.transformer.VisitTransformer;
import net.seniorsteps.senior.vetclinic.common.VisitBean;
import net.seniorsteps.senior.vetclinic.dal.entity.VisitEntity;
import net.seniorsteps.senior.vetclinic.dal.repo.VisitRepo;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author dell
 */
@Transactional
@Service
public class VisitManagerImpl implements VisitManager{
     @Autowired
    VisitTransformer ct;
    
    @Autowired
    VisitRepo cr;
    
    
    @Override
    public List<VisitBean> listvisit() {
        List<VisitBean> listVisit = new ArrayList<>();
        List<VisitEntity> users = cr.findList();
        for (VisitEntity user : users) {
            listVisit.add(ct.fromEntityToBean(user));
        }
        return listVisit;
        
    }

    @Override
    public VisitBean findVisitById(Integer id) {
         VisitBean bean = ct.fromEntityToBean(cr.findById(id));
        return bean;
    }

    @Override
    public VisitBean addVisit(VisitBean visitBean) {
        VisitEntity entity = ct.fromBeanToEntity(visitBean);
        entity = cr.add(entity);
        visitBean = ct.fromEntityToBean(entity);
        return visitBean;
    }

    @Override
    public VisitBean updateVisit(VisitBean visitBean) {
  VisitEntity entity = ct.fromBeanToEntity(visitBean);
        entity = cr.update(entity);
        visitBean = ct.fromEntityToBean(entity);
        return visitBean;
    }

    @Override
    public void removeVisit(Integer id) {
 cr.remove(id);
    }

   
    
    }

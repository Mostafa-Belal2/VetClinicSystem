/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.vetclinic.bll.manager;

import java.util.List;
import net.seniorsteps.senior.vetclinic.common.OwnerBean;


/**
 *
 * @author dell
 */
public interface OwnerManager {

    public List<OwnerBean> listowner();
    public OwnerBean OwnerPetByid(Integer id);

    public OwnerBean findOwnerById(Integer id);

    public OwnerBean addOwner(OwnerBean ownerBean);

    public OwnerBean updateOwner(OwnerBean ownerBean);
    public void removeOwner(Integer id);
}

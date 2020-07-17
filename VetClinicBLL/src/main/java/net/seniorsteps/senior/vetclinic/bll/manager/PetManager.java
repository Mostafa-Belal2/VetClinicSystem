package net.seniorsteps.senior.vetclinic.bll.manager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import net.seniorsteps.senior.vetclinic.common.PetBean;



/**
 *
 * @author dell
 */
public interface PetManager {

    public List<PetBean> listpet();

    public PetBean findPetById(Integer id);

    public PetBean addPet(PetBean petBean);

    public PetBean updatePet(PetBean petBean);
    public void removePet(Integer id);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior;


import java.util.List;
import net.seniorsteps.senior.vetclinic.bll.SeniorBLGateway;
import net.seniorsteps.senior.vetclinic.common.PetBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetController {

    @Autowired
    private SeniorBLGateway bllGateway;

   final String SUCCESS = "{\"action\": \"Successfully\"}";
    final String Fail = "{\"action\": \"Failed\"}";
  

    @GetMapping("/getPet")
    public List<PetBean> getPet() {
        return bllGateway.listpet();
    }

    @PostMapping("/updatePet")
    public String updatePet(@RequestBody PetBean bean) {
        try {
            bllGateway.updatePet(bean);
            return SUCCESS;
        } catch (Exception e) {
            return Fail;
        }
    }

    @PostMapping("/addPet")
    public String addPet(@RequestBody PetBean bean) {
        try {
            bllGateway.addPet(bean);
            return SUCCESS;
        } catch (Exception e) {
            return Fail;
        }
    }

    @PostMapping("/getPetById")
    public PetBean getPetById(@RequestParam(value = "id", defaultValue = "0") int id) {
        return bllGateway.findPetById(id);
    }

    @PostMapping("/deletePet")
    public String deletePet(@RequestParam(value = "id", defaultValue = "0") int id) {
        try {
            bllGateway.removePet(id);
            return SUCCESS;
        } catch (Exception e) {
            return Fail;
        }
    }

    public SeniorBLGateway getBllGateway() {
        return bllGateway;
    }

    public void setBllGateway(SeniorBLGateway bllGateway) {
        this.bllGateway = bllGateway;
    }

   

}

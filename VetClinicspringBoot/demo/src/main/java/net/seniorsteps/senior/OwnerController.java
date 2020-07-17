/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior;


import java.util.List;
import net.seniorsteps.senior.vetclinic.bll.SeniorBLGateway;
import net.seniorsteps.senior.vetclinic.common.OwnerBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OwnerController {

    @Autowired
    private SeniorBLGateway bllGateway;

   final String SUCCESS = "{\"action\": \"Successfully\"}";
    final String Fail = "{\"action\": \"Failed\"}";
  

    @GetMapping("/getOwner")
    public List<OwnerBean> getOwner() {
        return bllGateway.listowner();
    }

    @PostMapping("/updateOwner")
    public String updateOwner(@RequestBody OwnerBean bean) {
        try {
            bllGateway.updateOwner(bean);
            return SUCCESS;
        } catch (Exception e) {
            return Fail;
        }
    }

    @PostMapping("/addOwner")
    public String addOwner(@RequestBody OwnerBean bean) {
        try {
            bllGateway.addOwner(bean);
            return SUCCESS;
        } catch (Exception e) {
            return Fail;
        }
    }

    @PostMapping("/getOwnerById")
    public OwnerBean getOwnerById(@RequestParam(value = "id", defaultValue = "0") int id) {
        return bllGateway.findOwnerById(id);
    }
    
     @PostMapping("/getOwnerPetById")
    public OwnerBean getOwnerPetsById(@RequestParam(value = "id", defaultValue = "0") int id) {
        return bllGateway.OwnerPetByid (id);
    }

    

    @PostMapping("/deleteOwner")
    public String deleteOwner(@RequestParam(value = "id", defaultValue = "0") int id) {
        try {
            bllGateway.removeOwner(id);
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior;


import java.util.List;
import net.seniorsteps.senior.vetclinic.bll.SeniorBLGateway;
import net.seniorsteps.senior.vetclinic.common.DoctorBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoctorController {

    @Autowired
    private SeniorBLGateway bllGateway;

   final String SUCCESS = "{\"action\": \"Successfully\"}";
    final String Fail = "{\"action\": \"Failed\"}";
  

    @GetMapping("/getDoctor")
    public List<DoctorBean> getDoctor() {
        return bllGateway.listdoctor();
    }

    @PostMapping("/updateDoctor")
    public String updateDoctor(@RequestBody DoctorBean bean) {
        try {
            bllGateway.updatedoctor(bean);
            return SUCCESS;
        } catch (Exception e) {
            return Fail;
        }
    }

    @PostMapping("/addDoctor")
    public String addDoctor(@RequestBody DoctorBean bean) {
        try {
            bllGateway.adddoctor(bean);
            return SUCCESS;
        } catch (Exception e) {
            return Fail;
        }
    }

    @PostMapping("/getDoctorById")
    public DoctorBean getDoctorById(@RequestParam(value = "id", defaultValue = "0") int id) {
        return bllGateway.finddoctorById(id);
    }

    @PostMapping("/deleteDoctor")
    public String deleteDoctor(@RequestParam(value = "id", defaultValue = "0") int id) {
        try {
            bllGateway.removedoctor(id);
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

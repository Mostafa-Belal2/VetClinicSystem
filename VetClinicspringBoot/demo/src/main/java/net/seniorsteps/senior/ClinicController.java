/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior;


import java.util.List;
import net.seniorsteps.senior.vetclinic.bll.SeniorBLGateway;
import net.seniorsteps.senior.vetclinic.common.ClinicBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClinicController {

    @Autowired
    private SeniorBLGateway bllGateway;

   final String SUCCESS = "{\"action\": \"Successfully\"}";
    final String Fail = "{\"action\": \"Failed\"}";
  

    @GetMapping("/getallClinics")
    public List<ClinicBean> getallClinics() {
        return bllGateway.listclinic();
    }

    @PostMapping("/updateClinic")
    public String updateClinic(@RequestBody ClinicBean bean) {
        try {
            bllGateway.updateClinic(bean);
            return SUCCESS;
        } catch (Exception e) {
            return Fail;
        }
    }

    @PostMapping("/addClinic")
    public String addClinic(@RequestBody ClinicBean bean) {
        try {
            bllGateway.addClinic(bean);
            return SUCCESS;
        } catch (Exception e) {
            return Fail;
        }
    }

    @PostMapping("/getClinicById")
    public ClinicBean getClinicById(@RequestParam(value = "id", defaultValue = "0") int id) {
        return bllGateway.findClinicById(id);
    }
    @PostMapping("/getClinicDoctorById")
    public ClinicBean getClinicDoctorById(@RequestParam(value = "id", defaultValue = "0") int id) {
        return bllGateway.ClinicDoctorByid(id);
    }
    @PostMapping("/getClinicDoctorById")
    public ClinicBean searchclinicBynumber(@RequestParam(value = "number", defaultValue = "0") String number) {
        return bllGateway.searchclinicBynumber(number);
    }

    @PostMapping("/deleteClinic")
    public String deleteClinic(@RequestParam(value = "id", defaultValue = "0") int id) {
        try {
            bllGateway.removeClinic(id);
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

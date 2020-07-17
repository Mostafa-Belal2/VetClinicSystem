/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior;


import java.util.List;
import net.seniorsteps.senior.vetclinic.bll.SeniorBLGateway;
import net.seniorsteps.senior.vetclinic.common.VisitBean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VisitController {

    @Autowired
    private SeniorBLGateway bllGateway;

   final String SUCCESS = "{\"action\": \"Successfully\"}";
    final String Fail = "{\"action\": \"Failed\"}";
  

    @GetMapping("/getVisit")
    public List<VisitBean> getVisit() {
        return bllGateway.listvisit();
    }

    @PostMapping("/updateVisit")
    public String updateVisit(@RequestBody VisitBean bean) {
        try {
            bllGateway.updateVisit(bean);
            return SUCCESS;
        } catch (Exception e) {
            return Fail;
        }
    }

    @PostMapping("/addVisit")
    public String addVisit(@RequestBody VisitBean bean) {
        try {
            bllGateway.addVisit(bean);
            return SUCCESS;
        } catch (Exception e) {
            return Fail;
        }
    }

    @PostMapping("/getVisitById")
    public VisitBean getVisitById(@RequestParam(value = "id", defaultValue = "0") int id) {
        return bllGateway.findVisitById(id);
    }

    @PostMapping("/deleteVisit")
    public String deleteVisit(@RequestParam(value = "id", defaultValue = "0") int id) {
        try {
            bllGateway.removeVisit(id);
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

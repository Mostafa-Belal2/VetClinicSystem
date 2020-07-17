package net.seniorsteps.senior.vetclinic.bll.manager;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.List;
import net.seniorsteps.senior.vetclinic.common.VisitBean;



/**
 *
 * @author dell
 */
public interface VisitManager {

    public List<VisitBean> listvisit();

    public VisitBean findVisitById(Integer id);

    public VisitBean addVisit(VisitBean visitBean);

    public VisitBean updateVisit(VisitBean visitBean);
    public void removeVisit(Integer id);
}

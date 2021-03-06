/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.seniorsteps.senior.vetclinic.dal.repo;

import net.seniorsteps.senior.vetclinic.dal.entity.OwnerEntity;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Repository;

/**
 *
 * @author dell
 */
@Repository
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE,
        proxyMode = ScopedProxyMode.TARGET_CLASS)
public class OwnerRepo extends AbstractRepo<OwnerEntity> {

    public OwnerRepo() {
        super(OwnerEntity.class);
    }

}

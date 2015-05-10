/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.aut.se2015.nsa.persist;

import nz.aut.se2015.nsa.persist.MethodologyFacadeLocal;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import nz.aut.se2015.nsa.persist.Methodology;

/**
 *
 * @author Øyvind
 */
@Stateless
public class MethodologyFacade extends AbstractFacade<Methodology> implements MethodologyFacadeLocal {
    @PersistenceContext(unitName = "AUTSE2015NSAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MethodologyFacade() {
        super(Methodology.class);
    }
    
}

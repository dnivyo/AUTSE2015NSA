/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.aut.se2015.nsa.persist;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Øyvind
 */
@Stateless
public class ConfidenceRatingFacade extends AbstractFacade<ConfidenceRating> implements ConfidenceRatingFacadeLocal {
    @PersistenceContext(unitName = "AUTSE2015NSAPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ConfidenceRatingFacade() {
        super(ConfidenceRating.class);
    }
    
}

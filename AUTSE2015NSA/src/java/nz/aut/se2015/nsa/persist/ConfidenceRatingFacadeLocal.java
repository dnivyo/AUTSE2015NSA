/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.aut.se2015.nsa.persist;

import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Øyvind
 */
@Local
public interface ConfidenceRatingFacadeLocal {

    void create(ConfidenceRating confidenceRating);

    void edit(ConfidenceRating confidenceRating);

    void remove(ConfidenceRating confidenceRating);

    ConfidenceRating find(Object id);

    List<ConfidenceRating> findAll();

    List<ConfidenceRating> findRange(int[] range);

    int count();
    
}

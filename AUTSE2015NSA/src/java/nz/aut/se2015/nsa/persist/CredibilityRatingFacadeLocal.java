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
public interface CredibilityRatingFacadeLocal {

    void create(CredibilityRating credibilityRating);

    void edit(CredibilityRating credibilityRating);

    void remove(CredibilityRating credibilityRating);

    CredibilityRating find(Object id);

    List<CredibilityRating> findAll();

    List<CredibilityRating> findRange(int[] range);

    int count();
    
}

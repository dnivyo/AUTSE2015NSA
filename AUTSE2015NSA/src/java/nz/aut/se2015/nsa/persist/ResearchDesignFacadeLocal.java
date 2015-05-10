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
public interface ResearchDesignFacadeLocal {

    void create(ResearchDesign researchDesign);

    void edit(ResearchDesign researchDesign);

    void remove(ResearchDesign researchDesign);

    ResearchDesign find(Object id);

    List<ResearchDesign> findAll();

    List<ResearchDesign> findRange(int[] range);

    int count();
    
}

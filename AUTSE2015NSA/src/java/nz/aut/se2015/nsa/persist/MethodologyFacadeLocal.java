/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.aut.se2015.nsa.persist;

import java.util.List;
import javax.ejb.Local;
import nz.aut.se2015.nsa.persist.Methodology;

/**
 *
 * @author Øyvind
 */
@Local
public interface MethodologyFacadeLocal {

    void create(Methodology methodology);

    void edit(Methodology methodology);

    void remove(Methodology methodology);

    Methodology find(Object id);

    List<Methodology> findAll();

    List<Methodology> findRange(int[] range);

    int count();
    
}

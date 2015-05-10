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
public interface MethodFacadeLocal {

    void create(Method method);

    void edit(Method method);

    void remove(Method method);

    Method find(Object id);

    List<Method> findAll();

    List<Method> findRange(int[] range);

    int count();
    
}

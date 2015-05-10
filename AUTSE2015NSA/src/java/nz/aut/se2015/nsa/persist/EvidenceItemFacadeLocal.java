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
public interface EvidenceItemFacadeLocal {

    void create(EvidenceItem evidenceItem);

    void edit(EvidenceItem evidenceItem);

    void remove(EvidenceItem evidenceItem);

    EvidenceItem find(Object id);

    List<EvidenceItem> findAll();

    List<EvidenceItem> findRange(int[] range);

    int count();
    
}

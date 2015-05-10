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
public interface EvidenceSourceFacadeLocal {

    void create(EvidenceSource evidenceSource);

    void edit(EvidenceSource evidenceSource);

    void remove(EvidenceSource evidenceSource);

    EvidenceSource find(Object id);

    List<EvidenceSource> findAll();

    List<EvidenceSource> findRange(int[] range);

    int count();
    
}

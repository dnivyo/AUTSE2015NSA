/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.aut.se2015.nsa.persist;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 *
 * @author Øyvind
 */
@Entity
public class ConfidenceRating implements Serializable {
    @ManyToOne
    private EvidenceItem evidenceItem;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String confidenceLevel;
    private String reason;
    private String rater;

    public ConfidenceRating() {
        this.confidenceLevel = "";
        this.reason = "";
        this.rater = "";
    }
    
    

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ConfidenceRating)) {
            return false;
        }
        ConfidenceRating other = (ConfidenceRating) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nz.aut.se2015.nsa.persist.ConfidenceRating[ id=" + id + " ]";
    }

    public String getConfidenceLevel() {
        return confidenceLevel;
    }

    public void setConfidenceLevel(String confidenceLevel) {
        this.confidenceLevel = confidenceLevel;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getRater() {
        return rater;
    }

    public void setRater(String rater) {
        this.rater = rater;
    }

    public EvidenceItem getEvidenceItem() {
        return evidenceItem;
    }

    public void setEvidenceItem(EvidenceItem evidenceItem) {
        this.evidenceItem = evidenceItem;
    }
    
}

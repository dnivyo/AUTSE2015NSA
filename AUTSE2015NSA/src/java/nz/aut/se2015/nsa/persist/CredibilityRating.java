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
public class CredibilityRating implements Serializable {
    @ManyToOne
    private EvidenceSource evidenceSource;
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String credibilityLevel;
    private String reason;
    private String rater;

    public CredibilityRating() {
        this.credibilityLevel = "";
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
        if (!(object instanceof CredibilityRating)) {
            return false;
        }
        CredibilityRating other = (CredibilityRating) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nz.aut.se2015.nsa.persist.CredibilityRating[ id=" + id + " ]";
    }

    public String getCredibilityLevel() {
        return credibilityLevel;
    }

    public void setCredibilityLevel(String credibilityLevel) {
        this.credibilityLevel = credibilityLevel;
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

    public EvidenceSource getEvidenceSource() {
        return evidenceSource;
    }

    public void setEvidenceSource(EvidenceSource evidenceSource) {
        this.evidenceSource = evidenceSource;
    }
    
}

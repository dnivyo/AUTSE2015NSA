/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nz.aut.se2015.nsa.persist;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 *
 * @author Øyvind
 */
@Entity
public class EvidenceItem implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String contextWhy;
    private String contextWho;
    private String contextWhat;
    private String contextWhere;
    private String contextWhen;
    private String contextHow;
    private String benefitOutcome;
    private String evidenceItemResult;
    private String methodImplementationIntegrity;
    
    @OneToMany
    private List<Method> methods;
    
    @OneToMany
    private List<ConfidenceRating> confidenceRatings;

    public EvidenceItem() {
        this.contextWhy = "";
        this.contextWho = "";
        this.contextWhat = "";
        this.contextWhere = "";
        this.contextWhen = "";
        this.contextHow = "";
        this.benefitOutcome = "";
        this.evidenceItemResult = "";
        this.methodImplementationIntegrity = "";
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
        if (!(object instanceof EvidenceItem)) {
            return false;
        }
        EvidenceItem other = (EvidenceItem) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nz.aut.se2015.nsa.persist.EvidenceItem[ id=" + id + " ]";
    }

    public String getContextWhy() {
        return contextWhy;
    }

    public void setContextWhy(String contextWhy) {
        this.contextWhy = contextWhy;
    }

    public String getContextWho() {
        return contextWho;
    }

    public void setContextWho(String contextWho) {
        this.contextWho = contextWho;
    }

    public String getContextWhat() {
        return contextWhat;
    }

    public void setContextWhat(String contextWhat) {
        this.contextWhat = contextWhat;
    }

    public String getContextWhere() {
        return contextWhere;
    }

    public void setContextWhere(String contextWhere) {
        this.contextWhere = contextWhere;
    }

    public String getContextWhen() {
        return contextWhen;
    }

    public void setContextWhen(String contextWhen) {
        this.contextWhen = contextWhen;
    }

    public String getContextHow() {
        return contextHow;
    }

    public void setContextHow(String contextHow) {
        this.contextHow = contextHow;
    }

    public String getBenefitOutcome() {
        return benefitOutcome;
    }

    public void setBenefitOutcome(String benefitOutcome) {
        this.benefitOutcome = benefitOutcome;
    }

    public String getEvidenceItemResult() {
        return evidenceItemResult;
    }

    public void setEvidenceItemResult(String evidenceItemResult) {
        this.evidenceItemResult = evidenceItemResult;
    }

    public String getMethodImplementationIntegrity() {
        return methodImplementationIntegrity;
    }

    public void setMethodImplementationIntegrity(String methodImplementationIntegrity) {
        this.methodImplementationIntegrity = methodImplementationIntegrity;
    }

    public List<Method> getMethods() {
        return methods;
    }

    public void setMethods(List<Method> methods) {
        this.methods = methods;
    }

    public List<ConfidenceRating> getConfidenceRatings() {
        return confidenceRatings;
    }

    public void setConfidenceRatings(List<ConfidenceRating> confidenceRatings) {
        this.confidenceRatings = confidenceRatings;
    }
    
}

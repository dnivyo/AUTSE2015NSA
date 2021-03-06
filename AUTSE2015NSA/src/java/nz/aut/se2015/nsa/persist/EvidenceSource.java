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
import javax.persistence.OneToOne;

/**
 *
 * @author Øyvind
 */
@Entity
public class EvidenceSource implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    private String bibRef;
    private String researchLevel;
    private String title;
    private String author;
    private String journal;
    private String publishingYear;
    
    @OneToMany
    private List<CredibilityRating> credibilityRatings;
    @OneToMany
    private List<EvidenceItem> evidenceItems;
    @OneToOne
    private ResearchDesign researchDesign;

    public EvidenceSource() {
        this.bibRef = "";
        this.researchLevel = "";
        this.author = "";
        this.journal = "";
        this.title = "";
        this.publishingYear = "";
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
        if (!(object instanceof EvidenceSource)) {
            return false;
        }
        EvidenceSource other = (EvidenceSource) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "nz.aut.se2015.nsa.persist.EvidenceSource[ id=" + id + " ]";
    }

    public String getBibRef() {
        return bibRef;
    }

    public void setBibRef(String bibRef) {
        this.bibRef = bibRef;
    }

    public String getResearchLevel() {
        return researchLevel;
    }

    public void setResearchLevel(String researchLevel) {
        this.researchLevel = researchLevel;
    }

    public List<CredibilityRating> getCredibilityRatings() {
        return credibilityRatings;
    }

    public void setCredibilityRatings(List<CredibilityRating> credibilityRatings) {
        this.credibilityRatings = credibilityRatings;
    }

    public ResearchDesign getResearchDesign() {
        return researchDesign;
    }

    public void setResearchDesign(ResearchDesign researchDesign) {
        this.researchDesign = researchDesign;
    }

    public List<EvidenceItem> getEvidenceItems() {
        return evidenceItems;
    }

    public void setEvidenceItems(List<EvidenceItem> evidenceItems) {
        this.evidenceItems = evidenceItems;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getJournal() {
        return journal;
    }

    public void setJournal(String journal) {
        this.journal = journal;
    }

    public String getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(String publishingYear) {
        this.publishingYear = publishingYear;
    }
    
}

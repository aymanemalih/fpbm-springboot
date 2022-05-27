package ma.fpbm.fpbmback.beans;

import javax.persistence.*;

@Entity
public class ProfesseurHasModule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;

    @ManyToOne
    private Annee annee;
    @ManyToOne
    private Professeur professeur;
    @ManyToOne
    private Module module;
    @ManyToOne
    private TypeDeResponsabilite typeDeResponsabilite;
    @ManyToOne
    private Section section;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Annee getAnnee() {
        return annee;
    }

    public void setAnnee(Annee annee) {
        this.annee = annee;
    }

    public Professeur getProfesseur() {
        return professeur;
    }

    public void setProfesseur(Professeur professeur) {
        this.professeur = professeur;
    }

    public Module getModule() {
        return module;
    }

    public void setModule(Module module) {
        this.module = module;
    }

    public TypeDeResponsabilite getTypeDeResponsabilite() {
        return typeDeResponsabilite;
    }

    public void setTypeDeResponsabilite(TypeDeResponsabilite typeDeResponsabilite) {
        this.typeDeResponsabilite = typeDeResponsabilite;
    }

    public Section getSection() {
        return section;
    }

    public void setSection(Section section) {
        this.section = section;
    }
}

package ma.fpbm.fpbmback.beans;

import javax.persistence.*;

@Entity
public class Filiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String code;

    private String name;

    @ManyToOne
    private TypeFiliere typeFiliere;

    @ManyToOne
    private Professeur responsable;

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Professeur getResponsable() {
        return responsable;
    }

    public void setResponsable(Professeur responsable) {
        this.responsable = responsable;
    }

    public TypeFiliere getTypeFiliere() {
        return typeFiliere;
    }

    public void setTypeFiliere(TypeFiliere typeFiliere) {
        this.typeFiliere = typeFiliere;
    }
}
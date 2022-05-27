package ma.fpbm.fpbmback.beans;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
public class TypeFiliere {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id;

    private String code;
    private String name;

    @OneToMany
            (mappedBy = "typeFiliere")
    private List<Filiere> filieres; // Filler has many type


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

    public List<Filiere> getFilieres() {
        return filieres;
    }

    public void setFilieres(List<Filiere> filieres) {
        this.filieres = filieres;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TypeFiliere that = (TypeFiliere) o;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}

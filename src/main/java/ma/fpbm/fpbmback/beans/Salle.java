package ma.fpbm.fpbmback.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Salle {

    @Id
    private Long id;

    private String code;
    private String name;
    private Integer capacity;
    private Integer nombreDeSurveillant;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public Integer getNombreDeSurveillant() {
        return nombreDeSurveillant;
    }

    public void setNombreDeSurveillant(Integer nombreDeSurveillant) {
        this.nombreDeSurveillant = nombreDeSurveillant;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Salle salle = (Salle) o;
        return Objects.equals(name, salle.name) && Objects.equals(capacity, salle.capacity) && Objects.equals(nombreDeSurveillant, salle.nombreDeSurveillant);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, capacity, nombreDeSurveillant);
    }
}

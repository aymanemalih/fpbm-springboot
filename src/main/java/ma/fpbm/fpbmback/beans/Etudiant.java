package ma.fpbm.fpbmback.beans;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
public class Etudiant extends Personne{
    private String apogee;

    @ManyToOne
    private Filiere filiere;

    public String getApogee() {
        return apogee;
    }

    public void setApogee(String apogee) {
        this.apogee = apogee;
    }

    public Filiere getFiliere() {
        return filiere;
    }

    public void setFiliere(Filiere filiere) {
        this.filiere = filiere;
    }
}
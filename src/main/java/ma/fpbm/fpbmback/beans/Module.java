package ma.fpbm.fpbmback.beans;


import javax.persistence.*;
import java.util.List;

@Entity

public class Module {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    private String code;

    private String groupes;


    @ManyToOne
    private Semestre semestre;

    @OneToMany(mappedBy = "module")
    private List<ProfesseurHasModule> professeurHasModules;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getGroupes() {
        return groupes;
    }

    public void setGroupes(String groupes) {
        this.groupes = groupes;
    }

    public Semestre getSemestre() {
        return semestre;
    }

    public void setSemestre(Semestre semestre) {
        this.semestre = semestre;
    }

    public List<ProfesseurHasModule> getProfesseurHasModules() {
        return professeurHasModules;
    }

    public void setProfesseurHasModules(List<ProfesseurHasModule> professeurHasModules) {
        this.professeurHasModules = professeurHasModules;
    }
}

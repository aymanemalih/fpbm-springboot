package ma.fpbm.fpbmback.beans;

import javax.persistence.*;
import java.util.List;

@Entity
public class Section {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @OneToMany(mappedBy = "section")
    private List<ProfesseurHasModule> professeurHasModules;

}

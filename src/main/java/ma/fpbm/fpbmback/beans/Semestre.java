package ma.fpbm.fpbmback.beans;





import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.util.List;

@Entity
public class Semestre {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private int id;

    private String name;

    @ManyToOne
    private Filiere fillier;


    @OneToMany(mappedBy = "semestre")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private List<Module> module;

}

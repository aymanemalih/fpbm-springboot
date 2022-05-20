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
    private Professeur responsable;


}
package ma.fpbm.fpbmback.beans;

import javax.persistence.Entity;
import javax.persistence.Id;

/*
    * Cette class a pour but de representer le genre de la responsabilité d'un prof vers un module
    * Il y'a acuellement 7 type dans l'application
*/
@Entity
public class TypeDeResponsabilite {
    @Id
    private Long id;

    private String code;

    private String name;

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
}

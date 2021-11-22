
package com.umb.inicio01;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table (name="persona")

public class Persona {
    @Id
    @Column
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;
    @Column
    private String nombres;
    @Column
    private String apellidos;
    @Column
    private String programa;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    /**
     * @return the programa
     */
    public String getPrograma() {
        return programa;
    }
    
}

package org.generation.jpamysqlsample.model;

import org.springframework.web.bind.annotation.CrossOrigin;

import javax.persistence.*;

@CrossOrigin("*")
@Entity(name = "Users")
public class User
{
    @Id
    /*esta instruccion delega la tarea a la tabla*/
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    @Column(name = "last_name")
    private String lastName;

    private String email;

    public User()
    {
    }

    public User( String name, Integer id )
    {
        this.name = name;
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}

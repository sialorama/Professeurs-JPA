package org.example.Entity;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity
@NamedQuery(query = "FROM Professeur p WHERE p.nom = :nom", name = "by_nom")
public class Professeur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String nom;
    private String prenom;

    @ManyToMany
    @JoinTable(
            name = "enseigne",
            joinColumns = @JoinColumn(name = "id_professeur"),
            inverseJoinColumns = @JoinColumn(name = "id_specialite"),
            uniqueConstraints=@UniqueConstraint(columnNames={"id_specialite", "id_professeur"})
    )
    // This needs to be a collection since it's a ManyToMany relationship
    private Set<Specialite> specialites = new HashSet<>();

    // Getters et setters
    public int getId() {
        return id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public Set<Specialite> getSpecialites() {
        return specialites;
    }
    public void setSpecialites(Set<Specialite> specialites) {
        this.specialites = specialites;
    }
}


package org.example.Entity;

import org.hibernate.annotations.NamedQuery;


import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NamedQuery(query = "FROM Specialite s WHERE s.nom = :nom", name = "by_nom")

    public class Specialite {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private String nom;

        @ManyToMany(mappedBy = "specialites")
        private Set<Professeur> professeurs = new HashSet<>();

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
        public Set<Professeur> getProfesseurs() {
            return professeurs;
        }
        public void setProfesseurs(Set<Professeur> professeurs) {
            this.professeurs = professeurs;
        }
}

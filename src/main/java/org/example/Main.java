package org.example;

import org.example.Entity.Professeur;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("professeurUnit");
        EntityManager em = emf.createEntityManager();
        // Create and persist un professeur
        em.getTransaction().begin();
        Professeur professeur = new Professeur();
        professeur.setNom("KAMALI");
        professeur.setPrenom("Imane");

        em.persist(professeur);
        em.getTransaction().commit();

        // Retrieve all professors
        TypedQuery<Professeur> query = em.createQuery("SELECT p FROM Professeur p", Professeur.class);
        List<Professeur> professeurs = query.getResultList();
        for (Professeur p : professeurs) {
            System.out.println("ID: " + p.getId() + " Name: " + p.getNom());
        }
        em.close();
        emf.close();
    }

}
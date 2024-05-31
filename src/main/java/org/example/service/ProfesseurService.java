package org.example.service;

import org.example.DAO.ProfesseurDAO;
import org.example.Entity.Professeur;

import java.util.List;

public class ProfesseurService {
    // partie service - // Part of the service
    private ProfesseurDAO professeurDAO = new ProfesseurDAO();

    // Retrieve all writers
    public List getProfesseurs(){
        List professeurs = professeurDAO.getProfesseurs();
        return professeurs;
    }
/*    // Retrieve professor by name
    public Professeur getProfesseurbyName(int id){
        return professeurDAO.getProfesseur(id);
    }
    // Create a new writer
    public void create(Professeur e) {
        professeurDAO.create(e);
    }

    // Modify the professor's name by ID
    public void modifNom(int id, String nom ) {
        professeurDAO.modifNom(id, nom );
    }
    // Add a book to a writer
    public void addProfesseur(int id, Specialite l){
        professeurDAO.addSpecialite(id, l);
    }
    // Retrieve a professor by ID
    public Professeur getProfesseur(int id){
        return ProfesseurDAO.getProfesseur(id);
    }*/
}

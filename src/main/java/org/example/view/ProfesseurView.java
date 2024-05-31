package org.example.view;

import org.example.Entity.Professeur;

import java.util.List;

public class ProfesseurView {

    public void afficheProfesseurs(List<Professeur> professeurs) {
        System.out.println("Le list complète des professeurs: ");
        for (Professeur professeur: professeurs){
            System.out.println(professeur.getNom());

        }
    }
/*    public void AfficheProfesseur(Professeur professeur) {
        System.out.println(professeur.getNom() + " " + professeur.getPrenom());
        for (specialite s : professeur.getSpecialites()) {
            System.out.println(s.getNom());
        }
    }*/
    public void afficheProfesseur(List<Professeur> professeurs , int id) {

        for (Professeur professeur: professeurs) {
            if ( professeur.getId() == id ) {
                System.out.println("Le nom du rofesseur: "+professeur.getNom());
            }
        }
    }

}

package org.example.Controller;

import org.example.Entity.Professeur;
import org.example.service.ProfesseurService;
import org.example.view.ProfesseurView;

import java.util.List;

public class ProfesseurController {

    private ProfesseurService professeurService = new ProfesseurService();
    private ProfesseurView professeurView = new ProfesseurView();

    // Methode afficher la liste des professeurs
    public void AfficheProfesseurs() {
        List<Professeur> professeurs = professeurService.getProfesseurs();
        professeurView.afficheProfesseurs(professeurs);
    }
/*    // Afficher un professeur:
    public void afficheProfesseur(int id){
        Professeur e = professeurService.getProfesseur(id);
        professeurView.afficheProfesseur(e);
    }*/
/*    // Methode to create an entry in the professeur table
    public void create(Professeur e) {
        System.out.println(e.getNom());
        professeurService.create(e) ;
    }
    // Methode to modify the professeur name:
    public void modifNom(int id, String nouveauNom) {
        professeurService.modifNom(id, nouveauNom);

    }
    // Methode to add a new book:
    public void addSpecialite(int id, specialite s) {
        professeurService.addSpecialite(id, s);
    }

*/
}
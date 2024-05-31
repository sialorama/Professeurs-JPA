package org.example.DAO;

import org.example.Entity.Professeur;
import org.example.Entity.Specialite;
import org.example.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.sql.Connection;
import java.util.List;

public class ProfesseurDAO {
        public List getProfesseurs() {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query<Professeur> query = session.createQuery("from Professeur ", Professeur.class);
            List<Professeur> professeurs = query.getResultList();
            return (professeurs);
        }
        public List getSpecialite() {
            Session session = HibernateUtil.getSessionFactory().openSession();
            Query<Specialite> query = session.createQuery("from Specialite ", Specialite.class);
            List<Specialite> specialites = query.getResultList();
            return (specialites);
        }
    }

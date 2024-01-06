package com.example.gestionnertache.Repository;

import com.example.gestionnertache.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {
        Etudiant getEtudiantByNomEAndPrenomE(String nom, String prenom);

        List<Etudiant> getEtudiantByDepartement_IdDepart (Integer idDepartement);
}

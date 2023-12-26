package com.example.gestionnertache.Service;

import com.example.gestionnertache.Entity.Etudiant;

import java.util.List;

public interface EtudiantService {
    List<Etudiant> retrieveAllEtudiants();
    Etudiant addEtudiant (Etudiant e);
    Etudiant updateEtudiant (Etudiant e);
    Etudiant retrieveEtudiant(Integer idEtudiant);
    void removeEtudiant(Integer idEtudiant);

}

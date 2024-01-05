package com.example.gestionnertache.Service;

import com.example.gestionnertache.Entity.Departement;
import com.example.gestionnertache.Entity.Etudiant;
import com.example.gestionnertache.Repository.DepartementRepository;
import com.example.gestionnertache.Repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class EtudiantServiceImp implements EtudiantService{

    @Autowired
    EtudiantRepository etudiantRepository;

    @Autowired
    DepartementRepository departementRepository ;
    @Override
    public List<Etudiant> retrieveAllEtudiants() {
        return etudiantRepository.findAll();
    }

    @Override
    public Etudiant addEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant updateEtudiant(Etudiant e) {
        return etudiantRepository.save(e);
    }

    @Override
    public Etudiant retrieveEtudiant(Integer idEtudiant) {
        return etudiantRepository.findById(idEtudiant).get();
    }

    @Override
    public void removeEtudiant(Integer idEtudiant) {
            etudiantRepository.deleteById(idEtudiant);
    }

    @Override
    public void assignEtudiantToDepartement(Integer etudiantId, Integer departementId) {
        Etudiant etudiant = etudiantRepository.getById(etudiantId);
        Departement departement=departementRepository.findById(departementId).orElse(null);

        etudiant.setDepartement(departement);
        etudiantRepository.save(etudiant);
    }
}

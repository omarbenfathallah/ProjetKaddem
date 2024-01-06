package com.example.gestionnertache.Service;

import com.example.gestionnertache.Entity.Departement;
import com.example.gestionnertache.Entity.Etudiant;
import com.example.gestionnertache.Entity.Universite;
import com.example.gestionnertache.Repository.DepartementRepository;
import com.example.gestionnertache.Repository.UniversiteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class DepartementServiceImp implements DepartementService{

    @Autowired
    DepartementRepository departementRepository;

    @Autowired
    UniversiteRepository universiteRepository ;

    @Override
    public List<Departement> retrieveAllDepartements() {
        return departementRepository.findAll();
    }

    @Override
    public Departement addDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public Departement updateDepartement(Departement d) {
        return departementRepository.save(d);
    }

    @Override
    public Departement retrieveDepartement(Integer idDepart) {
        return departementRepository.findById(idDepart).get();
    }

    @Override
    public Set<Departement> retrieveDepartementsByUniversite(Integer idUniversite) {
        Universite universite = universiteRepository.findById(idUniversite).orElse(null);

        return  universite.getDepartements();
    }
}

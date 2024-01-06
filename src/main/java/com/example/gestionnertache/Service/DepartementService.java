package com.example.gestionnertache.Service;

import com.example.gestionnertache.Entity.Departement;

import java.util.List;
import java.util.Set;

public interface DepartementService {
    List<Departement> retrieveAllDepartements();
    Departement addDepartement (Departement d);
    Departement updateDepartement (Departement d);
    Departement retrieveDepartement (Integer idDepart);

    Set<Departement> retrieveDepartementsByUniversite(Integer idUniversite);

}

package com.example.gestionnertache.Service;

import com.example.gestionnertache.Entity.Departement;

import java.util.List;

public interface DepartementService {
    List<Departement> retrieveAllDepartements();
    Departement addDepartement (Departement d);
    Departement updateDepartement (Departement d);
    Departement retrieveDepartement (Integer idDepart);

}

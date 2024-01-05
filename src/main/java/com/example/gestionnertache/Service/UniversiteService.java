package com.example.gestionnertache.Service;

import com.example.gestionnertache.Entity.Universite;

import java.util.List;

public interface UniversiteService {
    List<Universite> retrieveAllUniversites();
    Universite addUniversite (Universite u);
    Universite updateUniversite (Universite u);
    Universite retrieveUniversite (Integer idUniversite);

    public void assignUniversiteToDepartement(Integer idUniversite, Integer idDepartement);

}

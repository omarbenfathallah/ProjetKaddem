package com.example.gestionnertache.Repository;

import com.example.gestionnertache.Entity.Departement;
import com.example.gestionnertache.Entity.Universite;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface DepartementRepository extends JpaRepository<Departement,Integer> {
//    @Query("select d from Departement d  JOIN d.etudiants u  where Universite.idUniv =: idUniversite ")
//    public List<Departement> retrieveDepartementsByUniversite(Integer idUniversite);
}

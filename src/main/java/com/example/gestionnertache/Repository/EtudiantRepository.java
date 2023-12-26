package com.example.gestionnertache.Repository;

import com.example.gestionnertache.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EtudiantRepository extends JpaRepository<Etudiant,Integer> {

}

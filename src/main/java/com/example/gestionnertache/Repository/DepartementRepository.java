package com.example.gestionnertache.Repository;

import com.example.gestionnertache.Entity.Departement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartementRepository extends JpaRepository<Departement,Integer> {
}

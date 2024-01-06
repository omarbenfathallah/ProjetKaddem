package com.example.gestionnertache.Controller;

import com.example.gestionnertache.Entity.Departement;
import com.example.gestionnertache.Service.UniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/Universite")
public class UniversiteController {

    @Autowired
    UniversiteService universiteService;
@PostMapping("/affecterUniversiteToDepartement/{idUniversite}/{idDepartement}")
    public void assignUniversiteToDepartement(@PathVariable("idUniversite") Integer idUniversite,@PathVariable("idDepartement") Integer idDepartement){
        universiteService.assignUniversiteToDepartement(idUniversite,idDepartement);
    }

    @GetMapping("/getByIduniv/{idUn}")
   public  Set<Departement> getByUniv(@PathVariable("idUn") Integer idUn){
             return (Set<Departement>) universiteService.retrieveUniversite(idUn);
    }
}

package com.example.gestionnertache.Controller;

import com.example.gestionnertache.Service.UniversiteService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}

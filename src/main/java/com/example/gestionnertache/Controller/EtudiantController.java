package com.example.gestionnertache.Controller;

import com.example.gestionnertache.Service.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
@RequestMapping("/Etudiant")
public class EtudiantController {
    @Autowired
    EtudiantService etudiantService;

    @PostMapping("/affecter-etudiant-departement/{idE}/{idD}")
    public void  assignEtudiantToDepartement(@PathVariable("idE") Integer idE , @PathVariable("idD") Integer idD  ){
        etudiantService.assignEtudiantToDepartement(idE,idD);
    }
}

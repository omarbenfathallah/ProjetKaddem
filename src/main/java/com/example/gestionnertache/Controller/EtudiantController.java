package com.example.gestionnertache.Controller;

import com.example.gestionnertache.Entity.Contrat;
import com.example.gestionnertache.Entity.Etudiant;
import com.example.gestionnertache.Service.ContratService;
import com.example.gestionnertache.Service.EtudiantService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Etudiant")
public class EtudiantController {
    @Autowired
    EtudiantService etudiantService;

    @Autowired
    ContratService contratService;

    @PostMapping("/affecter-etudiant-departement/{idE}/{idD}")
    public void  assignEtudiantToDepartement(@PathVariable("idE") Integer idE , @PathVariable("idD") Integer idD  ){
        etudiantService.assignEtudiantToDepartement(idE,idD);
    }
    @PostMapping("/AjouterEtAffecter-/{idC}/{idEquipe}")
    public void  addAndAssignEtudiantToEquipeAndContract(@RequestBody Etudiant etudiant, @PathVariable("idC") Integer idC , @PathVariable("idEquipe") Integer idEquipe  ){
        etudiantService.addAndAssignEtudiantToEquipeAndContract(etudiant,idC,idEquipe);
    }
    @PostMapping("/affecterContratEtudiant/{idC}/{nomE}/{prenomE}")
    public Contrat affectContratToEtudiant(@PathVariable("idC") Integer idC,@PathVariable("nomE") String nomE,@PathVariable("prenomE") String prenomE){
        return contratService.affectContratToEtudiant(idC,nomE,prenomE);
    }

    @GetMapping("/getEtudiantByIdDep/{idDep}")
    List<Etudiant> getEtudiantsByDepartement (@PathVariable("idDep") Integer idDep){
        return  etudiantService.getEtudiantsByDepartement(idDep);
    }



}

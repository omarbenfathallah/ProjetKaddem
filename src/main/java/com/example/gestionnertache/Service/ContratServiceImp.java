package com.example.gestionnertache.Service;

import com.example.gestionnertache.Entity.Contrat;
import com.example.gestionnertache.Entity.Etudiant;
import com.example.gestionnertache.Repository.ContratRepository;
import com.example.gestionnertache.Repository.EtudiantRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@AllArgsConstructor
public class ContratServiceImp implements ContratService {
    @Autowired
    ContratRepository contratRepository;

    @Autowired
    EtudiantRepository etudiantRepository;

    @Override
    public List<Contrat> retrieveAllContrats() {
        return contratRepository.findAll();
    }

    @Override
    public Contrat updateContrat(Contrat ce) {
        return contratRepository.save(ce);
    }

    @Override
    public Contrat addContrat(Contrat ce) {
        return contratRepository.save(ce);
    }

    @Override
    public Contrat retrieveContrat(Integer idContrat) {
        return contratRepository.getById(idContrat);
    }

    @Override
    public void removeContrat(Integer idContrat) {
        contratRepository.deleteById(idContrat);
    }

    @Override
    public Contrat affectContratToEtudiant(Integer ce, String nomE, String prenomE) {
        Etudiant etudiant = etudiantRepository.getEtudiantByNomEAndPrenomE(nomE, prenomE);
        Contrat contrat = contratRepository.findById(ce).orElse(null);

        Set<Contrat> contrats = etudiant.getContrats();
        int nbrContratActif = 0;

        if (contrats.size() != 0) {
            for (Contrat contrat1 : contrats) {
                if(((contrat.getArchive())!=null)&& ((contrat.getArchive())!=false))  {
                    nbrContratActif++;
                }
            }
        }
        if (nbrContratActif <= 4) {
            contrat.setEtudiant(etudiant);
            contratRepository.save(contrat);
        }

        return contrat;
    }
}
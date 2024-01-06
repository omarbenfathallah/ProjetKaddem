package com.example.gestionnertache.Service;

import com.example.gestionnertache.Entity.Contrat;

import java.util.List;

public interface ContratService {
    List<Contrat> retrieveAllContrats();
    Contrat updateContrat (Contrat ce);
    Contrat addContrat (Contrat ce);
    Contrat retrieveContrat (Integer idContrat);
    void removeContrat(Integer idContrat);

    Contrat affectContratToEtudiant (Integer ce, String nomE ,String prenomE);

}

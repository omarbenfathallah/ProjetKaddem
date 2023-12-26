package com.example.gestionnertache.Service;

import com.example.gestionnertache.Entity.Equipe;

import java.util.List;

public interface EquipeService {
    List<Equipe> retrieveAllEquipes();
    Equipe addEquipe(Equipe e); // ajouter l’équipe avec son détail
    Equipe updateEquipe (Equipe e);
    Equipe retrieveEquipe (Integer idEquipe);

}

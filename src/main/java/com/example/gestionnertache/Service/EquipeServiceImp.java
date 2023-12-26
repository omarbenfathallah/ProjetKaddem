package com.example.gestionnertache.Service;

import com.example.gestionnertache.Entity.DetailEquipe;
import com.example.gestionnertache.Entity.Equipe;
import com.example.gestionnertache.Repository.EquipeRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipeServiceImp implements EquipeService{

    @Autowired
    EquipeRepository equipeRepository;
    @Override
    public List<Equipe> retrieveAllEquipes() {
        return equipeRepository.findAll();
    }

    @Override
    public Equipe addEquipe(Equipe e) {
        DetailEquipe detailEquipe =new DetailEquipe();
        e.setDetailEquipe(detailEquipe);
        return equipeRepository.save(e);
    }

    @Override
    public Equipe updateEquipe(Equipe e) {
        return equipeRepository.save(e);
    }

    @Override
    public Equipe retrieveEquipe(Integer idEquipe) {
        return equipeRepository.findById(idEquipe).get();
    }
}

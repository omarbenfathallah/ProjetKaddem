package com.example.gestionnertache.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Equipe {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEquipe;
    private String nomEquipe;
    private Niveau niveau;

    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;

    @OneToOne
    private DetailEquipe detailEquipe;

}

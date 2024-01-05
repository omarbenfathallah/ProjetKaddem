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
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEtudiant;
    private String nomE;
    private String prenomE;
    @Enumerated(EnumType.STRING)
    private Option option;

    @ManyToOne
    private Departement departement;

    @OneToMany(cascade = CascadeType.ALL,mappedBy = "etudiant")
    private Set<Contrat>contrats;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "etudiants")
    private Set<Equipe>equipes;

}

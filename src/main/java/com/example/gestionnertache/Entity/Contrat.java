package com.example.gestionnertache.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Entity
public class Contrat {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idContrat;

    private Date dateDebutContrat;
    private Date dateFinContrat;
    private  Specialite specialite;
    private boolean archive;
    private String montantContrat;

    @ManyToOne
    private Etudiant etudiant;
}

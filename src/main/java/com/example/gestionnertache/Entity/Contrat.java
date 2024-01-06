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
    @Enumerated(EnumType.STRING)
    private  Specialite specialite;
    private boolean archive;
    private String montantContrat;

    @ManyToOne
    private Etudiant etudiant;

    public Boolean getArchive() {
        return archive;
    }
    public void setArchive(Boolean archive) {
        this.archive = archive;
    }
}

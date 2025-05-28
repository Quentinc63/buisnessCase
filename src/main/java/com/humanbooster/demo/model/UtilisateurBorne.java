package com.humanbooster.demo.model;


import java.time.LocalDate;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "utilisateur_borne")
@NoArgsConstructor
public class UtilisateurBorne {
    @EmbeddedId
    private UtilisateurBorneId id = new UtilisateurBorneId();

    
    @ManyToOne
    @MapsId("utilisateurId")  
    @JoinColumn(name = "utilisateur_id")
    private Utilisateur utilisateur;
    
    @ManyToOne
    @MapsId("borneId") 
    @JoinColumn(name = "borne_id")
    private Borne borne;
    
    @NotBlank
    private int numReservation;

    @NotNull
    private LocalDate dateFin;

    @NotNull
    private LocalDate dateDebut;

    @NotNull
    private boolean etat;
}
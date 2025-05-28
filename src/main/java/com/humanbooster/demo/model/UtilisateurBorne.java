package com.humanbooster.demo.model;


import java.time.LocalDate;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MapsId;
import jakarta.persistence.Table;
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
    
    private int numReservation;
    private LocalDate dateFin;
    private LocalDate dateDebut;
    private boolean etat;
}
package com.humanbooster.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Embeddable
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UtilisateurBorneId implements Serializable {
    @Column(name = "utilisateur_id")
    private Long utilisateurId;  
    
    @Column(name = "borne_id")
    private Long borneId;
    
}
package com.humanbooster.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "adresse")
public class Adresse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "utilisateur_id",         
        nullable = true          
    )
    private Utilisateur utilisateur;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "lieu_id",         
        nullable = true          
    )
    private Lieu lieu;

    @NotBlank
    private String nom;

    @NotBlank
    private String adresse;

    @NotBlank
    private String codePostal;

    @NotBlank
    private String ville;

    @NotBlank
    private String pays;

    @NotBlank
    private String region;

    private String complement;


    
}

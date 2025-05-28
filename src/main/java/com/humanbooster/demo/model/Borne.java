package com.humanbooster.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@Table(name = "borne")
@NoArgsConstructor
public class Borne {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String nom;
    
    @NotBlank
    private int tarif;

    @NotBlank
    private int puissance;

    @NotBlank
    private String instruction;

    @NotBlank
    private boolean occupee;

    private boolean etat;
    

    
}

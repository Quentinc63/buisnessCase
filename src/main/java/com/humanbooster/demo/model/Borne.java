package com.humanbooster.demo.model;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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
    
    @NotNull
    private int tarif;

    @NotNull
    private int puissance;

    @NotBlank
    private String instruction;

    @NotNull
    @Column(columnDefinition = "boolean default false")
    private boolean occupee;

    @NotNull
    private boolean etat;

    @OneToMany(
        mappedBy = "borne",          
        cascade = CascadeType.ALL,    
        fetch = FetchType.LAZY,       
        orphanRemoval = true          
    )
    private List<Media> medias = new ArrayList<>();
    

    
}

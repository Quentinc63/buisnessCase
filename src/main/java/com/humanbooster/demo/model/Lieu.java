package com.humanbooster.demo.model;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Data
@NoArgsConstructor
@Table(name = "lieu")
public class Lieu {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; 
    @OneToMany(
        mappedBy = "lieu",          
        cascade = CascadeType.ALL,    
        fetch = FetchType.LAZY,       
        orphanRemoval = true          
    )
    private List<Adresse> adresses = new ArrayList<>();


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "utilisateur_id",         
        nullable = false    
    )
    private Utilisateur utilisateur;
    
    @NotBlank
    private String instruction;
}

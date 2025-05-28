package com.humanbooster.demo.model;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@Table(name = "utilisateur")
public class Utilisateur {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany(
        mappedBy = "utilisateur",          
        cascade = CascadeType.ALL,    
        fetch = FetchType.LAZY,       
        orphanRemoval = true          
    )
    private List<Adresse> adresses = new ArrayList<>();

        @OneToMany(
        mappedBy = "utilisateur",          
        cascade = CascadeType.ALL,    
        fetch = FetchType.LAZY,       
        orphanRemoval = true          
    )
    private List<Lieu> Lieux = new ArrayList<>();

    @NotBlank
    @Size(min = 2, max = 30)
    private String nom;

    @NotBlank
    @Size(min = 2, max = 30)
    private String prenom;

    @Email
    @NotBlank
    private String email;

    @Column(name = "mot_de_passe")
    @NotBlank
    private String motDePasse;

    public enum Role {
        ADMIN,
        USER,
    }

    @Enumerated(jakarta.persistence.EnumType.STRING)
    @NotNull
    private Role role;

    
    @Column(name = "date_naissance")
    @NotBlank
    private String dateNaissance;
    
    @Column(name = "numero_telephone")
    @NotBlank
    private String numeroTelephone;
    

    
}

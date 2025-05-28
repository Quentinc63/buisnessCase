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
@Table(name = "media")
public class Media {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    private String url;

    @NotBlank
    private String type;

    @NotBlank
    private String description;

    @NotBlank
    private String taille;


    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(
        name = "borne_id",         
        nullable = false          
    )
    private Borne borne;

 


    
}

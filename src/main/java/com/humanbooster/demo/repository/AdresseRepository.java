package com.humanbooster.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.humanbooster.demo.model.Adresse;


@Repository
public interface AdresseRepository  extends JpaRepository<Adresse, Integer> {


}


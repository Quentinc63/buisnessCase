package com.humanbooster.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.humanbooster.demo.model.Borne;


@Repository
public interface BorneRepository  extends JpaRepository<Borne, Integer> {


}

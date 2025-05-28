package com.humanbooster.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.humanbooster.demo.model.Lieu;


@Repository
public interface LieuRepository  extends JpaRepository<Lieu, Integer> {


}

package com.humanbooster.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.humanbooster.demo.model.Media;


@Repository
public interface MediaRepository  extends JpaRepository<Media, Integer> {


}


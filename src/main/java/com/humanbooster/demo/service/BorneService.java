package com.humanbooster.demo.service;

import org.springframework.stereotype.Service;

import com.humanbooster.demo.model.Borne;
import com.humanbooster.demo.repository.BorneRepository;

import jakarta.transaction.Transactional;

@Service
public class BorneService {
    private final BorneRepository borneRepository;

    public BorneService(BorneRepository borneRepository) {
        this.borneRepository = borneRepository;
    }
    @Transactional
    public void deleteAllBorne() {
        borneRepository.deleteAll();
    }
    @Transactional
    public void deleteByIdBorne(Integer id) {
        borneRepository.deleteById(id);
    }
    @Transactional
    public void saveBorne(Borne borne) {
        borneRepository.save(borne);
    }

    
}

package com.codegym.repository;

import com.codegym.model.Smartphone;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ISmartphoneRepository extends CrudRepository<Smartphone, Long> {
    Page<Smartphone> findAllByProducerContaining(String q, Pageable pageable);

    Page<Smartphone> findAll(Pageable pageable);
}

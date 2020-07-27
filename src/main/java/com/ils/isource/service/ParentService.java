package com.ils.isource.service;

import com.ils.isource.domain.Parent;
import com.ils.isource.repository.ParentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

/**
 * Service Implementation for managing {@link Parent}.
 */
@Service
@Transactional
public class ParentService {

    private final Logger log = LoggerFactory.getLogger(ParentService.class);

    private final ParentRepository parentRepository;

    public ParentService(ParentRepository parentRepository) {
        this.parentRepository = parentRepository;
    }

    /**
     * Save a parent.
     *
     * @param parent the entity to save.
     * @return the persisted entity.
     */
    public Parent save(Parent parent) {
        log.debug("Request to save Parent : {}", parent);
        return parentRepository.save(parent);
    }

    /**
     * Get all the parents.
     *
     * @param pageable the pagination information.
     * @return the list of entities.
     */
    @Transactional(readOnly = true)
    public Page<Parent> findAll(Pageable pageable) {
        log.debug("Request to get all Parents");
        return parentRepository.findAll(pageable);
    }


    /**
     * Get one parent by id.
     *
     * @param id the id of the entity.
     * @return the entity.
     */
    @Transactional(readOnly = true)
    public Optional<Parent> findOne(Long id) {
        log.debug("Request to get Parent : {}", id);
        return parentRepository.findById(id);
    }

    /**
     * Delete the parent by id.
     *
     * @param id the id of the entity.
     */
    public void delete(Long id) {
        log.debug("Request to delete Parent : {}", id);

        parentRepository.deleteById(id);
    }
}

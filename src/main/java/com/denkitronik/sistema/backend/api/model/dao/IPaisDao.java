/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denkitronik.sistema.backend.api.model.dao;

import com.denkitronik.sistema.backend.api.model.entities.Pais;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Eduar
 */
public interface IPaisDao extends CrudRepository<Pais, Integer>{
    
}

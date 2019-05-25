/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.denkitronik.sistema.backend.api.controllers;

import com.denkitronik.sistema.backend.api.model.entities.Pais;
import com.denkitronik.sistema.backend.api.model.services.IPaisService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Eduar
 */
@RestController
@RequestMapping("/api")
public class PaisRestController {
    
    @Autowired
    private IPaisService paisService;
    
    @GetMapping(path = "/paises", produces = (MediaType.APPLICATION_JSON_VALUE))
    public List<Pais> index(){
        return paisService.findAll();
    }
    
}

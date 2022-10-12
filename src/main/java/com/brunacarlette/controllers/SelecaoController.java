/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brunacarlette.controllers;

import com.brunacarlette.models.selecao.SelecaoModel;
import com.brunacarlette.models.selecao.SelecaoRepository;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

/**
 *
 * @author india
 */
public class SelecaoController {
    
    @Autowired
    SelecaoRepository selecaoRepository;
    
    List<SelecaoModel> selecoes;
    
    @GetMapping(value = "/listar")
    public String listar(){
        this.selecoes = this.selecaoRepository.findAll();
        return "listar";
    }
    
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brunacarlette.models.selecao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


import javax.persistence.Id;
import javax.persistence.Table;

import com.brunacarlette.models.selecao.integrantes.Clube;
import com.brunacarlette.models.selecao.integrantes.Jogador;
import com.brunacarlette.models.selecao.integrantes.Tecnico;

/**
 *
 * @author india
 */

@Entity
@Table(name = "Selecoes")

public class SelecaoModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    
    @Column
    public Tecnico tecnico;
    public Jogador jogadores;
    public Clube clube;

    
}

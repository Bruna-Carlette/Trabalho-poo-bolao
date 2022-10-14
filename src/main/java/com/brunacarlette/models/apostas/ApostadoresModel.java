/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brunacarlette.models.apostas;

/**
 *
 * @author india
 */
public class ApostadoresModel {
    private String Nome;
    private String cpf;
    private String aposta;

    public ApostadoresModel(String nome, String cpf, String aposta) {
        Nome = nome;
        this.cpf = cpf;
        this.aposta = aposta;
    }
    public String getAposta() {
        return aposta;
    }
    public String getCpf() { 
        return cpf;
    }
    public String getNome() {
        return Nome;
    }
    public void setNome(String nome) {
        Nome = nome;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public void setAposta(String aposta) {
        this.aposta = aposta;
    }
}

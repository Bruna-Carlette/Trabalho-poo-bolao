/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brunacarlette.models.apostas;

/**
 *

 */
public class ApostasModel {

    private Integer placarApostador;
    private String apostaPlacarDoApostador;
    private String vencedorApostaApostador;
    private Integer pontos = 0;

   

    public void CriaAposta(String[] partidas, String tempoRodada) {
        for(int i=0;i < partidas.length; i++) {

        }
    }

    public Integer CalculaPontuacao(String placarGeral, Integer placarVisitante,Integer placarCasa ,String vencedor){
        if(apostaPlacarDoApostador == placarGeral ) {
            pontos += 10;
        } else if (vencedorApostaApostador == vencedor) {
            pontos += 5;
        } else if(placarApostador == placarVisitante || placarApostador == placarCasa) {
            pontos += 2;
        }

        return pontos;
    }

    public Integer getPlacarApostador() {
        return placarApostador;
    }

    public void setPlacarApostador(Integer placarApostador) {
        this.placarApostador = placarApostador;
    }

    public String getApostaPlacarDoApostador() {
        return apostaPlacarDoApostador;
    }

    public void setApostaPlacarDoApostador(String apostaPlacarDoApostador) {
        this.apostaPlacarDoApostador = apostaPlacarDoApostador;
    }

    public String getVencedorApostaApostador() {
        return vencedorApostaApostador;
    }

    public void setVencedorApostaApostador(String vencedorApostaApostador) {
        this.vencedorApostaApostador = vencedorApostaApostador;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

}



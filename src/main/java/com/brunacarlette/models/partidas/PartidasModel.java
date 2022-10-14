/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brunacarlette.models.partidas;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class PartidasModel {
   private Integer placarVisitante;
   private Integer placarCasa;
   private Integer op;
//    public String[] partidas = new String[10];
    ArrayList<PartidasModel> partidas = new ArrayList<PartidasModel>();

   Scanner sc= new Scanner(System.in);

    Date tempoDePartida = new Date();
    String hora = new SimpleDateFormat("HH:mm:ss").format(tempoDePartida);
    

    public PartidasModel(Integer placarVisitante, Integer placarCasa,  String hora) {
        this.placarVisitante = placarVisitante;
        this.placarCasa = placarCasa;
        this.hora = hora;
    }

   

    public void criaRodada(String Partidas) {

        while(op != 0) {
            System.out.println("Digite 0 - se deseja parar \n Digite 1 - Se deseja inserir uma partida");
            sc.nextLine();
            switch(op) {
                case 1:
                    criaPartidas();
                break;
            }
        }
    }

    public void criaPartidas() {
        partidas.add(new PartidasModel(placarVisitante,placarCasa,hora));
    }



    public Integer getPlacarVisitante() {
        return placarVisitante;
    }



    public void setPlacarVisitante(Integer placarVisitante) {
        this.placarVisitante = placarVisitante;
    }



    public Integer getPlacarCasa() {
        return placarCasa;
    }



    public void setPlacarCasa(Integer placarCasa) {
        this.placarCasa = placarCasa;
    }



    public Integer getOp() {
        return op;
    }



    public void setOp(Integer op) {
        this.op = op;
    }



    public ArrayList<PartidasModel> getPartidas() {
        return partidas;
    }



    public void setPartidas(ArrayList<PartidasModel> partidas) {
        this.partidas = partidas;
    }



    public Scanner getSc() {
        return sc;
    }



    public void setSc(Scanner sc) {
        this.sc = sc;
    }



    public Date getTempoDePartida() {
        return tempoDePartida;
    }



    public void setTempoDePartida(Date tempoDePartida) {
        this.tempoDePartida = tempoDePartida;
    }



    public String getHora() {
        return hora;
    }



    public void setHora(String hora) {
        this.hora = hora;
    }
    
}

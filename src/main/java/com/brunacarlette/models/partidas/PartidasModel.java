/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brunacarlette.models.partidas;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author india
 */
public class PartidasModel {
   public Integer placarVisitante;
   public Integer placarCasa;

    Date tempoDePartida = new Date();
    String hora = new SimpleDateFormat("HH:mm:ss").format(tempoDePartida);
    
}

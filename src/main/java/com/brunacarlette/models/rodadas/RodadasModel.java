/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.brunacarlette.models.rodadas;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author india
 */
public class RodadasModel {


    Date dataHoraAtual = new Date();
    String hora = new SimpleDateFormat("HH:mm:ss").format(dataHoraAtual);
    

    public RodadasModel(String[] partidas, Date dataHoraAtual, String hora) {
        this.dataHoraAtual = dataHoraAtual;
        this.hora = hora;
    }

    
}

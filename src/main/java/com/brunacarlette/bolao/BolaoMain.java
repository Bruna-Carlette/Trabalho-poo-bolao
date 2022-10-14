package com.brunacarlette.bolao;

import java.util.Scanner;

import com.brunacarlette.models.apostas.ApostadoresModel;
import com.brunacarlette.models.partidas.PartidasModel;
import com.brunacarlette.models.rodadas.RodadasModel;
import com.brunacarlette.models.selecao.SelecaoModel;
import com.brunacarlette.models.selecao.integrantes.Tecnico;

public class BolaoMain {
    public static void main(String[] args) {

        RodadasModel rodada = new RodadasModel(null, null, null);
        PartidasModel partidas = new PartidasModel(null, null, null);
        ApostadoresModel apostadores = new ApostadoresModel(null, null, null);  
        SelecaoModel selecao = new SelecaoModel(0, null, null, null);

    }

}

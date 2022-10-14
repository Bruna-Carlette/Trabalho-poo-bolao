package com.brunacarlette.models.selecao;

import com.brunacarlette.models.selecao.integrantes.Clube;
import com.brunacarlette.models.selecao.integrantes.Jogador;
import com.brunacarlette.models.selecao.integrantes.Tecnico;

public class SelecaoCasa extends SelecaoModel{

    public SelecaoCasa(long id, Tecnico tecnico, Jogador jogadores, Clube clube) {
        super(id, tecnico, jogadores, clube);
    }
    
}

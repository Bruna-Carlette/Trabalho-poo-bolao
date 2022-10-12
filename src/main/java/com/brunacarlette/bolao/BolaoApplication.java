package com.brunacarlette.bolao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.brunacarlette.models.selecao.SelecaoRepository;

@SpringBootApplication
public class BolaoApplication {
    
    private SelecaoRepository selecaoRepository;

    public static void main(String[] args) {
	SpringApplication.run(BolaoApplication.class, args);
    }
    
        

}

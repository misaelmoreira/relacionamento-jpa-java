package br.com.estudos.Relacionamento.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController{

    @GetMapping("/")
    public String index(){
        return "Esta e a home da minha api";
    }
}

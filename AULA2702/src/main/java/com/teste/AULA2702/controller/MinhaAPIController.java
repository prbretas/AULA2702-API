package com.teste.AULA2702.controller;

import com.teste.AULA2702.TesteAPI.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
public class MinhaAPIController {
    @GetMapping("/v1/hello")
    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping("/v1/resultado")
    public static int soma(){
        int resultado = 1 + 5;
        System.out.println(resultado);
      return resultado;
    }

    @PutMapping("/v1/clienteAPI")
    public Cliente novoCliente(@RequestBody Cliente cliente){
        Cliente clienteNovo = new Cliente();
  return cliente;
    }
/*
    @PostMapping("/v1/cliente")
    public void teste(){
   Cliente cliente2 = new Cliente("1234","joaozinho", 41, "125125");
        System.out.println(cliente2);
    }

*/
}

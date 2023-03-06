package com.teste.aula0603;

import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

@RestController
public class Aula0603Controller {

    public HashMap<Integer, Cliente> clientes = new HashMap<Integer,Cliente>();

    @PostMapping("/cliente")
    public Cliente adicionarCliente (@RequestBody Cliente c){
        clientes.put(c.getId(),c);
        String tamanhoLista = String.valueOf(clientes.size());
        System.out.println("Cliente Cadastrado com SUCESSO! " + c.getId() + " "+ c.getNome()+ " "+c.getSobrenome() + " - Quantidade de Clientes: " + tamanhoLista);
        return c;
    }

    @GetMapping("/cliente")
    public Collection<Cliente>getAllClientes(){
        return clientes.values();
    }

    //@GetMapping ("/cliente/{id}/compras{idCompra}")
    @GetMapping ("/cliente/{id}")
    public Cliente getClienteById(@PathVariable("id") int id){
        return clientes.get(id);
    }

    @PutMapping ("/cliente/{id}")
    public Cliente atualizaCliente(@PathVariable("id") int id, @RequestBody Cliente c){
        return clientes.put(id,c);
    }

    @DeleteMapping ("/cliente/{id}")
    public Cliente deletarClienteById(@PathVariable("id") int id){
        return clientes.remove(id);
    }







    }


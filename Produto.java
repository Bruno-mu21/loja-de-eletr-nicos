/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.loja;

/**
 *
 * @author Gabriel
 */
public class Produto {
    private String tipo;
    private String nome;
    private int estoque;
    
    public Produto(String tipo, String nome, int estoque) {
        this.tipo = tipo;
        this.nome = nome;
        this.estoque = estoque;
    }

    public String getTipo() {
        return tipo;
    }

    public String getNome() {
        return nome;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    
}
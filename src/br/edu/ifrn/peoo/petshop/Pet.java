/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifrn.peoo.petshop;

/**
 *
 * @author joaon
 */
public class Pet {
    
    private String nome;
    private String raca;

    @Override
    public String toString() {
        return "Pet{" + "nome=" + nome + ", raca=" + raca + '}';
    }
    
    

    public Pet() {
    }

    public Pet(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }
    
    
    
}

package com.matheusmendes.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "atividade_tb")
public class Atividade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;
    private Double preco;

    public String getNome() {
        return this.nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public Double preco() {
        return this.preco;
    }

    public Long getId() {
        return this.id;
    }

    public Atividade(){};

    public Atividade( String nome,String descricao,Double preco){
        this.nome= nome;
        this.descricao=descricao;
        this.preco=preco;
     };

}

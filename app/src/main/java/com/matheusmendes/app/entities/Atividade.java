package com.matheusmendes.app.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
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

    @ManyToMany
    @JoinTable(
        name = "tb_ativade_participante",
        joinColumns = @JoinColumn(name="atividade_id"),
        inverseJoinColumns=@JoinColumn(name="participante_id")
         )
    private Set<Participante> participantes = new HashSet<>();

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

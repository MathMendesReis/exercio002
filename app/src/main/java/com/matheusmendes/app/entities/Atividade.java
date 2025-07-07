package com.matheusmendes.app.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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

    @OneToMany(mappedBy = "atividade",cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Bloco> blocos = new ArrayList<>();


    @ManyToOne
    @JoinColumn(name = "categoria_id",nullable = false)

    private Categoria categoria;

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

    public List<Bloco> getBlocos(){
        return this.blocos;
    }

    public Set<Participante> getPartcipantes(){
        return this.participantes;
    }

    public Atividade(){};

    public Atividade( String nome,String descricao,Double preco,Categoria categoria){
        this.nome= nome;
        this.descricao=descricao;
        this.preco=preco;
        this.categoria = categoria;
     };

}

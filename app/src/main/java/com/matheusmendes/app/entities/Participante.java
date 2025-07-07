package com.matheusmendes.app.entities;

import java.util.HashSet;
import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
/*
 * Relacionamento muitos para muitos com a entidade atividade
 */
@Entity
@Table(name = "participante_tb")
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

    @ManyToMany(mappedBy = "participantes")
    private Set<Atividade> atividades = new HashSet<>();

    public Long getId(){
        return this.id;
    }


    public String getNome(){
        return this.nome;
    };

    public String getEmail(){
        return this.email;
    }

    public Participante(){};
    public Participante( String nome,String email){
        this.nome= nome;
        this.email= email;
    };

}

package com.matheusmendes.app.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "participante_tb")
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;

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

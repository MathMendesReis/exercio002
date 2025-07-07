package com.matheusmendes.app.entities;

import java.time.Instant;
import java.time.LocalDateTime;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="bloco_tb")
public class Bloco {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private Instant inicio;
    private Instant fim;

    @ManyToOne
    @JoinColumn(name = "atividade_id",nullable = false)
    private Atividade atividade;

    public Instant getInicio(){
        return this.inicio;
    };
     public Instant getFim(){
        return this.fim;
    };

    public Bloco(){};

    public Bloco(Instant inicio,Instant fim,Atividade atividade){
        this.inicio = inicio;
        this.fim = fim;
        this.atividade = atividade;
    };

}

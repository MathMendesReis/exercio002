package com.matheusmendes.app.entities;

import java.util.ArrayList;
import java.util.List;

import com.matheusmendes.app.utils.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "categoria_tb")
public class Categoria extends BaseEntity{

    private String descricao;

    @OneToMany(mappedBy = "categoria")
    private List<Atividade> atividades = new ArrayList<>();

    public String getDescricao(){
        return this.descricao;
    }
    public Categoria(){};

    public Categoria(String descricao){
        this.descricao = descricao;
    };

}

package com.diario.plantas.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;

@Entity
public class Planta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String nome;
    private String tipo;
    private String descricao;
    private int diasParaRegar;

    // Construtores
    public Planta(){};

    public Planta(String nome, String tipo, String descricao, int diasParaRegar){
        this.nome = nome;
        this.tipo = tipo;
        this.descricao = descricao;
        this.diasParaRegar = diasParaRegar;
    }

    //Getter e Setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

  public String getNome() {
        return nome;
  }
  public void setNome(String nome) {
        this.nome = nome;
  }

  public String getTipo() {
        return tipo;
  }
  public void setTipo(String tipo) {
        this.tipo = tipo;
  }

  public String getDescricao() {
        return descricao;
  }
  public void setDescricao(String descricao) {
        this.descricao = descricao;
  }

  public int getDiasParaRegar() {
        return diasParaRegar;
  }
  public void setDiasParaRegar(int diasParaRegar) {
        this.diasParaRegar = diasParaRegar;
  }

}

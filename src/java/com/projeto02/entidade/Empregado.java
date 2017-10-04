package com.projeto02.entidade;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;

@Entity
public class Empregado extends Pessoa implements Serializable{
    private double salario;
    
    @ManyToMany
    private List<Atividade> atividades;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public List<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(List<Atividade> atividades) {
        this.atividades = atividades;
    }
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.eatsysJPA.domainModel;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Ana Luiza
 */
@Entity
@Table(name="cronogramaDeAtividade")
public class CronogramaDeAtividade implements Serializable {
    
    public CronogramaDeAtividade() {
        this.descricao = "";
        this.numeroAtividade = 0;
        this.dataInicio = new Date();
        this.dataFim = new Date();
    
        this.planoDeTrabalho = new PlanoDeTrabalho();
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="descricao")
    private String descricao;
    
    @Column(name="numeroAtividade")
    private int numeroAtividade;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicio;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataFim;
    
    @ManyToOne
    PlanoDeTrabalho planoDeTrabalho = new PlanoDeTrabalho();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNumeroAtividade() {
        return numeroAtividade;
    }

    public void setNumeroAtividade(int numeroAtividade) {
        this.numeroAtividade = numeroAtividade;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public PlanoDeTrabalho getPlanoDeTrabalho() {
        return planoDeTrabalho;
    }

    public void setPlanoDeTrabalho(PlanoDeTrabalho planoDeTrabalho) {
        this.planoDeTrabalho = planoDeTrabalho;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.descricao);
        hash = 37 * hash + this.numeroAtividade;
        hash = 37 * hash + Objects.hashCode(this.dataInicio);
        hash = 37 * hash + Objects.hashCode(this.dataFim);
        hash = 37 * hash + Objects.hashCode(this.planoDeTrabalho);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final CronogramaDeAtividade other = (CronogramaDeAtividade) obj;
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        if (!Objects.equals(this.dataFim, other.dataFim)) {
            return false;
        }
        if (!Objects.equals(this.planoDeTrabalho, other.planoDeTrabalho)) {
            return false;
        }
        return true;
    }
    
    

    

    @Override
    public String toString() {
        return descricao;
    }
    
}

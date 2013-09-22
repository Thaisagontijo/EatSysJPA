/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.eatsysJPA.domainModel;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Ana Luiza
 */
@Entity
@Table(name="participantesProjetos")
public class ParticipanteProjeto extends Pessoa implements Serializable {
    
    public ParticipanteProjeto() {
        this.nome = "";
        this.titulacao = "";
        this.observacao = "";
        this.campus = new Campus();
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idParticipante")
    private Long id;
    
    @Column(name="nome")
    private String nome;
    
    @Column(name="titulacao")
    private String titulacao;
    
    @Column(name="observacao")
    private String observacao;
    
    @ManyToOne
    private Campus campus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulacao() {
        return titulacao;
    }

    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
        hash = 71 * hash + Objects.hashCode(this.nome);
        hash = 71 * hash + Objects.hashCode(this.titulacao);
        hash = 71 * hash + Objects.hashCode(this.observacao);
        hash = 71 * hash + Objects.hashCode(this.campus);
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
        final ParticipanteProjeto other = (ParticipanteProjeto) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.titulacao, other.titulacao)) {
            return false;
        }
        if (!Objects.equals(this.observacao, other.observacao)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return nome;
    }
    
}

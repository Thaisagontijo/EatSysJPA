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
import javax.persistence.Table;

/**
 *
 * @author Ana Luiza
 */
@Entity
@Table(name="CursoArea")
public class CursoArea implements Serializable {

    public CursoArea(String nome, String sigla) {
        this.nome = nome;
        this.sigla = sigla;
    }
    
    public CursoArea() {
        this.nome = "";
        this.sigla = "";
    }
        
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name="nome")
    private String nome;
    
    @Column(name="sigla", length=255)
    private String sigla;
    
    
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

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.nome);
        hash = 83 * hash + Objects.hashCode(this.sigla);
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
        final CursoArea other = (CursoArea) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sigla, other.sigla)) {
            return false;
        }
        return true;
    }

    
    
    

    @Override
    public String toString() {
        return this.getNome();
    }
    
}

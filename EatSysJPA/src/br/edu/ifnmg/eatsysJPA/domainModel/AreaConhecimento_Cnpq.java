/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.eatsysJPA.domainModel;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Ana Luiza
 */
@Entity
@Table(name="areaConhecimentoCnpq")
public class AreaConhecimento_Cnpq implements Serializable {
    
    public AreaConhecimento_Cnpq() {
        
        this.codigo = "";
        this.nome = "";
        this.listaAreasConhecimento = new LinkedList<>();
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="codigo")
    private String codigo;
    
    @Column(name="nome")
    private String nome;
    
    @OneToMany
    private List<AreaConhecimento_CnpqSubAreas> listaAreasConhecimento;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<AreaConhecimento_CnpqSubAreas> getListaAreasConhecimento() {
        return listaAreasConhecimento;
    }

    public void setListaAreasConhecimento(List<AreaConhecimento_CnpqSubAreas> listaAreasConhecimento) {
        this.listaAreasConhecimento = listaAreasConhecimento;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.codigo);
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.listaAreasConhecimento);
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
        final AreaConhecimento_Cnpq other = (AreaConhecimento_Cnpq) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.listaAreasConhecimento, other.listaAreasConhecimento)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return nome;
    }
    
}

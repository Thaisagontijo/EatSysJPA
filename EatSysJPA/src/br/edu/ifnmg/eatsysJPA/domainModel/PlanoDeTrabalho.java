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
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Ana Luiza
 */
@Entity
@Table(name="planoDeTrabalhos")
public class PlanoDeTrabalho implements Serializable {
    
    public PlanoDeTrabalho() {
        this.introducao = "";
        this.justificativa = "";
        this.objetivos = "";
        this.metodologia = "";
        this.resultadoEsperado = "";
        this.referenciaBibliografica = "";
        this.dataInicio = new Date();
        this.dataTermino = new Date();;
        
        this.alunoPlanoTrabalho = new Aluno();
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="introducao")
    private String introducao;
    
    @Column(name="justificativa")
    private String justificativa;
    
    @Column(name="objetivos")
    private String objetivos;
    
    @Column(name="metodologia")
    private String metodologia;
    
    @Column(name="resultadoEsperado")
    private String resultadoEsperado;
    
    @Column(name="referenciaBibliografica")
    private String referenciaBibliografica;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicio;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataTermino;
   
    @ManyToOne
    private Aluno alunoPlanoTrabalho; 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIntroducao() {
        return introducao;
    }

    public void setIntroducao(String introducao) {
        this.introducao = introducao;
    }

    public String getJustificativa() {
        return justificativa;
    }

    public void setJustificativa(String justificativa) {
        this.justificativa = justificativa;
    }

    public String getObjetivos() {
        return objetivos;
    }

    public void setObjetivos(String objetivos) {
        this.objetivos = objetivos;
    }

    public String getMetodologia() {
        return metodologia;
    }

    public void setMetodologia(String metodologia) {
        this.metodologia = metodologia;
    }

    public String getResultadoEsperado() {
        return resultadoEsperado;
    }

    public void setResultadoEsperado(String resultadoEsperado) {
        this.resultadoEsperado = resultadoEsperado;
    }

    public String getReferenciaBibliografica() {
        return referenciaBibliografica;
    }

    public void setReferenciaBibliografica(String referenciaBibliografica) {
        this.referenciaBibliografica = referenciaBibliografica;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(Date dataTermino) {
        this.dataTermino = dataTermino;
    }

    public Aluno getAlunoPlanoTrabalho() {
        return alunoPlanoTrabalho;
    }

    public void setAlunoPlanoTrabalho(Aluno alunoPlanoTrabalho) {
        this.alunoPlanoTrabalho = alunoPlanoTrabalho;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.introducao);
        hash = 67 * hash + Objects.hashCode(this.justificativa);
        hash = 67 * hash + Objects.hashCode(this.objetivos);
        hash = 67 * hash + Objects.hashCode(this.metodologia);
        hash = 67 * hash + Objects.hashCode(this.resultadoEsperado);
        hash = 67 * hash + Objects.hashCode(this.referenciaBibliografica);
        hash = 67 * hash + Objects.hashCode(this.dataInicio);
        hash = 67 * hash + Objects.hashCode(this.dataTermino);
        hash = 67 * hash + Objects.hashCode(this.alunoPlanoTrabalho);
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
        final PlanoDeTrabalho other = (PlanoDeTrabalho) obj;
        if (!Objects.equals(this.introducao, other.introducao)) {
            return false;
        }
        if (!Objects.equals(this.justificativa, other.justificativa)) {
            return false;
        }
        if (!Objects.equals(this.objetivos, other.objetivos)) {
            return false;
        }
        if (!Objects.equals(this.metodologia, other.metodologia)) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        if (!Objects.equals(this.dataTermino, other.dataTermino)) {
            return false;
        }
        if (!Objects.equals(this.alunoPlanoTrabalho, other.alunoPlanoTrabalho)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return introducao;
    }
    
}

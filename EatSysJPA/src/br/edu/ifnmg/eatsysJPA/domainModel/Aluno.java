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
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Ana Luiza
 */
@Entity
@Table(name="Alunos")


public class Aluno extends Pessoa implements Serializable {
    
    /*###################  ATRIBUTOS ###############################*/
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idAluno")
    private Long id;
    
    @Column(name="matricula")
    private int matricula;
    
    @Column(name="tituloEleitoral")
    private String tituloEleitoral;
    
    @Column(name="zonaEleitoral")
    private String zonaEleitoral;
    
    @Column(name="secaoEleitoral")
    private String secaoEleitoral;
    
    @Column(name="situacaoMilitar")
    private String situacaoMilitar;
    
    @Column(name="certidaoMilitar")
    private String certidaoMilitar;
    
    @Column(name="nomePai")
    private String nomePai;
    
    @Column(name="rgPai")
    private String rgPai;
    
    @Column(name="orgaoExpedidorPai")
    private String orgaoExpedidorPai;
    
    @Column(name="cfpPai")
    private int cpfPai;
    
    @Column(name="nomeMae")
    private String nomeMae;
    
    @Column(name="rgMae")
    private String rgMae;
    
    @Column(name="orgaoExpedidorMae")
    private String orgaoExpedidorMae;
    
    @Column(name="cpfMae")
    private int cpfMae;
    
    @Column(name="localTrabalho")
    private String localTrabalho;
    
    @Column(name="telefoneLocalTrabalho")
    private String telefoneLocalTrabalho;
    
    @ManyToOne
    private CursoArea alunoCurso;
    
     /*###################  FIM ATRIBUTOS ###############################*/
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getTituloEleitoral() {
        return tituloEleitoral;
    }

    public void setTituloEleitoral(String tituloEleitoral) {
        this.tituloEleitoral = tituloEleitoral;
    }

    public String getZonaEleitoral() {
        return zonaEleitoral;
    }

    public void setZonaEleitoral(String zonaEleitoral) {
        this.zonaEleitoral = zonaEleitoral;
    }

    public String getSecaoEleitoral() {
        return secaoEleitoral;
    }

    public void setSecaoEleitoral(String secaoEleitoral) {
        this.secaoEleitoral = secaoEleitoral;
    }

    public String getSituacaoMilitar() {
        return situacaoMilitar;
    }

    public void setSituacaoMilitar(String situacaoMilitar) {
        this.situacaoMilitar = situacaoMilitar;
    }

    public String getCertidaoMilitar() {
        return certidaoMilitar;
    }

    public void setCertidaoMilitar(String certidaoMilitar) {
        this.certidaoMilitar = certidaoMilitar;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getRgPai() {
        return rgPai;
    }

    public void setRgPai(String rgPai) {
        this.rgPai = rgPai;
    }

    public String getOrgaoExpedidorPai() {
        return orgaoExpedidorPai;
    }

    public void setOrgaoExpedidorPai(String orgaoExpedidorPai) {
        this.orgaoExpedidorPai = orgaoExpedidorPai;
    }

    public int getCpfPai() {
        return cpfPai;
    }

    public void setCpfPai(int cpfPai) {
        this.cpfPai = cpfPai;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getRgMae() {
        return rgMae;
    }

    public void setRgMae(String rgMae) {
        this.rgMae = rgMae;
    }

    public String getOrgaoExpedidorMae() {
        return orgaoExpedidorMae;
    }

    public void setOrgaoExpedidorMae(String orgaoExpedidorMae) {
        this.orgaoExpedidorMae = orgaoExpedidorMae;
    }

    public int getCpfMae() {
        return cpfMae;
    }

    public void setCpfMae(int cpfMae) {
        this.cpfMae = cpfMae;
    }

    public String getLocalTrabalho() {
        return localTrabalho;
    }

    public void setLocalTrabalho(String localTrabalho) {
        this.localTrabalho = localTrabalho;
    }

    public String getTelefoneLocalTrabalho() {
        return telefoneLocalTrabalho;
    }

    public void setTelefoneLocalTrabalho(String telefoneLocalTrabalho) {
        this.telefoneLocalTrabalho = telefoneLocalTrabalho;
    }

    public CursoArea getAlunoCurso() {
        return alunoCurso;
    }

    public void setAlunoCurso(CursoArea alunoCurso) {
        this.alunoCurso = alunoCurso;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + this.matricula;
        hash = 23 * hash + Objects.hashCode(this.tituloEleitoral);
        hash = 23 * hash + Objects.hashCode(this.zonaEleitoral);
        hash = 23 * hash + Objects.hashCode(this.secaoEleitoral);
        hash = 23 * hash + Objects.hashCode(this.situacaoMilitar);
        hash = 23 * hash + Objects.hashCode(this.certidaoMilitar);
        hash = 23 * hash + Objects.hashCode(this.nomePai);
        hash = 23 * hash + Objects.hashCode(this.rgPai);
        hash = 23 * hash + Objects.hashCode(this.orgaoExpedidorPai);
        hash = 23 * hash + this.cpfPai;
        hash = 23 * hash + Objects.hashCode(this.nomeMae);
        hash = 23 * hash + Objects.hashCode(this.rgMae);
        hash = 23 * hash + Objects.hashCode(this.orgaoExpedidorMae);
        hash = 23 * hash + this.cpfMae;
        hash = 23 * hash + Objects.hashCode(this.localTrabalho);
        hash = 23 * hash + Objects.hashCode(this.telefoneLocalTrabalho);
        hash = 23 * hash + Objects.hashCode(this.alunoCurso);
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
        final Aluno other = (Aluno) obj;
        if (this.matricula != other.matricula) {
            return false;
        }
        return true;
    }
    
    
    

    @Override
    public String toString() {
        return getNome();
    }
    
}

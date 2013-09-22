/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.edu.ifnmg.eatsysJPA.domainModel;

import java.io.Serializable;
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
@Table(name="orientadores")
//@DiscriminatorValue("Orientador")
public class Orientador extends Pessoa implements Serializable {
    
     public Orientador() {
        this.matriculaSiape = 0;
        this.localPermanencia = "";
        this.formacaoUniversitaria = "";
        this.tituloAcademico = "";
        this.telefoneRamal = "";
        this.cursoArea = new CursoArea();
        //this.idOrientador = 0;
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="idOrientador")
    private Long id;
    
    @Column(name="matriculaSiape")
    private int matriculaSiape;
    
    @Column(name="localPermanencia")
    private String localPermanencia;
    
    @Column(name="formacaoUniversitaria")    
    private String formacaoUniversitaria;
    
    @Column(name="tituloAcademico")    
    private String tituloAcademico;
    
    @Column(name="telefoneRamal")    
    private String telefoneRamal;
    
    @ManyToOne
    private CursoArea cursoArea;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getMatriculaSiape() {
        return matriculaSiape;
    }

    public void setMatriculaSiape(int matriculaSiape) {
        this.matriculaSiape = matriculaSiape;
    }

    public String getLocalPermanencia() {
        return localPermanencia;
    }

    public void setLocalPermanencia(String localPermanencia) {
        this.localPermanencia = localPermanencia;
    }

    public String getFormacaoUniversitaria() {
        return formacaoUniversitaria;
    }

    public void setFormacaoUniversitaria(String formacaoUniversitaria) {
        this.formacaoUniversitaria = formacaoUniversitaria;
    }

    public String getTituloAcademico() {
        return tituloAcademico;
    }

    public void setTituloAcademico(String tituloAcademico) {
        this.tituloAcademico = tituloAcademico;
    }

    public String getTelefoneRamal() {
        return telefoneRamal;
    }

    public void setTelefoneRamal(String telefoneRamal) {
        this.telefoneRamal = telefoneRamal;
    }

    public CursoArea getCursoArea() {
        return cursoArea;
    }

    public void setCursoArea(CursoArea cursoArea) {
        this.cursoArea = cursoArea;
    }

    

    @Override
    public String toString() {
        return getNome();
    }
    
}

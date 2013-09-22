/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.eatsysJPA.domainModel;

import java.io.Serializable;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;

/**
 *
 * @author Ana Luiza
 */
@Entity
@Table(name="projetoPesquisa")
public class ProjetoPesquisa implements Serializable {
    
    public ProjetoPesquisa() {
        this.titulo = "";
        this.dataInicio = new Date();
        this.dataTermino = new Date();
        this.grupoPesquisa = "";
        this.resumo = "";
        this.financiamentoAprovado = 0;
        this.valorFinanciamento = 0;
        this.dataFinanciamento = new Date();
        this.bolsasIniciacao = 0;
        this.numeroBolsas = 0;
        this.agenciaFinanciadora = "";
        this.convenio = 0;
        this.nomeConvenio = "";
        this.fundacao = 0;
        this.fundacaoNome = "";
        this.projetoMulticampi = 0;
        this.campus = new Campus();
        this.orientador = new Orientador();
        this.areaConhecimento = new AreaConhecimento_CnpqSubAreas();
        this.aluno = new Aluno();
        this.listaParticipantes = new LinkedList<>();
    }
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="titulo")
    private String titulo;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataInicio;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataTermino;
    
    @Column(name="grupoPesquisa")
    private String grupoPesquisa;
    
    @Column(name="resumo")
    private String resumo;
    
    @Column(name="financiamenetoAprovado")
    private int financiamentoAprovado;
    
    @Column(name="valorFinanciamento")
    private float valorFinanciamento;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date dataFinanciamento;
    
    @Column(name="bolsasIniciacao")
    private int bolsasIniciacao;
    
    @Column(name="numeroBolsas")
    private int numeroBolsas;
    
    @Column(name="agenciaFinanciadora")
    private String agenciaFinanciadora;
    
    @Column(name="convenio")
    private int convenio;
    
    @Column(name="nomeConvenio")
    private String nomeConvenio;
    
    @Column(name="fundacao")
    private int fundacao;
    
    @Column(name="fundacaoNome")
    private String fundacaoNome;
    
    @Column(name="projetoMulticampi")
    private int projetoMulticampi;
    
    @ManyToOne
    private Campus campus;
    
    @ManyToOne
    private Orientador orientador;
    
    @ManyToOne
    private AreaConhecimento_CnpqSubAreas areaConhecimento;
     
    @ManyToOne
    private Aluno aluno;
    
    @ManyToMany
    private List<ParticipanteProjeto> listaParticipantes;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getGrupoPesquisa() {
        return grupoPesquisa;
    }

    public void setGrupoPesquisa(String grupoPesquisa) {
        this.grupoPesquisa = grupoPesquisa;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getFinanciamentoAprovado() {
        return financiamentoAprovado;
    }

    public void setFinanciamentoAprovado(int financiamentoAprovado) {
        this.financiamentoAprovado = financiamentoAprovado;
    }

    public float getValorFinanciamento() {
        return valorFinanciamento;
    }

    public void setValorFinanciamento(float valorFinanciamento) {
        this.valorFinanciamento = valorFinanciamento;
    }

    public Date getDataFinanciamento() {
        return dataFinanciamento;
    }

    public void setDataFinanciamento(Date dataFinanciamento) {
        this.dataFinanciamento = dataFinanciamento;
    }

    public int getBolsasIniciacao() {
        return bolsasIniciacao;
    }

    public void setBolsasIniciacao(int bolsasIniciacao) {
        this.bolsasIniciacao = bolsasIniciacao;
    }

    public int getNumeroBolsas() {
        return numeroBolsas;
    }

    public void setNumeroBolsas(int numeroBolsas) {
        this.numeroBolsas = numeroBolsas;
    }

    public String getAgenciaFinanciadora() {
        return agenciaFinanciadora;
    }

    public void setAgenciaFinanciadora(String agenciaFinanciadora) {
        this.agenciaFinanciadora = agenciaFinanciadora;
    }

    public int getConvenio() {
        return convenio;
    }

    public void setConvenio(int convenio) {
        this.convenio = convenio;
    }

    public String getNomeConvenio() {
        return nomeConvenio;
    }

    public void setNomeConvenio(String nomeConvenio) {
        this.nomeConvenio = nomeConvenio;
    }

    public int getFundacao() {
        return fundacao;
    }

    public void setFundacao(int fundacao) {
        this.fundacao = fundacao;
    }

    public String getFundacaoNome() {
        return fundacaoNome;
    }

    public void setFundacaoNome(String fundacaoNome) {
        this.fundacaoNome = fundacaoNome;
    }

    public int getProjetoMulticampi() {
        return projetoMulticampi;
    }

    public void setProjetoMulticampi(int projetoMulticampi) {
        this.projetoMulticampi = projetoMulticampi;
    }

    public Campus getCampus() {
        return campus;
    }

    public void setCampus(Campus campus) {
        this.campus = campus;
    }

    public Orientador getOrientador() {
        return orientador;
    }

    public void setOrientador(Orientador orientador) {
        this.orientador = orientador;
    }

    public AreaConhecimento_CnpqSubAreas getAreaConhecimento() {
        return areaConhecimento;
    }

    public void setAreaConhecimento(AreaConhecimento_CnpqSubAreas areaConhecimento) {
        this.areaConhecimento = areaConhecimento;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public List<ParticipanteProjeto> getListaParticipantes() {
        return listaParticipantes;
    }

    public void setListaParticipantes(List<ParticipanteProjeto> listaParticipantes) {
        this.listaParticipantes = listaParticipantes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.id);
        hash = 97 * hash + Objects.hashCode(this.titulo);
        hash = 97 * hash + Objects.hashCode(this.dataInicio);
        hash = 97 * hash + Objects.hashCode(this.dataTermino);
        hash = 97 * hash + Objects.hashCode(this.grupoPesquisa);
        hash = 97 * hash + Objects.hashCode(this.resumo);
        hash = 97 * hash + this.financiamentoAprovado;
        hash = 97 * hash + Float.floatToIntBits(this.valorFinanciamento);
        hash = 97 * hash + Objects.hashCode(this.dataFinanciamento);
        hash = 97 * hash + this.bolsasIniciacao;
        hash = 97 * hash + this.numeroBolsas;
        hash = 97 * hash + Objects.hashCode(this.agenciaFinanciadora);
        hash = 97 * hash + this.convenio;
        hash = 97 * hash + Objects.hashCode(this.nomeConvenio);
        hash = 97 * hash + this.fundacao;
        hash = 97 * hash + Objects.hashCode(this.fundacaoNome);
        hash = 97 * hash + this.projetoMulticampi;
        hash = 97 * hash + Objects.hashCode(this.campus);
        hash = 97 * hash + Objects.hashCode(this.orientador);
        hash = 97 * hash + Objects.hashCode(this.areaConhecimento);
        hash = 97 * hash + Objects.hashCode(this.aluno);
        hash = 97 * hash + Objects.hashCode(this.listaParticipantes);
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
        final ProjetoPesquisa other = (ProjetoPesquisa) obj;
        if (!Objects.equals(this.titulo, other.titulo)) {
            return false;
        }
        if (!Objects.equals(this.dataInicio, other.dataInicio)) {
            return false;
        }
        if (!Objects.equals(this.dataTermino, other.dataTermino)) {
            return false;
        }
        if (!Objects.equals(this.campus, other.campus)) {
            return false;
        }
        if (!Objects.equals(this.orientador, other.orientador)) {
            return false;
        }
        if (!Objects.equals(this.aluno, other.aluno)) {
            return false;
        }
        if (!Objects.equals(this.listaParticipantes, other.listaParticipantes)) {
            return false;
        }
        return true;
    }

    

    @Override
    public String toString() {
        return titulo;
    }
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.eatsysJPA.domainModel;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Ana Luiza
 */
@Entity
@Inheritance(strategy= InheritanceType.JOINED)
@Table(name="Pessoa")
//@DiscriminatorColumn(name="Pessoa_FK", discriminatorType= DiscriminatorType.INTEGER)
public abstract class Pessoa implements Serializable {
    
    public Pessoa() {
        this.nome = "";
        this.cpf = 0;
        this.rg = "";
        this.rgOrgaoExpedidor = "";
        this.rgDataExpedicao = new Date();
        this.dataNascimento = new Date();
        this.enderecoRua = "";
        this.enderecoNumero = "";
        this.enderecoBairro = "";
        this.enderecoComplmento = "";
        this.enderecoCep = 0;
        this.telefoneFixo = "";
        this.telefoneCelular = "";
        this.emailEndereco = "";
        this.pessoaCampus = new Campus();
        this.pessoaNacionalidade = new Nacionalidade();
        this.pessoaCidade = new Cidade();
        this.pessoaEstado = new Estado();
    }
    
    
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    @Column(name="nome",length=255)
    private String nome;
    
    @Column(name="cpf")
    private int cpf;
    
    @Column(name="rg")
    private String rg;
    
    @Column(name="rgOrgaoExpedidor")
    private String rgOrgaoExpedidor;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="rgDataExpedicao")
    private Date rgDataExpedicao;
    
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="rgDataNascimento")
    private Date dataNascimento;
    
    @Column(name="enderecoRua")
    private String enderecoRua;
    
    @Column(name="enderecoNumero")
    private String enderecoNumero;
    
    @Column(name="enderecoBairro")
    private String enderecoBairro;
    
    @Column(name="enderecoComplemento")
    private String enderecoComplmento;
    
    @Column(name="enderecoCep")
    private int enderecoCep;
    
    @Column(name="telefoneFixo")
    private String telefoneFixo;
    
    @Column(name="telefoneCelular")
    private String telefoneCelular;
    
    @Column(name="emailEndereco")
    private String emailEndereco;
    
    
    ///@ManyToOne(fetch= FetchType.LAZY, cascade= CascadeType.ALL)
    private Campus pessoaCampus;
    
    @ManyToOne
    private Nacionalidade pessoaNacionalidade;
    
    @ManyToOne
    private Cidade pessoaCidade; 
    
    @ManyToOne
    private Estado pessoaEstado;

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

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getRgOrgaoExpedidor() {
        return rgOrgaoExpedidor;
    }

    public void setRgOrgaoExpedidor(String rgOrgaoExpedidor) {
        this.rgOrgaoExpedidor = rgOrgaoExpedidor;
    }

    public Date getRgDataExpedicao() {
        return rgDataExpedicao;
    }

    public void setRgDataExpedicao(Date rgDataExpedicao) {
        this.rgDataExpedicao = rgDataExpedicao;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }

    public String getEnderecoNumero() {
        return enderecoNumero;
    }

    public void setEnderecoNumero(String enderecoNumero) {
        this.enderecoNumero = enderecoNumero;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public String getEnderecoComplmento() {
        return enderecoComplmento;
    }

    public void setEnderecoComplmento(String enderecoComplmento) {
        this.enderecoComplmento = enderecoComplmento;
    }

    public int getEnderecoCep() {
        return enderecoCep;
    }

    public void setEnderecoCep(int enderecoCep) {
        this.enderecoCep = enderecoCep;
    }

    public String getTelefoneFixo() {
        return telefoneFixo;
    }

    public void setTelefoneFixo(String telefoneFixo) {
        this.telefoneFixo = telefoneFixo;
    }

    public String getTelefoneCelular() {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) {
        this.telefoneCelular = telefoneCelular;
    }

    public String getEmailEndereco() {
        return emailEndereco;
    }

    public void setEmailEndereco(String emailEndereco) {
        this.emailEndereco = emailEndereco;
    }

    public Campus getPessoaCampus() {
        return pessoaCampus;
    }

    public void setPessoaCampus(Campus pessoaCampus) {
        this.pessoaCampus = pessoaCampus;
    }

    public Nacionalidade getPessoaNacionalidade() {
        return pessoaNacionalidade;
    }

    public void setPessoaNacionalidade(Nacionalidade pessoaNacionalidade) {
        this.pessoaNacionalidade = pessoaNacionalidade;
    }

    public Cidade getPessoaCidade() {
        return pessoaCidade;
    }

    public void setPessoaCidade(Cidade pessoaCidade) {
        this.pessoaCidade = pessoaCidade;
    }

    public Estado getPessoaEstado() {
        return pessoaEstado;
    }

    public void setPessoaEstado(Estado pessoaEstado) {
        this.pessoaEstado = pessoaEstado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.nome);
        hash = 67 * hash + this.cpf;
        hash = 67 * hash + Objects.hashCode(this.rg);
        hash = 67 * hash + Objects.hashCode(this.rgOrgaoExpedidor);
        hash = 67 * hash + Objects.hashCode(this.rgDataExpedicao);
        hash = 67 * hash + Objects.hashCode(this.dataNascimento);
        hash = 67 * hash + Objects.hashCode(this.enderecoRua);
        hash = 67 * hash + Objects.hashCode(this.enderecoNumero);
        hash = 67 * hash + Objects.hashCode(this.enderecoBairro);
        hash = 67 * hash + Objects.hashCode(this.enderecoComplmento);
        hash = 67 * hash + this.enderecoCep;
        hash = 67 * hash + Objects.hashCode(this.telefoneFixo);
        hash = 67 * hash + Objects.hashCode(this.telefoneCelular);
        hash = 67 * hash + Objects.hashCode(this.emailEndereco);
        hash = 67 * hash + Objects.hashCode(this.pessoaCampus);
        hash = 67 * hash + Objects.hashCode(this.pessoaNacionalidade);
        hash = 67 * hash + Objects.hashCode(this.pessoaCidade);
        hash = 67 * hash + Objects.hashCode(this.pessoaEstado);
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
        final Pessoa other = (Pessoa) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (this.cpf != other.cpf) {
            return false;
        }
        if (!Objects.equals(this.rg, other.rg)) {
            return false;
        }
        return true;
    }

   

    @Override
    public String toString() {
        return this.nome;
    }
    
}

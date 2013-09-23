/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.eatsysJPA.dataAccess;

import br.edu.ifnmg.eatsysJPA.domainModel.Aluno;
import br.edu.ifnmg.eatsysJPA.domainModel.ProjetoPesquisa;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author aluno
 */
public class ProjetoPesquisaDAO extends DAOGenerico<ProjetoPesquisa> {
    
    public ProjetoPesquisaDAO(){
        super(ProjetoPesquisa.class);
    }
    
    public List<Aluno> Buscar(ProjetoPesquisa obj){
        
        String consulta = "SELECT o FROM ProjetoPesquisa o";
        
        // A parte where da consulta
        String filtro = "";

        // Guarda a lista de parâmetros da query
        HashMap<String, Object> parametros = new HashMap<String, Object>();

        // Verifica campo por campo os valores que serão filtrados
        if (obj.getId() != null) {
            filtro = " o.id =:id";
            parametros.put("id", obj.getId());
        }

        if (obj.getTitulo() != null) {
            if (filtro.length() > 0) {
                filtro = filtro + " and ";
            }
            filtro = " o.titulo =:titulo";
            parametros.put("titulo", obj.getTitulo());
        }
        
        

        if (obj.getOrientador().getNome() != "") {
            if (filtro.length() > 0) {
                filtro = filtro + " and ";
            }
            filtro = " o.orientador =:orientador";
            parametros.put("corientador", obj.getOrientador().getNome());
        }
              
 
        // Se houver filtros, coloca o "where" na consulta
        if (filtro.length() > 0) {
            consulta = consulta + " where " + filtro;
        }
                

        // Cria a consulta no JPA
        Query query = manager.createQuery(consulta);

        // Aplica os parâmetros da consulta
        for (String par : parametros.keySet()) {
            query.setParameter(par, parametros.get(par));
        }

        // Executa a consulta
        return query.getResultList();
                
 
    
    }
    
}

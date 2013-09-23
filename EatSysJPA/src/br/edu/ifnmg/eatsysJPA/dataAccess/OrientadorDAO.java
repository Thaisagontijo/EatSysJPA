/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.eatsysJPA.dataAccess;


import br.edu.ifnmg.eatsysJPA.domainModel.Orientador;
import java.util.HashMap;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Ana Luiza
 */
  

public class OrientadorDAO extends DAOGenerico<Orientador> {
    
     public OrientadorDAO(){
        super(Orientador.class);
    }
    
    public List<Orientador> Buscar(Orientador obj) {
        // Corpo da consulta
        String consulta = "Select o from Orientador o";

        // A parte where da consulta
        String filtro = "";

        // Guarda a lista de parâmetros da query
        HashMap<String, Object> parametros = new HashMap<String, Object>();

        // Verifica campo por campo os valores que serão filtrados
        if (obj.getId() != null) {
            filtro = " o.id =:id";
            parametros.put("id", obj.getId());
        }

        if (obj.getNome()!= null) {
            if (filtro.length() > 0) {
                filtro = filtro + " and ";
            }
            filtro = " o.nome =:nome";
            parametros.put("nome", obj.getNome());
        }
        
        

        if (obj.getMatriculaSiape() != 0) {
            if (filtro.length() > 0) {
                filtro = filtro + " and ";
            }
            filtro = " o.matriculaSiape =:matriculaSiape";
            parametros.put("matriculaSiape", obj.getNome());
        }
        
        
        if (obj.getMatriculaSiape() != 0) {
            if (filtro.length() > 0) {
                filtro = filtro + " and ";
            }
            filtro = " o.cpf =:cpf";
            parametros.put("cpf", obj.getNome());
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

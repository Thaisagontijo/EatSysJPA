/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.eatsysJPA.dataAccess;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Ana Luiza
 */
public abstract class DAOGenerico<T> {
    
    protected EntityManager manager;
    private EntityManagerFactory factory;
    private Class tipo;
    
    public DAOGenerico(Class t){
        factory = Persistence.createEntityManagerFactory("EatSysJPAPU");
        manager = factory.createEntityManager();
        tipo = t;
    }

   
    public boolean Salvar(T obj) {
       // Obtém a transação
       EntityTransaction transacao = manager.getTransaction();
        
       try {          
           
           // Iniciar a transação
           transacao.begin();
           
           // Persiste o objeto
           manager.persist(obj);
           
           // Se tudo correr bem, confirma a transação
           transacao.commit();
           
           return true;
       } catch(Exception ex){
           
           //Aconteceu algum problema, desfaz a transação           
           transacao.rollback();
           ex.printStackTrace();
           
           return false;
       }
       
    }
    
    

    public T Abrir(long id) {
        
       try {          
           
           // Persiste o objeto
           T obj = (T)manager.find(tipo, id);
           
           return obj;
           
       } catch(Exception ex){
           
           return null;
       }
    }

    
    public boolean Excluir(T obj) {
        // Obtém a transação
       EntityTransaction transacao = manager.getTransaction();
        
       try {          
           
           // Iniciar a transação
           transacao.begin();
           
           // Persiste o objeto
           manager.remove(obj);
           
           // Se tudo correr bem, confirma a transação
           transacao.commit();
           
           return true;
       } catch(Exception ex){
           
           //Aconteceu algum problema, desfaz a transação           
           transacao.rollback();
           
           return false;
       }
    }    
    
    
}

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package eatsysjpa;

import br.edu.ifnmg.eatsysJPA.dataAccess.EstadoDAO;
import br.edu.ifnmg.eatsysJPA.domainModel.Campus;
import br.edu.ifnmg.eatsysJPA.domainModel.Cidade;
import br.edu.ifnmg.eatsysJPA.domainModel.CursoArea;
import br.edu.ifnmg.eatsysJPA.domainModel.Estado;
import br.edu.ifnmg.eatsysJPA.domainModel.Nacionalidade;
import br.edu.ifnmg.eatsysJPA.domainModel.Orientador;
import java.sql.SQLException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Ana Luiza
 */
public class EatSysJPA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
     
        Estado obj = new Estado();
        
        EstadoDAO estado = new EstadoDAO(null);
        obj.setNome("São Paulo");
        obj.setUf("SP");
        estado.Salvar(obj);
        
    
        
    }
    
}

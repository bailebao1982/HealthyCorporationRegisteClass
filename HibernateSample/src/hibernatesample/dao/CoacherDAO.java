/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatesample.dao;


import hibernatesample.entity.Coacher;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author wewezhu
 */
public class CoacherDAO {
    
     private Session session;
     
     private CoacherDAO(Session session){
         this.session = session;
     }
    
    public Coacher addCoacher(Coacher coacher){
        session.save(coacher);
        return coacher;
    }
    
    public boolean reomveCoacher(Coacher coacher){
        session.delete(coacher);
        return true;
    }
    
    public Coacher updateCoacher(Coacher coacher){
        session.update(coacher);
        return coacher;
    }
    
    public Coacher findCoaherById(Long id){
       
        String hql = "from Coacher as coacher where coacher.id = :id"; 
        Query query = session.createQuery(hql);
        
        query.setLong("id", id);
        List<Coacher> list = query.list();
        
        return list.get(0);
    }
    
    public Coacher findCoacherByName(String name){
        String hql = "from Coacher as coacher where coacher.name = :name"; 
        Query query = session.createQuery(hql);
        
        query.setString("name", name);
        List<Coacher> list = query.list();
        
        return list.get(0);
    }
    
    
}

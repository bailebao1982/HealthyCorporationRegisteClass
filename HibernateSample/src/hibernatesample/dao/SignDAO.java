/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatesample.dao;


import hibernatesample.entity.Sign;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author wewezhu
 */
public class SignDAO {
  
     private Session session;
     
     private SignDAO(Session session){
         this.session = session;
     }
    
    public Sign addSign(Sign sign){
        session.save(sign);
        return sign;
    }
    
    public Sign updateSign(Sign sign){
        session.update(sign);
        return sign;
    }
    
    public boolean removeSign(Sign sign){
        session.delete(sign);
        return true;
    }
    
    public Sign findSignById(Long id){
        String hql = "from Sign as sign where sign.id = :id"; 
        Query query = session.createQuery(hql);
        
        query.setLong("id", id);
        List<Sign> list = query.list();
        
        return list.get(0);
    }
    
    public List<Sign> findSignByCustomerId(Long customerId){
        String hql = "from Sign as sign where sign.customerId = :customerId"; 
        Query query = session.createQuery(hql);
        
        query.setLong("customerId", customerId);
        List<Sign> list = query.list();
        
        return list;
    }
    
    public List<Sign> findSignByCoacherId(Long coacherId){
         String hql = "from Sign as sign where sign.coacherId = :coacherId"; 
        Query query = session.createQuery(hql);
        
        query.setLong("coacherId", coacherId);
        List<Sign> list = query.list();
        
        return list;
    }
    
    
}

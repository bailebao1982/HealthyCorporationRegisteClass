/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatesample.dao;

import hibernatesample.entity.Coacher;
import hibernatesample.entity.Customer;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author wewezhu
 */
public class CustomerDAO {
    
      private Session session;
     
     private CustomerDAO(Session session){
         this.session = session;
     }
    
    public Customer addCustomer(Customer customer){
        session.save(customer);
        return customer;
    }
    
    public Customer updateCustomer(Customer customer){
        session.update(customer);
        return customer;
    }
    
    public boolean removeCustomer(Customer customer){
        session.delete(customer);
        return true;
    }
    
    public Customer findCustomerById(Long customerId){
        
        String hql = "from Customer as customer where customer.id = :id"; 
        Query query = session.createQuery(hql);
        
        query.setLong("id", customerId);
        List<Customer> list = query.list();
        
        return list.get(0);
    }
    
    public Customer findCustomerByName(String name){
        String hql = "from Customer as customer where customer.name = :name"; 
        Query query = session.createQuery(hql);
        
        query.setString("name", name);
        List<Customer> list = query.list();
        
        return list.get(0);
    }
    
}

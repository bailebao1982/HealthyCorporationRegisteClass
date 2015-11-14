/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.wx.dao.impl;

import com.wx.dao.SalesRecordDAO;
import com.wx.entity.Customer;
import com.wx.entity.SalesRecord;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.SessionFactory;

/**
 *
 * @author wewezhu
 */
public class SalesRecordDAOImpl implements SalesRecordDAO{
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        //this.session = this.sessionFactory.getCurrentSession();
    }

    @Override
    public SalesRecord findSalesRecordByCustomer(String customer) {
         String hql = "from SalesRecord as salesRecord where salesRecord.Customer = :customer"; 
        Query query = sessionFactory.getCurrentSession().createQuery(hql);
        
        query.setString("customer", customer);
        List<SalesRecord> list = query.list();
        
        if(list.size()>0){
            return list.get(0);
        }else{
            return null;
        }
    }
    
    
}

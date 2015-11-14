/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hibernatesample;

import hibernatesample.entity.Coacher;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;

/**
 *
 * @author wewezhu
 */
public class HibernateSample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Configuration cfg = new Configuration().configure();

        //SchemaExport export = new SchemaExport(cfr);  
        //export.create(true, true);
        SessionFactory factory = cfg.buildSessionFactory();

        Session session = null;
        try {
            session = factory.openSession();
            
            session.beginTransaction();
            Coacher coacher = new Coacher();
            coacher.setName("测试1");
            coacher.setId(2L);
            session.save(coacher);
            
            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();

            session.getTransaction().rollback();
        } finally {
            if (session != null) {
                if (session.isOpen()) {

                    session.close();
                }
            }
        }
    }

}

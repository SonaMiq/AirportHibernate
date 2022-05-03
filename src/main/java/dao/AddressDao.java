package dao;

import Service.MySessionFactory;
import model.Address;
import org.hibernate.Session;


public class AddressDao {

    public void create(Address address){

        Session session= MySessionFactory.getFactory().openSession();
        session.beginTransaction();
        session.save(address);
        session.getTransaction().commit();
        session.close();

    }

}

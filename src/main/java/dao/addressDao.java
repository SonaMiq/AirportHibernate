package dao;

import model.Address;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class addressDao {
    Configuration configuration = new Configuration();
    SessionFactory factory = configuration.buildSessionFactory();
    Session session=factory.openSession();
    public void create(Address address){
        session.persist(address);
    }
    public void update(long id,Address address){
    }

}

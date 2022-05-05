package repasitory;

import Service.MySessionFactory;
import model.Address;
import org.hibernate.Session;

import javax.persistence.Query;
import java.util.List;


public class AddressRepo {

    public void create(Address address){

        Session session= MySessionFactory.getFactory().openSession();
        session.beginTransaction();
        session.save(address);
        session.getTransaction().commit();
        session.close();

    }
    public Address read(Long id){
        Session session= MySessionFactory.getFactory().openSession();
        session.beginTransaction();
        Address adrs=session.find(Address.class,id);
        session.getTransaction().commit();
        session.close();
        return adrs;
    }

    public void update(Long id,Address address){
        Session session= MySessionFactory.getFactory().openSession();
        session.beginTransaction();
        Address adrs=session.find(Address.class,id);
        adrs.setCity(address.getCity());
        adrs.setCountry(address.getCountry());
        session.update(adrs);
        session.getTransaction().commit();
        session.close();
    }
    public void delete(Long id){
        Session session= MySessionFactory.getFactory().openSession();
        session.beginTransaction();
        session.remove(session.find(Address.class,id));
        session.getTransaction().commit();
        session.close();
    }
    public List<Address> getAll(){
        Session session= MySessionFactory.getFactory().openSession();
        session.beginTransaction();
       Query query= session.createQuery("from Address",Address.class);
        List<Address> addresses=  query.getResultList();
        session.getTransaction().commit();
        session.close();
        return addresses;
    }

}

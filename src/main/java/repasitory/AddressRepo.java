package repasitory;

import Service.MySessionFactory;
import model.Address;
import org.hibernate.Session;


public class AddressRepo {
   private Session session;

   public AddressRepo(){
       this.session= MySessionFactory.getFactory().openSession();
   }

    public void create(Address address){

        session.beginTransaction();
        session.save(address);
        session.getTransaction().commit();
        session.close();

    }

}

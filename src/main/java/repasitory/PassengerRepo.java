package repasitory;

import Service.MySessionFactory;
import model.Passenger;
import org.hibernate.Session;

public class PassengerRepo {
   private Session session;
    public PassengerRepo(){
        this.session = MySessionFactory.getFactory().openSession();
    }

    public void create(Passenger passenger) {

        session.beginTransaction();
        session.save(passenger);
        session.getTransaction().commit();
        session.close();
    }
}

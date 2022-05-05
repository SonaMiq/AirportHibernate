package repasitory;

import Service.MySessionFactory;
import model.Passenger;
import org.hibernate.Session;

public class PassengerRepo {


    public void create(Passenger passenger) {

        Session  session = MySessionFactory.getFactory().openSession();
        session.beginTransaction();
        session.save(passenger);
        session.getTransaction().commit();
        session.close();
    }

}

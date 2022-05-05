package repasitory;

import Service.MySessionFactory;

import model.PassInTrip;
import org.hibernate.Session;

public class PassInTripRepo {


    public void create(PassInTrip passInTrip) {

        Session session = MySessionFactory.getFactory().openSession();
        session.beginTransaction();
        session.save(passInTrip);
        session.getTransaction().commit();
        session.close();
    }

}

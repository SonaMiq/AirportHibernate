package repasitory;

import Service.MySessionFactory;
import model.Trip;
import org.hibernate.Session;

public class TripRepo {
    private Session session;

    public TripRepo(){
        session= MySessionFactory.getFactory().openSession();
    }
    public void create(Trip trip){

        session.beginTransaction();
        session.save(trip);
        session.getTransaction().commit();
        session.close();

    }
}

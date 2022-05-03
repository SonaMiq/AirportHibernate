package dao;

import Service.MySessionFactory;
import model.Trip;
import org.hibernate.Session;

public class TripDao {
    public void create(Trip trip){

        Session session= MySessionFactory.getFactory().openSession();
        session.beginTransaction();
        session.save(trip);
        session.getTransaction().commit();
        session.close();

    }
}

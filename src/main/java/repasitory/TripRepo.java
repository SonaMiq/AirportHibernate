package repasitory;

import Service.MySessionFactory;
import model.Trip;
import org.hibernate.Session;

import java.util.List;

public class TripRepo implements CrudRepo<Trip> {

    public void create(Trip trip) {

        Session session = MySessionFactory.getFactory().openSession();
        session.beginTransaction();
        session.save(trip);
        session.getTransaction().commit();
        session.close();

    }

    @Override
    public Trip read(Long id) {
        Session session = MySessionFactory.getFactory().openSession();
        session.beginTransaction();
        Trip trip = session.find(Trip.class, id);
        session.getTransaction().commit();
        session.close();
        return trip;
    }

    @Override
    public void update(Long id, Trip trip) {
        Session session = MySessionFactory.getFactory().openSession();
        session.beginTransaction();
        Trip trp = session.find(Trip.class, id);
        trp.setPlane(trip.getPlane());
        trp.setTimeIn(trip.getTimeIn());
        trp.setTimeOut(trip.getTimeOut());
        trp.setTownFrom(trip.getTownFrom());
        trp.setTownTo(trip.getTownTo());
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Trip> getAll() {
        return null;
    }
}

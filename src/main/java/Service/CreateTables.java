package Service;

import model.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateTables {
    public static void CreateTables() {
        Configuration configuration = new Configuration();
        configuration.addAnnotatedClass(Address.class);
        configuration.addAnnotatedClass(Company.class);
        configuration.addAnnotatedClass(Passenger.class);
        configuration.addAnnotatedClass(Trip.class);
        configuration.addAnnotatedClass(PassInTrip.class);
        SessionFactory factory = configuration.buildSessionFactory();
    }
}

package repasitory;

import Service.MySessionFactory;
import model.Company;
import org.hibernate.Session;

public class CompanyRepo {


    public void create(Company company) {

        Session session = MySessionFactory.getFactory().openSession();
        session.beginTransaction();
        session.save(company);
        session.getTransaction().commit();
        session.close();
    }

    public Company get(long id) {
        Session session = MySessionFactory.getFactory().openSession();
        session.beginTransaction();
        Company cmp = session.find(Company.class, id);
        session.getTransaction().commit();
        session.close();
        return cmp;
    }
}
